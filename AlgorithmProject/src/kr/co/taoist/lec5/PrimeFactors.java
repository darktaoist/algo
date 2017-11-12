package kr.co.taoist.lec5;

import java.util.Scanner;

public class PrimeFactors {

	 public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        for (int i=2; i*i <= n; i++) {
	            while (n%i == 0) {
	                System.out.println(i);
	                n /= i;
	            }
	        }
	        if (n > 1) {
	            System.out.println(n);
	        }
	    }
}

/*
정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.

입력
첫째 줄에 정수 N (1 ≤ N ≤ 10,000,000)이 주어진다.

출력
N의 인수를 한 줄에 하나씩 증가하는 순서대로 출력한다.

예제 입력  복사
72
예제 출력  복사
2
2
2
3
3
예제 입력 2  복사
3
예제 출력 2  복사
3
예제 입력 3  복사
6
예제 출력 3  복사
2
3
예제 입력 4  복사
2
예제 출력 4  복사
2
예제 입력 5  복사
9991
예제 출력 5  복사
97
103
*/