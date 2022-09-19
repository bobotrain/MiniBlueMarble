package day8;

import java.util.Scanner;

public class Ex114 {
public static void main(String[] args) {
	
	
	/* 연습. "사용자로부터 소수(prime number)인 정수만 입력받아서
	이들의 합계를 출력"
	- 소수가 아닌 수가 입력되면, 그때까지 입력한 수들의 합을 출력 후, 끝.
	- (실행결과의 예)
	소수 입력 : 2 (엔터)
	소수 입력 : 7 (엔터)
	소수 입력 : 13 (엔터)
	소수 입력 : 8 (엔터)
	지금까지 입력한 소수들의 합은 22입니다.
	*/
	
	Scanner sc = new Scanner(System.in);
	int sum = 0;
	System.out.print("입력 : ");
	int num = sc.nextInt();
	int cnt =0;
	
	while(true) {
		cnt=0;
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				cnt++;	
				}
		}//for
		if(cnt>=3) {
			sum+=num;
			System.out.println("지금까지 입력한 소수들의 합은 "+ sum+"입니다.");
			break;
		}else if(cnt==1) {
			sum+=num;
			System.out.println("지금까지 입력한 소수들의 합은 "+ sum+"입니다.");
			break;
		}else{
		sum+=num;
		System.out.print("입력 : ");
		num = sc.nextInt();
		}
	}//while
	
}
}
