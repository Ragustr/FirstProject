package org.edu;

import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("........ADD.........");
		int a = sc.nextInt();
		System.out.println("a value is   " + a);
		int b = sc.nextInt();
		System.err.println("b value  is  " + b);
		int c = a + b;
		if (c == 50) {
			System.out.println("valid");
		} else {
			System.out.println("invalid");
		}
		
		System.out.println("=======SUB=======");
				int c1 = a - b;
		if (c1 == 50) {
			System.out.println("valid");
		} else {
			System.out.println("invalid");
		}
		System.out.println("........DIV.........");
		int c2 = a / b;
		if (c1 == 50) {
			System.out.println("valid");
		} else {
			System.out.println("invalid");
		}
		System.out.println("========MUL=====");
		int c3 = a * b;
		if (c1 == 50) {
			System.out.println("valid");
		} else {
			System.out.println("invalid");
		}
	}

}
