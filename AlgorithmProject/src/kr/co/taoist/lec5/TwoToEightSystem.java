package kr.co.taoist.lec5;

import java.util.Scanner;

public class TwoToEightSystem {

	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        if (n%3 == 1) {
            System.out.print(s.charAt(0));
        } else if (n%3 == 2) {
            System.out.print((s.charAt(0)-'0')*2 + (s.charAt(1)-'0'));
        }
        for (int i=n%3; i<n; i+=3) {
            System.out.print((s.charAt(i)-'0')*4 + (s.charAt(i+1)-'0')*2 + (s.charAt(i+2)-'0'));
        }
        System.out.println();
    }

}

/*
2진수가 주어졌을 때, 8진수로 변환하는 
프로그램을 작성하시오.

입력
첫째 줄에 2진수가 주어진다. 
주어지는 수의 길이는 1,000,000을 넘지 않는다.

출력
첫째 줄에 주어진 수를 8진수로 변환하여 출력한다.

예제 입력  복사
11001100
예제 출력  복사
314
*/
