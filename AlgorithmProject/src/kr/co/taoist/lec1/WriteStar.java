package kr.co.taoist.lec1;

import java.util.Scanner;

public class WriteStar {
	public static void main (String args[]) {
		Scanner sc  = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int[num];
		int x = 1;
		for (int i = 1; i <= num; i++) {
			arr[i-1] = x;
			x+=2;
		}
		
		int max = arr[arr.length-1];
		
		System.out.println(max);
		for (int i=0;i<arr.length;i++) {
			int mk = max / arr[i];
			int mx = max % arr[i];
			if(arr[i]==1) mx = max;
			if (mx==0 && arr[i]!=max) {
				for (int xx=0;xx<mk;xx++) {
					System.out.print(" ");
				}
				for (int y=0;y<arr[i];y++) {
					System.out.print("*");
				}
				System.out.println("");
			} else {
				int mmax = mx / 2;
				for (int xxx=0; xxx < mmax; xxx++) {
					System.out.print(" ");
				}
				
				for (int y=0;y<arr[i];y++) {
					System.out.print("*");
				}
				System.out.println("");
			}
			
			//System.out.println(arr[i]);
		}
		
	}
}
