package kr.co.taoist.lec2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueJos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		StringBuffer sb = new StringBuffer();
		sb.append("<");
		
		Queue<Integer> q = new LinkedList<Integer>();
		for (int x=0;x<n;x++) {
			q.offer(x+1);
		}
		for (int i=0; i< n-1 ; i++) {
			for (int y=0; y < m-1 ; y++) {
				q.offer(q.poll());
			}
			sb.append(q.poll()+",");
		}
		sb.append(q.poll());
		sb.append(">");
		System.out.println(sb.toString());
	}

}
