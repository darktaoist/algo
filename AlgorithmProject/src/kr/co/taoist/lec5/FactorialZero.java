package kr.co.taoist.lec5;

import java.util.Scanner;

public class FactorialZero {

	 public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int ans = 0;
	        for (int i=5; i<=n; i*=5) {
	            ans += n/i;
	        }
	        System.out.println(ans);
	    }

}

/*
 * N!에서 뒤에서부터 처음 0이 아닌 숫자가
나올 때까지 0의 개수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 N이 주어진다. (0 ≤ N ≤ 500)

출력
첫째 줄에 구한 0의 개수를 출력한다.

예제 입력  복사
10
예제 출력  복사
2
 */