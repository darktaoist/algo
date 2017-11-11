package kr.co.taoist.lec3_3;

import java.util.Scanner;

public class ContinuesPlus {

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
	            if (i == 0) {
	                continue;
	            }
	            if (d[i] < d[i-1] + a[i]) {
	                d[i] = d[i-1] + a[i];
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
n���� ������ �̷���� ������ ������ �־�����. 
�츮�� �� �� ���ӵ� �� ���� ���ڸ� �����ؼ� ���� �� 
�ִ� �� �� ���� ū ���� ���Ϸ��� �Ѵ�. ��, ���ڴ� �� �� �̻� �����ؾ� �Ѵ�.

���� �� 10, -4, 3, 1, 5, 6, -35, 12, 21, -1 
�̶�� ������ �־����ٰ� ����. 
���⼭ ������ 12+21�� 33�� ������ �ȴ�.

�Է�
ù° �ٿ� ���� n(1��n��100,000)�� �־����� 
��° �ٿ��� n���� ������ �̷���� ������ �־�����. 
���� -1,000���� ũ�ų� ����, 1,000���� �۰ų� ���� �����̴�.

���
ù° �ٿ� ���� ����Ѵ�.

���� �Է�  ����
10
10 -4 3 1 5 6 -35 12 21 -1
���� ���  ����
33
*/