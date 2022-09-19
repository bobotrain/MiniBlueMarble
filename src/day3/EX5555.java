package day3;

import java.util.Scanner;

public class EX5555 {
public static void main(String[] args) {
	
	//기본 연습1
	// max : 17 되게 해라
	int a = 15;
	int b = 17;
	int max = (a>b)?a:b; 
	System.out.println("max : " + max);
	 System.out.println("-------------------------");
	
	//기본 연습2
	// 정수 2개를 키보드 입력 받아서, 둘 중 더 작은 수를 출력.
	// 정수 1 : 15
	// 정수 2 : -7
	// -> 더 작은 수  = -7 (정수2가 정수 1보다 22만큼 더 작음)
	 
	Scanner sc = new Scanner(System.in);
	System.out.print("a1 : ");
	int a1 = sc.nextInt();
	System.out.print("a2 : ");
	int a2 = sc.nextInt();		
	System.out.println("더 작은 수 = " + ((a1>a2)?("("+a2+"가 "+a1+"보다 "+(a1-a2)+"만큼 더 작음 )")
			:("("+a1+"가 "+a2+"보다 "+(a2-a1)+"만큼 더 작음 )")));
	
	System.out.println("------------------------");
	// 연습 1
	// 정수 3개를 입력받아서, 그 중에서 가장 큰 값을 출력. (단 3개의 정수는 서로 다른 값이라고 가정 / if문 사용 금지)
	// 정수 1 : 17
	// 정수 2 : 25
	// 정수 3 : 8
	// ->출력 = 가장 큰 값은 25 입니다.
	
	System.out.print("b1 : ");
	int b1 = sc.nextInt();
	System.out.print("b2 : ");
	int b2 = sc.nextInt();
	System.out.print("b3 : ");
	int b3 = sc.nextInt();
	
	int max1 = (b1>b2)?b1:b2;
	
	System.out.println("가장 큰 값은 " + ((b3>max1)?b3:max1) + "입니다.");
	System.out.println("-------------------------");
	
	// 연습 2
	// 정수 3개를 입력받아서, 중앙값(median)을 출력하라. (단 3개의 정수는 서로 다른 값이라고 가정 / if문 사용 금지)
	// 정수 1 : 17
	// 정수 2 : 25
	// 정수 3 : 8
	// ->출력 = 중앙값은 17입니다.
	
	System.out.print("c1 : ");
	int c1 = sc.nextInt();
	System.out.print("c2 : ");
	int c2 = sc.nextInt();
	System.out.print("c3 : ");
	int c3 = sc.nextInt();
	
	int mid = (c1<c2&&c2<c3||c3<c2&&c2<c1)?c2:((c2<c1&&c1<c3||c3<c1&&c1<c2)?c1:c3);
	
	System.out.println("중앙값은 " + mid + "입니다.");
	System.out.println("-------------------------");
	
}
}
