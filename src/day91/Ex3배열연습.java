package day91;

import java.util.Scanner;

import java.util.Random;

public class Ex3배열연습 {
public static void main(String[] args) {
	
	/*
	 * 난수 발생(-5 ~ +5) 값을 크기가 6인 배열에 채운 후,
	1) 배열의 내용을 출력.  // 단, Arrays.toString() 사용X.
	2) 정수 하나를 입력받고(n), 그 값이 이 배열에 존재하는 여부를 출력.
		(실행결과의 예)	배열 : [-2, 3, 4, 4, -5, -1]
				정수(n) 입력 : 3 (엔터)
				3 있음!
		(실행결과의 예) 배열 : [2, 0, -4, -4, 5, 3]
				정수(n) 입력 : 4 (엔터)
				4 없음!
	 */
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	int[] arr = new int[6];
	System.out.print("배열 : [" );
	for(int i=0; i<=4; i++) {
		int num = rd.nextInt(11)-5;
		arr[i] = num;
		System.out.print(arr[i]+", ");
	}	
	int num = rd.nextInt(11)-5;
	arr[5] = num;
	System.out.println(arr[5] + "]");
	
	System.out.print("정수(n) 입력 : ");
	int n = sc.nextInt();
	int cnt=0;
	
	for(int i=0; i<=5; i++) {
		if(arr[i]==n) {
			cnt++;
		}
	}
	
	if(cnt!=0) {
		System.out.println(n+" 있음!");
	}else {
		System.out.println(n+" 없음!");
	}
	
	
	
	
	
	
	
}
}
