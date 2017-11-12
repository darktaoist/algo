package kr.co.taoist.lec5;

import java.util.Scanner;

public class Factorials {

	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 1;
        for (int i=2; i<=n; i++) {
            ans *= i;
        }
        System.out.println(ans);
    }

}

/*
 * 
 * 보다 크거나 같은 정수 N이 주어진다. 
 * 이 때, N!을 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 정수 N(0 ≤ N ≤ 12)가 주어진다.

출력
첫째 줄에 N!을 출력한다.

예제 입력  복사
10
예제 출력  복사
3628800

 * 
 * */
