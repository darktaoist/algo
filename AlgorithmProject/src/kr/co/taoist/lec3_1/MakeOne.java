package kr.co.taoist.lec3_1;

import java.util.Scanner;


/*
 * 
 * 예제 입력 2  복사
10

예제 출력 2  복사
3

 */
public class MakeOne {

	public static int[] d;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		 d = new int[n+1];
		 
		int g = go(n);
		
		 
		System.out.println(g);
	}
	
	public static int go(int n) {
		if (n==1)  { 
			return 0;
		}
		
		if (d[n] > 0) {
			return d[n];
		}
		
		d[n] = go(n-1) + 1;
		
		if (n%2 == 0) {
			int temp = go(n/2) +1;
			if (d[n] > temp){
				d[n] = temp;
			}
		}
		
		if(n%3 == 0) {
			int temp = go(n/3) + 1;
			if (d[n] > temp) {
				d[n] = temp;
			}
		}
		return d[n];
	}

}
