package day7;

import java.util.Scanner;

public class Ex204 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		/*
		연습4. [고급] (실행결과의 예)
		소수만 입력하세요(1번째 시도) : 5 (엔터)
		소수만 입력하세요(2번째 시도) : 7 (엔터)
		소수만 입력하세요(3번째 시도) : 11 (엔터)
		소수만 입력하세요(4번째 시도) : 13 (엔터)
		소수만 입력하세요(5번째 시도) : 15 (엔터) // 소수를 입력하지 않으면 탈출
		4번 성공!
		*/
		
		int a=1;
		int cnt=2;
		int n=0;
		
		while(cnt==2) {
		System.out.print("소수만 입력하세요("+ a +"번째 시도) : ");
		int num = sc.nextInt();
		cnt=0;
			for(int i=1; i<=num; i++) {
				if(num%i==0) {
					cnt++;	
				}	
				if(cnt>=3){
					System.out.println(n+"번 성공!");
					break;  // break는 가장 가까운 for문을 탈출하는 것
				}	
			}
		n++;
		a++;
		}

}

}
