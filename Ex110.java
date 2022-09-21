package day932차원배열;

import java.util.Arrays;

public class Ex110 {
public static void main(String[] args) {
	
	// int[] arr = { 10, 20, 30 };  일차원배열의 간편법
	
	//2차원배열의 간편법
	int[][] arr = {
			{10, 20, 30},	
			{40, 50, 60}
	};
	
	
	
	System.out.println(Arrays.toString(arr[0])); // 0번째 행 / arr[0] arr[1] 이 1차원배열을 의미
	System.out.println(Arrays.toString(arr[1])); // 1번째 행
	System.out.println("--------------------------------------");
	
	// 123
	// 456
	// 789 출력
	
	int [][] arr2 = {
			{1,2,3},
			{4,5,6},
			{7,8,9}		
	};
	for(int i=0; i<=2; i++) {
		System.out.println(Arrays.toString(arr2[i]));
	}//방법 1
	System.out.println("----------------------------------------");
	
	for(int i=0; i<=2; i++) { //i : 행
		for(int j=0; j<=2; j++) {
		
		System.out.print(arr2[i][j] + " ");
		}
		System.out.println();
	}//방법 2
	
	System.out.println("----------------------------------------");
	
	
	//12
	//3456
	//789 출력
	int [][] arr3 = {
			{1,2},
			{3,4,5,6},
			{7,8,9}
	};
	for(int i=0; i<=arr3.length-1; i++) { // 또는 i<=2
		for(int j=0; j<=arr3[i].length-1; j++) {
			System.out.print(arr3[i][j] + " ");
		}
		System.out.println();
	}
	
	
}
}
