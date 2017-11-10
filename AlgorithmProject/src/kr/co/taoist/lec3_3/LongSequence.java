package kr.co.taoist.lec3_3;

import java.util.Scanner;

public class LongSequence {

	 public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] a = new int[n];
	        for (int i=0; i<n; i++) {
	            a[i] = sc.nextInt();
	        }
	        int[] d = new int[n];
	        for (int i=0; i<n; i++) {
	            d[i] = 1;
	            for (int j=0; j<i; j++) {
	                if (a[j] < a[i] && d[i] < d[j]+1) {
	                    d[i] = d[j]+1;
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

����
���� A�� �־����� ��, ���� �� �����ϴ� �κ� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

���� ���, ���� A = {10, 20, 10, 30, 20, 50} �� ��쿡 ���� �� �����ϴ� �κ� ������ A = {10, 20, 10, 30, 20, 50} �̰�, ���̴� 4�̴�.

�Է�
ù° �ٿ� ���� A�� ũ�� N (1 �� N �� 1,000)�� �־�����.

��° �ٿ��� ���� A�� �̷�� �ִ� Ai�� �־�����. (1 �� Ai �� 1,000)

���
ù° �ٿ� ���� A�� ���� �� �����ϴ� �κ� ������ ���̸� ����Ѵ�.

���� �Է�  ����
6
10 20 10 30 20 50
���� ���  ����
4

*/