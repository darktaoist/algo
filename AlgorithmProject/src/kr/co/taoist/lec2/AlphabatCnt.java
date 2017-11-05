package kr.co.taoist.lec2;

import java.util.Scanner;

/*
 * 
 * 예제 입력  복사
		baekjoon
	
   예제 출력  복사
		1 1 0 0 1 0 0 0 0 1 1 0 0 1 2 0 0 0 0 0 0 0 0 0 0 0
 */
public class AlphabatCnt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int[] _int = new int[26];
		
		for (int i=0; i < s.length(); i++) {
			_int[s.charAt(i) - 'a'] += 1; 
		}
		
		for (int j=0; j< _int.length-1; j++) {
			System.out.print(_int[j]+",");
		}
		System.out.print(_int[_int.length-1]);
		System.out.println();
	}

}
