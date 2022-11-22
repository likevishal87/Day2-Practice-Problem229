package com.bridgelabz.forloop;

import java.util.Scanner;

public class SumOfNaturalNumber {
	static void checksum(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum = i + sum;
		}
		System.out.println("Sum of N Natural number: " + sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		checksum(num);
	}
}
