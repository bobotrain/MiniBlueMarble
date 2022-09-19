package day7;

import java.util.Scanner;

public class Ex103 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	/*Q604.[고급]
			(실행결과의 예) n : 5 (엔터)
					  1  2  3  4  5 
					     6  7  8  9 
					       10 11 12
					          13 14
					             15
					           */

	System.out.print("n : ");
	int n = sc.nextInt();
	int num=1;
	int c=0;
	for(int i=1; i<=n; i++) {
		
		for(int j=1; j<=i-1; j++) {
			
			System.out.print("   ");
					
		}
		
		for(int j=num; j<=n+num-i; j++) {	
			if(num>=10) {
				System.out.print(j+" ");
			}else {
			System.out.print(j+"  ");
			}
		}
	num+=n-c;
	c++;
		System.out.println();
	}
	
}
}
