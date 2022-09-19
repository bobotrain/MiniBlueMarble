package day5;

import java.util.Scanner;

public class Ex6반복문연습 {
public static void main(String[] args) {
	
	//연습 1
	// 실행결과의 예 : 몇 번을 반복할까요? 4(엔터)
	// 1번 반복.
	// 2번 반복.
	// 3번 반복.
	// 4번 반복.
	// 반복 끝.
	
	Scanner sc = new Scanner(System.in);
	System.out.print("몇 번을 반복할까요? ");
	int i = sc.nextInt();
	int j;
	for(j=1; j<=i; j++) {
		System.out.println(j + "번 반복.");
	}
	System.out.println("반복 끝.");
	System.out.println("-------------------------------");
	
	//연습2 
	//1부터 100까지의 정수들 중에서 짝수만 출력. 
	int i1;
	for(i1=1; i1<=100; i1++) {
		if(i1 % 2==0) {
			System.out.print(i1 + " ");
		}
	}
	System.out.println();
	System.out.println("------------------------------------");
	
	//연습3 
	//1부터 100까지의 정수들 중에서 2의배수, 3의배수, 그리고 7의 배수를 출력
	int i2;
	for(i2=1; i2<=100; i2++) {
		if(i2 % 2==0 || i2 % 3 ==0 || i2 % 7 == 0) {
			System.out.print(i2 + " ");
		}
	}
	System.out.println();
	System.out.println("---------------------------------------");
}
}
