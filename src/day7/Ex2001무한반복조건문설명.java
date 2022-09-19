package day7;

import java.util.Scanner;

public class Ex2001무한반복조건문설명 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	/*
	while(true){ 무한반복문1 
	System.out.println("*");
	}
	
	for(;;){ 무한반복문2 -> ;; 사이가 비어있으면 그 자리에 자동으로 true가 적용됨! 
	System.out.println("*");
	}
	
	while과 if의 조건식은 생략할 수 없음을 주의
	
	continue : 다음 회차부터 계속! ( 이번회차는 넘겨라~ )
	*/
	
	/*Ex603. 
	 가위/바위/보 입력.	
	Hint. 무한반복 쓰세요. While(true)
	Hint2. 일정 조건 --> break; 
	 
	(실행결과의 예) 가위/바위/보 입력 : 거위 (엔터)
	가위,바위,보 중에 하나를 입력하세요!
	가위/바위/보 입력 : 가이 (엔터)
	가위,바위,보 중에 하나를 입력하세요!
	가위/바위/보 입력 : 가위 (엔터)
	가위를 내셨습니다.       */
	
	System.out.print("가위/바위/보 입력 : ");
	String A = sc.next();
	
	while(true){
		if(A.equals("가위")||A.equals("바위")||A.equals("보")) {
			System.out.println(A+"를 내셨습니다");
			break;
		}else {
		System.out.println("가위,바위,보 중에 하나를 입력하세요!");
		System.out.print("가위/바위/보 입력 : ");
		A = sc.next();
		}
	}
	
	//A!="가위"||A!="바위"||A!="보"
	
	
	
	
	
	
}
}
