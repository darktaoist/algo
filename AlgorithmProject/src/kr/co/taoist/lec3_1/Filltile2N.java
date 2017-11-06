package kr.co.taoist.lec3_1;

import java.util.Scanner;

public class Filltile2N {

	static int[] d = new int[1001];

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		d[0] = 1;
		d[1] = 1;
		
		for (int i=2; i <= n ; i++) {
			d[i] = d[i-1] + d[i-2];
			d[i] %= 10007; 
		}
		System.out.println(d[n]);
	}
	
}
