package kr.co.taoist.lec1;

public class Test2 {
		public static void main(String args[]) {
			for (int i=1; i <= 4; i++) {
				int max = (i+(i-1));
				
				for (int k=1; k<=7/2;k++) {
					System.out.print(" ");
				}
				for (int j=1; j <= max ; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}
}
