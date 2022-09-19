package day5;

import java.util.Scanner;

public class Ex5조건문연습문제2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//조건문 연습 1
	//정수 값을 하나 입력 받아서,
	//"10보다 크고 30보다 작은지"를 판단해서 출력.
	//(실행결과의 예) 정수 입력 : 17 (엔터)
	//	-> 17은 10보다 크고 30보다 작은 수임!
	//(실행결과의 예) 정수 입력 : 38 (엔터)
	//	-> 38은 10보다 크고 30보다 작은 수가 아님!
	
	System.out.print("정수 입력 : ");
	int num1 = sc.nextInt();
	if(10<num1 &&num1<30){
		System.out.println(num1+"은 10보다 크고 30보다 작은 수임!");
	}else {
		System.out.println(num1+"은 10보다 크고 30보다 작은 수가 아님!");
	}
	System.out.println("-----------------");
	
	//조건문 연습 2 
	//연도를 하나 입력 받아서, 윤년인지 여부를 판단하는 코드
	// 윤년인지 판단 하는 방법: 
	//1) 400으로 나누어 떨어지면 윤년임. 그걸로 끝
	//2) 그게 아니라면, 4로 나누어 떨어지면서 100으로는 나누어 떨어지지 않으면 윤년임 . 
	
	System.out.print("연도 입력 : ");
	int day = sc.nextInt();
	if(day%400==0) {
		System.out.println("윤년임");
	}else if(day%4==0 && day%100!=0){
		System.out.println("윤년임");
	}else {
		System.out.println("윤년이 아님");
	}
	System.out.println("-----------------------");
	
	//조건문 연습 3 
	//물은 0도에서 얼고 100도에서 끓는다.
	//변수 temp에 정수(온도) 값을 하나 입력 받아서, 물이 액체 상태인지 여부를 출력
	//(실행결과의 예) 온도 입력 : 78(엔터) --> 액체 상태임! 출력
	//(실행결과의 예) 온도 입력 : 128(엔터) --> 액체 상태가 아님! 출력
	
	System.out.print("온도 입력 : ");
	int temp = sc.nextInt();
	if(temp<=0 || temp>=100) {
		System.out.println("액체 상태가 아님!");
	}else {
		System.out.println("액체 상태임!");
	}
	System.out.println("------------------------------");
	
	//조건문 연습 4
	//알파벳(String)을 하나 입력 받고, 문자열(String)을 문자(char)로 변환한 후에,
	//대문자인지 여부를 출력. -> 아스키코드표 참조 가능
	//(실행결과의 예) 알파벳 입력 : A(엔터) --> 대문자임!  출력
	//(실행결과의 예) 알파벳 입력 : b(엔터) --> 대문자가 아님!  출력
	//문자열을 입력 받아서, 맨 첫글자를 char형으로 변환
	// String s = sc.next();
	// char c = s.charAt(0); 
	//(추가고급연습) 알파벳을 입력하지 않았으면 제대로 입력 할 때 까지 반복해서 입력 받으세요.

	System.out.print("알파벳 입력 : ");
	String s = sc.next();
	char c = s.charAt(0);
	
	while( !( (65<=c&&c<=90)||(97<=c&&c<=122) ) ){
		System.out.print("올바른 값이 아닙니다. 다시 입력하세요 : ");
		s = sc.next();
		c = s.charAt(0);
	}
	if (65<=c &&c<=90) {
		System.out.println("대문자임");
	}else if(97<=c && c<=122) {
		System.out.println("대문자가 아님!");
	}
	
	//조건문 연습 5 
	//문자를 하나 입력 받아서, //아스키코드표
	//대문자이면 소문자로 바꿔서 출력하고, 대문자가 아니면 그냥 출력
	//(실행결과의 예) 문자 입력 : a(엔터) --> a
	//(실행결과의 예) 문자 입력 : B(엔터) --> b
	//(실행결과의 예) 문자 입력 : 9(엔터) --> 9
	
	
	System.out.print("문자 입력 : ");
	String s1 = sc.next();
	char c1 = s1.charAt(0);
	if ( 65<=c1&&c1<=90) {
		c1 += 32;
		System.out.println(c1);
	}else {
		System.out.println(c1);
	}
	
	
	
	
}
}
