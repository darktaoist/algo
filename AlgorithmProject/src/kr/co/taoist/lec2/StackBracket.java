package kr.co.taoist.lec2;

import java.util.Scanner;

public class StackBracket {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String in = scanner.nextLine();
		
		int check = 0;
		for (int i=0;i<in.length();i++) {
			char c = in.charAt(i);
			
			if(c == '(') {
				check++;
			} else if (c == ')')
				check--;
			if(check < 0) {
				System.out.println("NO");
			}
		}

		if (check==0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
	}

}
