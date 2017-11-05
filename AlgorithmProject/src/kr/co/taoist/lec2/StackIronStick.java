package kr.co.taoist.lec2;

import java.util.Scanner;
import java.util.Stack;

public class StackIronStick {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String in = scanner.nextLine();
		int ans = 0;
		Stack<Integer> s = new Stack<Integer>();
		
		for (int i=0; i< in.length();i++) {
			char c = in.charAt(i);
			if (c == '(') {
				s.push(i);
			} else if (c == ')') {
				if (s.peek()+1 == i) {
					s.pop();
					ans = ans+s.size();
				} else {
					s.pop();
					ans = ans+1;
				}
			}
		}
		System.out.println("ans="+ans);
		scanner.close();
	}
}
