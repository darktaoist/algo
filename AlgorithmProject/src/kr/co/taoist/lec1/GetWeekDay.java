package kr.co.taoist.lec1;

import java.util.Scanner;

public class GetWeekDay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mon = sc.nextInt();
		int date = sc.nextInt();
		String[] str = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		int total = 0;
		for (int x=1; x< mon ; x++) {
			if (x==1 || x==3 || x==5 ||x==7 ||x==8 ||x==10 || x==12 ) {
				total += 31;
			} else if (x==4 || x==6 || x==9 ||x==11) {
				total += 30;
			} else {
				total += 28;
			}
		}
		total = total+date;
		int nam = total % 7;
		System.out.println(str[nam]);
		

	}

}
