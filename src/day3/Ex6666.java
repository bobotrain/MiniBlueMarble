package day3;

import java.util.Scanner;

public class Ex6666 {
public static void main(String[] args) {
	
	
	
	// 연습 2
		// 정수 3개를 입력받아서, 중앙값(median)을 출력하라. (단 3개의 정수는 서로 다른 값이라고 가정 / if문 사용 금지)
		// 정수 1 : 17
		// 정수 2 : 25
		// 정수 3 : 8
		// ->출력 = 중앙값은 17입니다.
	Scanner sc = new Scanner(System.in);
		System.out.print("c1 : ");
		int c1 = sc.nextInt();
		System.out.print("c2 : ");
		int c2 = sc.nextInt();
		System.out.print("c3 : ");
		int c3 = sc.nextInt();
		
		int mid = (c1<c2&&c2<c3||c3<c2&&c2<c1)?c2:((c2<c1&&c1<c3||c3<c1&&c1<c2)?c1:c3);
		
		System.out.println("중앙값은 " + mid+ "입니다.");
		
	
	
}
}
