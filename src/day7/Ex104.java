package day7;

import java.util.Scanner;

public class Ex104 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	/*
	 Q605.[고급]
	(실행결과의 예) n : 4 (엔터)
			   1
			  2 2 
			 3 3 3 
			4 4 4 4 
	 */
	System.out.print("n : ");
	int n = sc.nextInt();
	int num=1;
	for(int i=1; i<=n; i++) {
		for(int j=1; j<=n-i; j++) {
			System.out.print(" ");
		}//inner1
		for(int j=1; 2*j-1<=2*i-1; j++) {
			System.out.print(num+ " " );	
		}//inner2
		num++;
		System.out.println();
	}//outer for
	
}
}
