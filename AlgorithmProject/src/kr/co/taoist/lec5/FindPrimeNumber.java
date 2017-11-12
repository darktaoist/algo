package kr.co.taoist.lec5;

import java.util.Scanner;

public class FindPrimeNumber {

	 public static boolean is_prime(int x) {
	        if (x <= 1) {
	            return false;
	        } else if (x == 2) {
	            return true;
	        }
	        for (int i=2; i*i <= x; i++) {
	            if (x % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int ans = 0;
	        while (n-- > 0) {
	            if (is_prime(sc.nextInt())) {
	                ans += 1;
	            }
	        }
	        System.out.println(ans);
	    }

}

/*
주어진 숫자들 중 소수가 몇 개인지 
찾아서 출력하는 프로그램을 작성하시오.

입력
첫 줄에 수의 개수 N이 주어진다. N은 100이하이다.
 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.

출력
주어진 수들 중 소수의 개수를 출력한다.

예제 입력  복사
4
1 3 5 7
예제 출력  복사
3
*/