package kr.co.taoist.lec2;

import java.util.Scanner;

/*
 * 예제 입력  복사
This is String
SPACE    1    SPACE
 S a M p L e I n P u T     
0L1A2S3T4L5I6N7E8

예제 출력  복사
10 2 0 2
0 10 1 8
5 6 0 16
0 8 9 0

 */
public class AlphabatAnalysis {
	 public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        while (sc.hasNextLine()) {
	            String s = sc.nextLine();
	            int lower = 0;
	            int upper = 0;
	            int digit = 0;
	            int space = 0;
	            for (int i=0; i<s.length(); i++) {
	                char c = s.charAt(i);
	                if ('A' <= c && c <= 'Z') {
	                    upper += 1;
	                } else if ('a' <= c && c <= 'z') {
	                    lower += 1;
	                } else if ('0' <= c && c <= '9') {
	                    digit += 1;
	                } else if (c == ' ') {
	                    space += 1;
	                }
	            }
	            System.out.println(lower + " " + upper + " " + digit + " " + space);
	        }
	    }
}
