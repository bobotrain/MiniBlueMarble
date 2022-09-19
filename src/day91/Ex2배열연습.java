package day91;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Ex2배열연습 {
public static void main(String[] args) {
	/*
	 * 난수 발생(1~10) 값을 크기가 6인 배열에 채운 후,
	1) 배열의 내용을 출력.  // Arrays.toString() 사용.
	2) 평균 값을 출력.
	3) 평균 값보다 큰 요소(값)을 출력.
	 */
	
	//강사님 답 (Math.random() 이용)
	//Math.random() : "0.0이상 1.0미만의 수"(기억)
	// 1~10
	// (int)(( 0 ~ 0.999999 ) * 10) + 1 로 난수 뽑아내기  
	
	
	Random rd = new Random();
	
	int[] arr = new int[6];
	float sum =0;
	int cnt =0;
	for(int i=0; i<=5; i++) {
	
		int num = rd.nextInt(10)+1;
		arr[i] = num;
		sum+=arr[i];
	}	
	
	System.out.println("배열 : "+Arrays.toString(arr));
	System.out.println("평균값 : "+(float)sum/6);
	System.out.print("평균 값보다 큰 요소(값) : ");
	for(int i=0; i<=5; i++) {
		if(arr[i]>=(float)sum/6) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
}
}
