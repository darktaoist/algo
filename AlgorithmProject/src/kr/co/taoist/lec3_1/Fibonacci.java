package kr.co.taoist.lec3_1;

import java.util.Scanner;

public class Fibonacci {

	public static int memo[];
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		memo = new int[100];
		int n = scanner.nextInt();
		int nn = fibonacci(n);
		System.out.println(nn);
	}
	
	public static int fibonacci(int n) {
		if (n <= 1) return n;
		if (memo[n] > 0) return memo[n];
		
		memo[n]= fibonacci(n-1) + fibonacci(n-2);
		//System.out.println(memo[n]);
		return memo[n];
		
	}

}
