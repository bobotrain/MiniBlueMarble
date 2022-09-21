package day932차원배열;

import java.util.Arrays;
import java.util.Random;

public class Ex1112차원배열연습5 {
public static void main(String[] args) {
	
	/*
	 *고급연습5.	난수발생(1~9)해서, 배열(3x3)을 채운 후,
		1) 출력
		2) (위 배열을) 시계방향으로 90도 회전해서 출력
		3) (위 1)의 배열을) 반시계방향으로 90도 회전해서 출력 
	 */
	Random rd = new Random();
	int[][] arr= new int[3][3];
	
	for(int i=0; i<=2; i++) {
		for(int j=0; j<=2; j++) {
			int num = rd.nextInt(9)+1;
			arr[i][j]= num;
		}
	}
	
	//1) 출력
	for(int i=0; i<=2; i++) {
		for(int j=0; j<=2; j++) {
			System.out.print(arr[i][j]);
		}
		System.out.println();
	}
	
	System.out.println("---------------------------------------------");
	
	
	//2) 시계방향 90도 회전
	
	int[][] arr2= new int[3][3]; //두번째 임시배열 만들기
			
	
	for(int i=0; i<=2; i++) {
		for(int j=0; j<=2; j++) {
			if(i==0&&j==0) {
				arr2[i][j]=arr[i+2][j];
				System.out.print(arr2[i][j]);
			}else if(i==0&&j==1) {
				arr2[i][j]=arr[i+1][j-1];
				System.out.print(arr2[i][j]);
			}else if(i==0&&j==2) {
				arr2[i][j]=arr[i][j-2];
				System.out.print(arr2[i][j]);
			}
		}	
		
		for(int j=0; j<=2; j++) {	
			if(i==1&&j==0) {
				arr2[i][j]=arr[i+1][j+1];
				System.out.print(arr2[i][j]);
			}else if(i==1&&j==1) {
				arr2[i][j]=arr[i][j];
				System.out.print(arr2[i][j]);
			}else if(i==1&&j==2) {
				arr2[i][j]=arr[i-1][j-1];
				System.out.print(arr2[i][j]);
			}	
		}			
				
		for(int j=0; j<=2; j++) {	
			if(i==2&&j==0) {
				arr2[i][j]=arr[i][j+2];
				System.out.print(arr2[i][j]);
			}else if(i==2&&j==1) {
				arr2[i][j]=arr[i-1][j+1];
				System.out.print(arr2[i][j]);
			}else if(i==2&&j==2) {
				arr2[i][j]=arr[i-2][j];
				System.out.print(arr2[i][j]);
			}		
		}	
		System.out.println();
	}		
			
		System.out.println("--------------------------------------------");	
			

		//3) (위 1)의 배열을) 반시계방향으로 90도 회전해서 출력  // 쌤 답 참고
		int[][] arr3= new int[3][3]; //세번째 임시배열 만들기
		
		for(int i=0; i<=2; i++) {
			for(int j=0; j<=2; j++) {
				arr3[2-j][i] = arr[i][j];
			}
		}
		for(int i=0; i<=2; i++)
			System.out.println(Arrays.toString(arr3[i]));
			
}
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

