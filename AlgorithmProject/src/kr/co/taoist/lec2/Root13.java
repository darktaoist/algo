package kr.co.taoist.lec2;

import java.util.Scanner;

/*
 * 
 * 예제 입력  복사
Baekjoon Online Judge

예제 출력  복사
Onrxwbba Bayvar Whqtr
 */
public class Root13 {

	 public static String rot13(String s) {
	        String ans = "";
	        for (int i=0; i<s.length(); i++) {
	            char c = s.charAt(i);
	            if (c >= 'a' && c <= 'm') {   
	                c += 13;   
	            } else if (c >= 'n' && c <= 'z') {    
	                c -= 13;   
	            } else if(c >= 'A' && c <= 'M') { 
	                c += 13;   
	            } else if(c >= 'N' && c <= 'Z') { 
	                c -= 13;   
	            }
	            ans += c;
	        }
	        return ans;
	    }
	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        String s = sc.nextLine();
	        System.out.println(rot13(s));
	    }

}
