package day5;

import java.util.Scanner;

public class Ex5조건문 {
public static void main(String[] args) {
	
	//if / else if / else 
	//정수 (0~100)를 입력받은 후, 해당 학점(A,B,C,D,F)를 출력
	
	
	// 고급1 ( 범위를 벗어난 값을 입력했으면 제대로 입력할 때 까지 반복해서 입력받기 ) 
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("정수를 입력하세요(0~100) : ");
	int score = sc.nextInt();
	
	while(0>score||score>100){
		System.out.print("올바른 값이 아닙니다. 다시 입력하세요 : ");
		score = sc.nextInt();
	}//while
	if(score>=90){
		System.out.println("A");
	}else if(score>=80) {
		System.out.println("B");
	}else if(score>=70) {
		System.out.println("C");
	}else if(score>=60) {
		System.out.println("D");
	}else {
		System.out.println("F");
	}
		
	System.out.println("-----------------------------");
	
	//고급2  switch문 (switch /case / break / default)
		System.out.print("정수를 입력하세요(0~100) : ");
		int score1 = sc.nextInt();
		score1 /= 10;    // score = score / 10;
		
		switch(score1) {
		case 10:
			System.out.println("A");
			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;	
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;
		}
		
	
}
}
