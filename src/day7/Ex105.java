package day7;

import java.util.Scanner;

public class Ex105 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	/*
	Q606.[고급]
		(실행결과의 예) n : 5 (엔터)
				1		1
				01		23
				101		345
				0101	4567
				10101	56789
		*/
	System.out.print("n : ");
	int n = sc.nextInt();
	for(int i=1; i<=n; i++) {
		if(i%2==0) {		
			System.out.print(0);
			int num=1;
			for(int j=1; j<=i-1; j++) {
				if(num==0) {
					System.out.print(num);
					num++;
				}
				else {System.out.print(num);	
				num--;
				}
			}//inner for
		}else {
			int num=1;
			for(int j=1; j<=i; j++) {
				if(num==0) {
					System.out.print(num);
					num++;
				}
				else {System.out.print(num);	
				num--;
				}
			}	
		}
		System.out.println();
	}//outer for
	System.out.println("----------------------------");
	
	
	//강사님 답.
	System.out.print("n : ");
	int n1 = sc.nextInt();

	for(int i=1; i<=n1; i++) {
		int num=1; //다시 1로 초기화
		for(int j=1; j<=i; j++){ 
			System.out.print((num+i-1)%2);
			num++;
		}
	System.out.println();
	}
	
}
}
