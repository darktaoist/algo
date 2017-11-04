package kr.co.taoist.lec1;

import java.util.Scanner;

public class WriteStar2 {

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
		for (int i=0;i<arr.length;i++){
			
			int m = (max-arr[i]) /2;
			for (int j=0;j<m;j++) {
				System.out.print(" ");
			}
			for (int y=0;y<arr[i];y++) {
				if(y==0 || y==(arr[i]-1) || (i==(arr.length-1))) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}   	
		}
	
}
