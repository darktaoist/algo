package kr.co.taoist.lec3_3;

import java.util.Scanner;

public class BitonicSequence {

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
        int[] d2 = new int[n];
        for (int i=n-1; i>=0; i--) {
            d2[i] = 1;
            for (int j=i+1; j<n; j++) {
                if (a[i] > a[j] && d2[j]+1 > d2[i]) {
                    d2[i] = d2[j]+1;
                }
            }
        }
        int ans = d[0]+d2[0]-1;
        for (int i=0; i<n; i++) {
            if (ans < d[i]+d2[i]-1) {
                ans = d[i]+d2[i]-1;
            }
        }
        System.out.println(ans);
    }
    
}

/**
 * 
 * ���� S�� � �� Sk�� �������� S1 < S2 < ... Sk-1 < Sk > Sk+1 > ... SN-1 > 
 * SN�� �����Ѵٸ�, �� ������ ������� �����̶�� �Ѵ�.

���� ���, {10, 20, 30, 25, 20}�� {10, 20, 30, 40}, {50, 40, 25, 10} �� 
������� ����������,  {1, 2, 3, 2, 1, 2, 3, 2, 1}�� {10, 20, 30, 40, 20, 30} 
�� ������� ������ �ƴϴ�.

���� A�� �־����� ��, �� ������ �κ� ���� �� ������� �����̸鼭 
���� �� ������ ���̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� ���� A�� ũ�� N�� �־�����, ��° �ٿ��� ���� A�� �̷�� 
�ִ� Ai�� �־�����. (1 �� N �� 1,000, 1 �� Ai �� 1,000)

���
ù° �ٿ� ���� A�� �κ� ���� �߿��� ���� �� ������� ������ ���̸� ����Ѵ�.

���� �Է�  ����
10
1 5 2 1 4 3 4 5 2 1
���� ���  ����
7

*/
