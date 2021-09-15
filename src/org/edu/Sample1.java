package org.edu;

import java.util.Scanner;

public class Sample1 {
	public static void main(String[] args) {

		String oper;
		Scanner sc = new Scanner(System.in);
		System.out.println("ADD,SUB,MUL,DIV");

		oper = sc.next();

		if (oper.equals("ADD")) {
			System.out.println("========ADD========");
			System.out.println("Enter a value");
			int a = sc.nextInt();
			System.out.println("Enter b value");
			int b = sc.nextInt();

			int c = a + b;
			System.out.println("a+b = " + c);
			if (c == 50) {
				System.out.println("valid");
			} else {
				System.out.println("invalid");
			}

		}
//		oper = sc.next();

		if (oper.equals("SUB")) {
			System.out.println("========SUB=======");
			System.out.println("Enter a value");
			int a = sc.nextInt();
			System.out.println("Enter b value");
			int b = sc.nextInt();

			int c = a - b;
			System.out.println("a-b = " + c);
			if (c == 50) {
				System.out.println("valid");
			} else {
				System.out.println("invalid");
			}

		}
//		oper = sc.next();

		if (oper.equals("MUL")) {
			System.out.println("========MUL=======");
			System.out.println("Enter a value");
			int a = sc.nextInt();
			System.out.println("Enter b value");
			int b = sc.nextInt();

			int c = a * b;
			System.out.println("a*b = " + c);
			if (c == 50) {
				System.out.println("valid");
			} else {
				System.out.println("invalid");
			}

		}
//		oper = sc.next();
		if (oper.equals("DIV")) {
			System.out.println("========DIV=======");
			System.out.println("Enter a value");
			int a = sc.nextInt();
			System.out.println("Enter b value");
			int b = sc.nextInt();

			int c = a / b;
			System.out.println("a/b = " + c);
			if (c == 50) {
				System.out.println("valid");
			} else {
				System.out.println("invalid");
			}

		}

	}
}
