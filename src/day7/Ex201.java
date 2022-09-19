package day7;

import java.util.Scanner;

public class Ex201 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		/* 
		  연습1. 4개의 정수를 입력 받아서(a,b,c,d),  // a < c < d < b 가정
		a부터 b까지 출력하되, "c부터 d까지는 제외하고" 출력.
						// break 또는 continue를 반드시 사용.
		(실행결과의 예)
			a : 1 (엔터)
			b : 10 (엔터)
			c : 5 (엔터)
			d : 8 (엔터)
			-> 1 2 3 4 9 10
		 */
		
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		System.out.print("정수3 : ");
		int num3 = sc.nextInt();
		System.out.print("정수4 : ");
		int num4 = sc.nextInt();
		
		while(true) {
			for(int i = num1; i<=num2; i++) {
				if(i>=num3 && i<=num4) {
					num1++;
				}else{
				System.out.print(num1 + " ");
				num1++;
				}//else
			}//for
			break;
		}

		
		
	}
}
