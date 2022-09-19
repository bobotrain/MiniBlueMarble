package day91;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Ex5배열연습좌석예약연습 {
	public static void main(String[] args) {
		
		/*
		 *  연습(고급). 좌석예약프로그램.
		(실행결과의 예)
			--------------------
			1 2 3 4 5 6 7 8 9 10	<-- 좌석번호
			. . . . . . . . . .     <-- 예약상태(X:예약됨 / .:안됨)
			--------------------
			예약하시겠습니까? y(엔터)
			예약할 좌석 번호 입력 : 7 (엔터)
			예약되었습니다.
	
			--------------------
			1 2 3 4 5 6 7 8 9 10	<-- 좌석번호
			. . . . . . X . . .     <-- 예약상태(X:예약됨 / .:안됨)
			--------------------
			예약하시겠습니까? y(엔터)
			예약할 좌석 번호 입력 : 7 (엔터)
			이미 예약된 좌석입니다. 다시 입력해주세요.
			예약할 좌석 번호 입력 : 6 (엔터)
			예약되었습니다.
	
			...
		 */
		Scanner sc = new Scanner(System.in);
		String agree; // 승낙여부
		int num; // 좌석번호
		int cnt=0; // 좌석 다 찼는지 알기 위해 임의로 만든 변수
		
		
		int[] arr1 = new int[10]; // 좌석번호
		String[] arr2 = new String[10]; // 예약상태
		for(int i=0; i<=9; i++) {
			arr1[i]=i+1;
			arr2[i]=".";
		}
		
		while(true) {
			System.out.println("--------------------");
		
			for(int i=0; i<=9; i++) {
				System.out.print(arr1[i] + " ");
			}
			System.out.println();
			for(int i=0; i<=9; i++) {
				System.out.print(arr2[i] + " ");
			}
			System.out.println();
			System.out.println("--------------------");
			
			System.out.print("예약하시겠습니까? ");
			agree = sc.next(); 
			
		
				if(agree.equals("y")) {	
	
					cnt=0;
					if(arr2[0].equals("X")) {
						cnt++;
					}
					for(int i=0; i<=8; i++) {
						if(arr2[i].equals(arr2[i+1])) {
							cnt++;
						}//if
					}//for
					
					if(cnt==10) {
						System.out.println("예약이 가득 찼습니다.");
						break;
					}
					
					System.out.print("예약할 좌석 번호 입력 : ");
					num = sc.nextInt();
					
					
					if(arr2[num-1]!="X") {
						System.out.println("예약되었습니다.");
						arr2[num-1]="X";
	
					} else {
						System.out.println("이미 예약된 좌석입니다. 다시 입력해주세요.");			
					}			
				}	//if
		}//outer while
		
	
	}//main
}
