package kr.co.taoist.lec5;

import java.util.Scanner;

public class GCD_LCD {

	 public static int gcd(int x, int y) {
	        if (y == 0) {
	            return x;
	        } else {
	            return gcd(y, x%y);
	        }
	    }
	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int g = gcd(a, b);
	        int l = a * b / g;
	        System.out.println(g);
	        System.out.println(l);
	    }

}

/*
 두 개의 자연수를 입력받아 최대 공약수와 최소
  공배수를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에는 두 개의 자연수가 주어진다. 
이 둘은 10,000이하의 자연수이며 사이에 한 칸의 공백이 주어진다.

출력
첫째 줄에는 입력으로 주어진 두 수의 
최대공약수를,둘째 줄에는 입력으로 주어진 두 수의 
최소 공배수를 출력한다.

예제 입력  복사
24 18
예제 출력  복사
6
72
*/
