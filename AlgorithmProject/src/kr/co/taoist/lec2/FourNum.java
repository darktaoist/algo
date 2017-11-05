package kr.co.taoist.lec2;

import java.util.Scanner;

/*
 * 예제 입력  복사
10 20 30 40

예제 출력  복사
4060
 */
public class FourNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        String A = String.valueOf(a);
        String B = String.valueOf(b);
        String C = String.valueOf(c);
        String D = String.valueOf(d);
        A += B;
        C += D;
        long ans1 = Long.valueOf(A);
        long ans2 = Long.valueOf(C);
        System.out.println(ans1+ans2);
    }
}
