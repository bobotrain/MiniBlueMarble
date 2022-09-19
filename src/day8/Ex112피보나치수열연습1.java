package day8;

import java.util.Scanner;

public class Ex112피보나치수열연습1 {
public static void main(String[] args) {
	
	//(실행결과의 예)
	// 몇 항까지 출력할까요? 9(엔터)
	// 1 1 2 3 5 8 13 21 34
	
	Scanner sc = new Scanner(System.in);
	System.out.print("몇 항까지 출력할까요? ");
	int num = sc.nextInt();
	int a = 1;
	int b = 1;
	int c;
	System.out.print(a + " " + b + " ");
	for(int i=1; i<=num-2; i++) {
		c = a + b; 
		System.out.print(c + " ");
		a = b;
		b = c;
	}
	
	
}
}
