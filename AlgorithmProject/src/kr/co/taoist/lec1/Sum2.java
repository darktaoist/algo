package kr.co.taoist.lec1;

import java.util.*;

/*
 * 완료
 */
public class Sum2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a, b;    
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}