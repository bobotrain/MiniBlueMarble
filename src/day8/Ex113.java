package day8;

import java.util.Scanner;

public class Ex113 {
public static void main(String[] args) {
	
	
	//사용자가 입력한 모든 정수의 합계를 출력
	// 단 사용자가 0을 입력하면 그때까지의 합계를 출력 하고 종료
	//(실행결과의 예)
	// 입력 : 5(엔터)
	// 입력 : 3(엔터)
	// 입력 : -12(엔터)
	// 입력 : -10(엔터)
	// 입력 : 0(엔터)
	// 지금까지 입력한 값들의 합은 10입니다.
	
	Scanner sc = new Scanner(System.in);
	int sum = 0;
	System.out.print("입력 : ");
	int num = sc.nextInt();
	while(num!=0) {
		sum+=num;
		System.out.print("입력 : ");
		num = sc.nextInt();
	}
	System.out.println("지금까지 입력한 값들의 합은 " + num + "입니다.");
	
	
	
	
}
}
