package kr.co.taoist.lec3_4;

import java.util.Scanner;

public class SumDecomposit {

	public static long mod = 1000000000L;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[][] d = new long[k+1][n+1];
        d[0][0] = 1;
        for (int i=1; i<=k; i++) {
            for (int j=0; j<=n; j++) {
                for (int l=0; l<=j; l++) {
                    d[i][j] += d[i-1][j-l];
                    d[i][j] %= mod;
                }
            }
        }
        System.out.println(d[k][n]);
    }
}

/*
 * 
 * 0부터 N까지의 정수 K개를 더해서 그 합이 N이 되는 경우의 
 * 수를 구하는 프로그램을 작성하시오.

덧셈의 순서가 바뀐 경우는 다른 경우로 센다(1+2와 2+1은 서로 다른 경우).
 또한 한 개의 수를 여러 번 쓸 수도 있다.

입력
첫째 줄에 두 정수 N(1≤N≤200), K(1≤K≤200)가 주어진다.

출력
첫째 줄에 답을 1,000,000,000으로 나눈 나머지를 출력한다.

예제 입력  복사
20 2
예제 출력  복사
21
 * 
 * 
 */
