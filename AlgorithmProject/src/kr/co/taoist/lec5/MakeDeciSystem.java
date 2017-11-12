package kr.co.taoist.lec5;

import java.util.Scanner;

public class MakeDeciSystem {

	 public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        String[] line = sc.nextLine().split(" ");
	        String s = line[0];
	        int b = Integer.valueOf(line[1]);
	        int ans = 0;
	        for (int i=0; i<s.length(); i++) {
	            char c = s.charAt(i);
	            if ('0' <= c && c <= '9') {
	                ans = ans * b + (c - '0');
	            } else {
	                ans = ans * b + (c - 'A' + 10);
	            }
	        }
	        System.out.println(ans);
	    }

}

/*
B진법 수 N이 주어진다. 이 수를 10진법으로 
바꿔 출력하는 프로그램을 작성하시오.

10진법을 넘어가는 진법은 숫자로 표시할 수 
없는 자리가 있다. 이런 경우에는 다음과 같이 
파벳 대문자를 사용한다.

A: 10, B: 11, ..., F: 16, ..., Y: 34, Z: 35

입력
첫째 줄에 N과 B가 주어진다. (2 ≤ B ≤ 36)

B진법 수 N을 10진법으로 바꾸면, 항상 10억보다 작거나 같다.

출력
첫째 줄에 B진법 수 N을 10진법으로 출력한다.

예제 입력  복사
ZZZZZ 36
예제 출력  복사
60466175
*/