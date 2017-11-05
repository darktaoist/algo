package kr.co.taoist.lec2;

import java.util.Scanner;

/*
 * 예제 입력  복사
baekjoon
예제 출력  복사
1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
 */
public class AlphabatPosition {

	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] position = new int[26];
        for (int i=0; i<26; i++) {
            position[i] = -1;
        }
        for (int i=0; i<s.length(); i++) {
            int c = s.charAt(i) - 'a';
            if (position[c] == -1) {
                position[c] = i;
            }
        }
        for (int i=0; i<26; i++) {
            System.out.print(position[i] + " ");
        }
        System.out.println();
    }
	
}
