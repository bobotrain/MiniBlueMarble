package day7;

import java.util.Scanner;

public class Ex102 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	/*[고급]
			(실행결과의 예) n : 5 (엔터)
					    A
					   BB
					  CCC
					 DDDD
					EEEEE
					*/
	
	System.out.print("n : ");
	int n = sc.nextInt();
	char a = 65;
	for(int i=1; i<=n; i++) {
		for(int j=1; j<=n-i; j++) {
			System.out.print(" ");
		}
		for(int j=1; j<=i; j++) {
			System.out.print(a);
		}
		a++;
		System.out.println();
	}
	
	
}
}
