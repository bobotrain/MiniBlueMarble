package day6;

import java.util.Scanner;

public class Ex1for문연습 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	//연습1 : 1~100까지의 합을 출력
	int sum1 = 0; 
	int i1;
	for(i1=1; i1<=100; i1++) {
		sum1 += i1; 
	}
	System.out.println(sum1);
	System.out.println("--------------------------");	
	
	//연습2 : 정수 n(n>0 가정)을 입력받고, 1부터 n까지의 합을 출력
	//+@ (실행결과)  
    // (n이 7이라면) "1+2+3+4+5+6+7 = _________" 나오게 하기
	System.out.print("정수를 입력하시오 : ");
	int sum2 = 0;
	int i2= sc.nextInt();
	int j;
	for(j=1; j<=i2; j++) {
		sum2 += j;
		if(j==i2) {
			System.out.print(j);
		}else{
			System.out.print(j + "+");
		}
	}
	System.out.print("="+sum2);
	System.out.println();
	System.out.println("----------------------");
	
	//연습3 : 정수 두 개(a,b)를 입력받고(a<b 라고 가정이 없어도 실행되게 해주세요)
			//a부터 b까지의 합을 출력
	
	System.out.print("정수 1 : ");
	int num1 = sc.nextInt();
	System.out.print("정수 2 : ");
	int num2 = sc.nextInt();
	int num3;
	if(num1>num2) {
		num3=num1;
		num1=num2;
		num2=num3;
	}
	
	int sum3 = 0;
	int i3;
	for(i3= num1; i3<=num2; i3++) {
		sum3 += i3;
	}
	System.out.println(sum3);
	
	
	
}
}
