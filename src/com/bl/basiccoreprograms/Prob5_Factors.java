package com.bl.basiccoreprograms;

import java.util.Scanner;

public class Prob5_Factors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number ");
		int n = sc.nextInt();

		primeFactors(n);
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	static void primeFactors(int n) {
		for (int i = 1; i * i <= n; i++) {
			int t = n % i;
			if (t == 0) {
				if (isPrime(i)) {
					System.out.print(i + " ");
				}
			}
		}
	}
}
