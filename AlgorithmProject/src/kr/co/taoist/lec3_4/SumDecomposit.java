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
 * 0���� N������ ���� K���� ���ؼ� �� ���� N�� �Ǵ� ����� 
 * ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

������ ������ �ٲ� ���� �ٸ� ���� ����(1+2�� 2+1�� ���� �ٸ� ���).
 ���� �� ���� ���� ���� �� �� ���� �ִ�.

�Է�
ù° �ٿ� �� ���� N(1��N��200), K(1��K��200)�� �־�����.

���
ù° �ٿ� ���� 1,000,000,000���� ���� �������� ����Ѵ�.

���� �Է�  ����
20 2
���� ���  ����
21
 * 
 * 
 */
