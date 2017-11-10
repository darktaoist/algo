package kr.co.taoist.lec3_3;

import java.util.Scanner;

public class BigSequence {

	 public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] a = new int[n];
	        for (int i=0; i<n; i++) {
	            a[i] = sc.nextInt();
	        }
	        int[] d = new int[n];
	        for (int i=0; i<n; i++) {
	            d[i] = a[i];
	            for (int j=0; j<i; j++) {
	                if (a[j] < a[i] && d[i] < d[j]+a[i]) {
	                    d[i] = d[j]+a[i];
	                }
	            }
	        }
	        int ans = d[0];
	        for (int i=0; i<n; i++) {
	            if (ans < d[i]) {
	                ans = d[i];
	            }
	        }
	        System.out.println(ans);
	    }

}

/**
���� A�� �־����� ��, �� ������ ���� �κ� ���� �߿��� ���� ���� ū ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

���� ���, ���� A = {1, 100, 2, 50, 60, 3, 5, 6, 7, 8} �� ��쿡 ���� ���� ū ���� �κ� ������ A = {1, 100, 2, 50, 60, 3, 5, 6, 7, 8} �̰�, ���� 113�̴�.

�Է�
ù° �ٿ� ���� A�� ũ�� N (1 �� N �� 1,000)�� �־�����.

��° �ٿ��� ���� A�� �̷�� �ִ� Ai�� �־�����. (1 �� Ai �� 1,000)

���
ù° �ٿ� ���� A�� ���� ���� ū ���� �κ� ������ ���� ����Ѵ�.

���� �Է�  ����
10
1 100 2 50 60 3 5 6 7 8
���� ���  ����
113
*/