package day6;

import java.util.Scanner;

public class Ex1for문연습2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	//연습1
	//(실행결과의 예) 입력 : 7(엔터)
	// 7x1=7
	// . ...
	// 7x9=63
	System.out.print("입력 : ");
	int num1=sc.nextInt();
	int ii;
	int sum1;
	for(ii = 1; ii<=9; ii++) {
		sum1= num1*ii;
		System.out.println(num1+"x"+ii+"="+sum1);
	}
	System.out.println("--------------------------------");
	
	//고급 2
	//(실행결과의 예) 입력 : 4(엔터) --> 아래와 같이 4줄을 출력
	// 1
	// 2 3
	// 4 5 6
	// 7 8 9 10
	
	System.out.print("입력 : ");
	int num2=sc.nextInt();

	int sum=1;
	for(int i=1; i<=num2; i++) {
		for(int j=0; j<i; j++) {
			System.out.print(sum);
			sum++;
		}
		System.out.println();
	}
	System.out.println("-------------------------");

	
	//고급 3
	//구구단
	// 2x1=2  3x1=3  4x1=4
	// 2x2=4  3x2=6  4x2=8
	// ...
	// 2x9=18 3x9=27 4x9=36
	// 
	// 5x1=1  6x1=6  7x1=7
	//(위와 마찬가지)
	// 8x1=8  9x1=9 
	// (위와 마찬가지)
	int num22=1;
	for(int i=1; i<=9; i++) {
		int num11=2;
		int sum11=num11*num22;
	for(int j=1; j<=3; j++) {
		System.out.print(num11+"x"+num22+"="+sum11+ " ");
		num11++;	
	}
	System.out.println();
	num22++;
	}
	System.out.println("---------------------------------------");
	
	
	//추가연습 : 두 정수(a,b)를 입력받고 (a<b가정)
	// a부터 b까지 곱한 결과를 출력
	//(실행결과)
	//몇 부터? 3(엔터)
	//몇 까지? 5(엔터)
	//->60 //3*4*5=60 이니까
	
	System.out.println("몇 부터? ");
	int ss=sc.nextInt();
	System.out.println("몇 까지? ");
	int nn=sc.nextInt();
	int sum111=1;
	for(int i= ss; i<=nn; i++) {
		sum111*=i;
	}
	
	System.out.println(sum111);
	
	//연습 
	//(실행결과의 예) 입력 : 4
	//****
	//***
	//**
	//*
	System.out.print("입력 : ");
	int num888=sc.nextInt();
	for(int i=num888; i>0; i--) {
		for(int j= i; j>0; j--) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	//고급
	//(실행결과의 예) n 입력 : 4
	//****
	// ***
	//  **
	//   *
	System.out.print("입력 : ");
	int num777=sc.nextInt();
	for(int i=1; i<=num777; i++) {
		
		for(int j=1; j<=(i-1); j++) {
			System.out.print(" ");
		}
		
		for(int j= 1; j<=num777+1-i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println("---------------------");
	
	
	//(실행결과의 예) n 입력 : 4 (엔터)
	//   *	
	//  **	
	// ***		
	//****	
	System.out.print("입력 : ");
	int num555=sc.nextInt();
	for(int i=1; i<=num555; i++) {
		
		for(int j=1; j<=(num555-i); j++) {
			System.out.print(" ");
		}
		
		for(int j= 1; j>=2-i; j--) {
			System.out.print("*");
		}
		System.out.println();
	System.out.println("-------------------------");
}
}
}
