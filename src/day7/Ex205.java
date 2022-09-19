package day7;

import java.util.Scanner;

public class Ex205 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		//연습5. 1부터 100까지의 정수 중 일의 자리와 십의 자리가 같은 수를 출력.
		//(실행결과) 11 22 33 44 55 66 77 88 99 100
		
		for(int i=1; i<=100; i++) {
			if(i>=10 && (i/10==i%10)){
				System.out.print(i + " ");
			}
		}

		
		
		
		
		
	}

}
