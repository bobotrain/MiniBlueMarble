package day7;

import java.util.Scanner;

public class Ex202 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		//연습2. 1부터 100까지의 정수 중 소수(prime number)를 모두 출력.
		
		for(int i= 1; i<=100; i++) {
			int cnt=0;
			for(int num=1; num<=i; num++) {
				if(i%num==0) {
					cnt++;
				}		
			}
			if(cnt==2){
			System.out.println(i);
			}
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
