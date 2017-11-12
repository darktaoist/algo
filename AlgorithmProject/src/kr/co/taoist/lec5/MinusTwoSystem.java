package kr.co.taoist.lec5;

import java.util.Scanner;

public class MinusTwoSystem {

	public static void go(int n) {
        if (n == 0) {
            return;
        }
        if (n%2 == 0) {
            go(-(n/2));
            System.out.print(0);
        } else {
            if (n > 0) {
                go(-(n/2));
            } else {
                go((-n+1)/2);
            }
            System.out.print(1);
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println(0);
        } else {
            go(n);
            System.out.println();
        }
    }

}

/*
 * -2진법은 부호 없는 2진수로 표현이 된다. 
 * 2진법에서는 2^0, 2^1, 2^2, 2^3이 표현 되지만 
 * -2진법에서는 (-2)^0 = 1, (-2)^1 = -2, (-2)^2 = 4, (-2)^3 = -8을 
 * 표현한다. 10진수로 1부터 표현하자면 
 * 1, 110, 111, 100, 101, 11010, 11011, 11000, 11001 등이다.

10진법의 수를 입력 받아서 -2진수를 출력하는 프로그램을 작성하시오.

입력
첫 줄에 10진법으로 표현된 수 N(-2,000,000,000≤N≤2,000,000,000)이 주어진다.

출력
-2진법 수를 출력한다.

예제 입력  복사
-13
예제 출력  복사
110111
*/
