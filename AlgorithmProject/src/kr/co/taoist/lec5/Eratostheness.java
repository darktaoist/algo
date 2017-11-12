package kr.co.taoist.lec5;

import java.util.Scanner;

public class Eratostheness {

	 public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int m = sc.nextInt();
	        boolean[] check = new boolean[m+1];
	        check[0] = check[1] = true;
	        for (int i=2; i*i <= m; i++) {
	            if (check[i] == true) {
	                continue;
	            }
	            for (int j=i+i; j<=m; j+=i) {
	                check[j] = true;
	            }
	        }
	        for (int i=n; i<=m; i++) {
	            if (check[i] == false) {
	                System.out.println(i);
	            }
	        }
	    }

}

/*
M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 자연수 M과 N이 빈 칸을 
사이에 두고 주어진다. (1≤M≤N≤1,000,000)

출력
한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.

예제 입력  복사
3 16
예제 출력  복사
3
5
7
11
13
*/