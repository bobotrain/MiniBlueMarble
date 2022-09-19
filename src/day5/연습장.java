package day5;

import java.util.Scanner;

public class 연습장 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
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
	
	
	
}
}
