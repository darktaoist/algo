package kr.co.taoist.lec2;

import java.util.Arrays;
import java.util.Scanner;


/*
 * 예제 입력  복사
baekjoon

예제 출력  복사
aekjoon
baekjoon
ekjoon
joon
kjoon
n
on
oon

 */
public class JeupMiSa {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        String[] a = new String[n];
        for (int i=0; i<n; i++) {
            a[i] = s.substring(i);
        }
        Arrays.sort(a);
        for (int i=0; i<n; i++) {
            System.out.println(a[i]);
        }
    }
}