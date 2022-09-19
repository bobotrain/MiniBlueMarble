package day2;

import java.util.Scanner;

//조건문 : if(조건식) { (실행할 내용) }
public class Ex211 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("num : ");
	int num = sc.nextInt();
	
	if(num>0){
		System.out.println("양수임.");
	}else if(num<0){
		System.out.println("음수임.");
	}else{
		System.out.println("0이다.");
	}
	
	
	
	// if 구문과else구문은 중괄호 없이 적으면 아래 바로한문장 까지만 같은 구문으로 인식. 단! 한 문장만 !
	/*
	if(num%2==0) 
		System.out.println("짝수임!");	
	else 
		System.out.println("홀수임!");
	 */
	
	
	
}
}
