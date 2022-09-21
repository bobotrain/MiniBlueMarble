package day932차원배열;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1112차원배열연습마방진 {
public static void main(String[] args) {
	
	// 고급 1) 배열로 마방진 3x3만들어서 출력하기
	
	// 마방진(3x3).
	//(실행결과)
	//[8, 1, 6]
	//[3, 5, 7]
	//[4, 9, 2]
	
	int arr[][] = new int[3][3];
	int i=0;
	int j=1;
	
	int n=1; // 각 배열의 수 `1~9
	
	
	
	arr[i][j]=n; // 시작 초기 0행 1열에서 1로 시작
	
	/*
	arr[0][1] = 1;
	arr[2][2] = 2;
	arr[1][0] = 3;
	arr[2][0] = 4;
	arr[1][1] = 5;
	arr[0][2] = 6;
	arr[1][2] = 7;
	arr[0][0] = 8;
	arr[2][1] = 9;
	*/
	
	while(true) {
		
		if(arr[i][j]%3!=0) {
			if(j==2) {
				j=0;
			}else {
				j++;
			}
			
			if(i==0) {
				i=2;
			}else {
				i--;
			}
			
			arr[i][j] = ++n;
			
		}		
		
		if(n==9) {
			break;
		}
		
		
		if(arr[i][j]%3==0) {
			
			if(i!=2) {
				++i;
			}else {
				i-=2;
			}
			arr[i][j] =++n;
			
		}
	
		
			
	}//while
	
	for(i=0; i<=arr.length-1; i++) {
		for(j=0; j<=arr.length-1; j++) {
			System.out.print(arr[i][j] +" ");
		}
		System.out.println();
	}
	
	
	
}
}
