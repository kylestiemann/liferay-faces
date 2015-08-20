/**
 * Copyright (c) 2000-2015 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.liferay.faces.maven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.project.MavenProject;

import com.github.javaparser.ASTHelper;
import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseException;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.body.BodyDeclaration;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.TypeDeclaration;
import com.github.javaparser.ast.comments.LineComment;
import com.github.javaparser.ast.expr.AssignExpr;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.expr.QualifiedNameExpr;
import com.github.javaparser.ast.expr.SingleMemberAnnotationExpr;
import com.github.javaparser.ast.expr.StringLiteralExpr;


/**
 * @author  Kyle Stiemann
 * @goal    copy-method
 */
public class CopyMethodMojo extends AbstractMojo {

	/**
	 * @parameter  default-value="${project}"
	 * @required
	 * @readonly
	 */
	private MavenProject project;

	/**
	 * @parameter
	 * @required
	 */
	private String copyFromClass;

	/**
	 * @parameter
	 * @required
	 */
	private String methodSignature;

	/**
	 * @parameter
	 * @required
	 */
	private String copyToClass;

	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {

		try {

			CompilationUnit copyFromClassCompilationUnit = getCompilationUnit(copyFromClass);
			MethodDeclaration copyMethodDeclaration = getMethodDeclaration(copyFromClassCompilationUnit,
					methodSignature);
			List<ImportDeclaration> requiredImports = getRequiredImports(copyFromClassCompilationUnit,
					copyMethodDeclaration);
			CompilationUnit copyToClassCompilationUnit = getCompilationUnit(copyToClass);
			copyMethodToClass(methodSignature, copyMethodDeclaration, requiredImports, copyToClassCompilationUnit);
		}
		catch (ClassNotFoundException e) {
			throw new MojoExecutionException(e.getMessage());
		}
		catch (NoSuchMethodException e) {
			throw new MojoExecutionException(e.getMessage());
		}
	}

	private void copyMethodToClass(String copyMethodSignature, MethodDeclaration copyMethodDeclaration,
		List<ImportDeclaration> requiredImports, CompilationUnit copyToClassCompilationUnit)
		throws MojoExecutionException {

		List<ImportDeclaration> importDeclarations = copyToClassCompilationUnit.getImports();

		for (ImportDeclaration requiredImport : requiredImports) {

			if (!importDeclarations.contains(requiredImport)) {
				importDeclarations.add(requiredImport);
			}
		}

		List<TypeDeclaration> copyToClassTypes = copyToClassCompilationUnit.getTypes();

		for (TypeDeclaration type : copyToClassTypes) {

			if (type instanceof ClassOrInterfaceDeclaration) {

				List<BodyDeclaration> members = type.getMembers();
				Iterator<BodyDeclaration> iterator = members.iterator();

				while (iterator.hasNext()) {

					BodyDeclaration member = iterator.next();

					if (member instanceof MethodDeclaration) {

						MethodDeclaration methodDeclaration = (MethodDeclaration) member;
						String methodSignature = methodDeclaration.getDeclarationAsString();

						if (copyMethodSignature.equals(methodSignature)) {
							iterator.remove();
						}
					}
				}

				AssignExpr assignCopyMethodMojoToValue = new AssignExpr(new NameExpr("value"),
						new StringLiteralExpr("com.liferay.faces.maven.CopyMethodMojo"), AssignExpr.Operator.assign);
				SingleMemberAnnotationExpr generatedAnnotation = new SingleMemberAnnotationExpr(new NameExpr(
							"Generated"), assignCopyMethodMojoToValue);
				copyMethodDeclaration.setComment(new LineComment("This method was copied from: " + copyFromClass));
				copyMethodDeclaration.getAnnotations().add(generatedAnnotation);
				ASTHelper.addMember(type, copyMethodDeclaration);

				String fullFileName = getFullFileName(copyToClass);
				FileWriter fileWriter = null;

				try {
					fileWriter = new FileWriter(fullFileName);
				}
				catch (IOException e) {
					throw new MojoExecutionException(e.getMessage());
				}

				try {
					fileWriter.append(copyToClassCompilationUnit.toString());
				}
				catch (IOException e) {
					throw new MojoExecutionException(e.getMessage());
				}
				finally {

					try {
						fileWriter.close();
					}
					catch (IOException e) {
						throw new MojoExecutionException(e.getMessage());
					}
				}

				return;
			}
		}
	}

	private ImportDeclaration createGeneratedImport() {

		NameExpr javaxNameExpr = new NameExpr("javax");
		QualifiedNameExpr javaxAnnotationQualifiedNameExpr = new QualifiedNameExpr(javaxNameExpr, "annotation");
		QualifiedNameExpr javaxAnnotationGeneratedQualifiedNameExpr = new QualifiedNameExpr(
				javaxAnnotationQualifiedNameExpr, "Generated");

		return new ImportDeclaration(javaxAnnotationGeneratedQualifiedNameExpr, false, false);
	}

	private CompilationUnit getCompilationUnit(String fullyQualifiedClassName) throws ClassNotFoundException,
		MojoExecutionException {

		FileInputStream fileInputStream = null;
		CompilationUnit compilationUnit = null;

		try {

			String fullFileName = getFullFileName(fullyQualifiedClassName);
			fileInputStream = new FileInputStream(fullFileName);
		}
		catch (FileNotFoundException e) {
			throw new ClassNotFoundException("Failed to find " + fullyQualifiedClassName, e);
		}

		try {
			compilationUnit = JavaParser.parse(fileInputStream, "UTF-8", true);
		}
		catch (ParseException e) {
			throw new MojoExecutionException("Failed to parse " + fullyQualifiedClassName, e);
		}
		finally {

			try {
				fileInputStream.close();
			}
			catch (IOException e) {
				throw new MojoExecutionException(e.getMessage());
			}
		}

		return compilationUnit;
	}

	private String getFullFileName(String fullyQualifiedClassName) {

		final String sourceDirectory = project.getBuild().getSourceDirectory();
		StringBuilder stringBuilder = new StringBuilder(4);
		stringBuilder.append(sourceDirectory);
		stringBuilder.append("/");
		stringBuilder.append(fullyQualifiedClassName.replace(".", "/"));
		stringBuilder.append(".java");

		return stringBuilder.toString();
	}

	private MethodDeclaration getMethodDeclaration(CompilationUnit copyFromClassCompilationUnit,
		String copyMethodSignature) throws NoSuchMethodException {

		List<TypeDeclaration> copyFromClassTypes = copyFromClassCompilationUnit.getTypes();

		for (TypeDeclaration type : copyFromClassTypes) {

			if (type instanceof ClassOrInterfaceDeclaration) {

				List<BodyDeclaration> members = type.getMembers();

				for (BodyDeclaration member : members) {

					if (member instanceof MethodDeclaration) {

						MethodDeclaration methodDeclaration = (MethodDeclaration) member;
						String methodSignature = methodDeclaration.getDeclarationAsString();

						if (copyMethodSignature.equals(methodSignature)) {
							return methodDeclaration;
						}
					}
				}
			}
		}

		throw new NoSuchMethodException("Failed to find " + copyMethodSignature);
	}

	private List<ImportDeclaration> getRequiredImports(CompilationUnit copyFromClassCompilationUnit,
		MethodDeclaration copyMethodDeclaration) {

		final List<ImportDeclaration> copyFromClassImports = copyFromClassCompilationUnit.getImports();
		List<ImportDeclaration> requiredImports = new ArrayList<ImportDeclaration>();
		String methodAsString = copyMethodDeclaration.toString();

		for (ImportDeclaration importDeclaration : copyFromClassImports) {

			String importClassName = importDeclaration.getName().getName();
			Pattern importClassNameWordRegex = Pattern.compile("\\b" + importClassName + "\\b");

			if (importClassNameWordRegex.matcher(methodAsString).find()) {
				requiredImports.add(importDeclaration);
			}
		}

		requiredImports.add(createGeneratedImport());

		return requiredImports;
	}
}
