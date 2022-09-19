package day7;

import java.util.Scanner;

public class Ex203 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		//연습3. 1부터 100까지의 정수 중 그 수가 짝수이거나 소수이면 출력.
		
		for(int i= 1; i<=100; i++) {
			int cnt=0;
			for(int num=1; num<=i; num++) {
				if(i%num==0) {
					cnt++;
				}		
			}
			if(cnt==2){
			System.out.println(i);
			}else {
				if(i%2==0) {
					System.out.println(i);
				}
			}
		}

		
		
		
		
		
		
	}

}
