package day91;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Ex1배열연습 {
public static void main(String[] args) {
	
	/*
	 *(실행결과의 예)
		몇 과목인가요? 4 (엔터)
		4과목의 점수를 하나씩 입력하세요: 80 (엔터)
		90 (엔터)
		100 (엔터)
		70 (엔터)
		-> 입력한 점수 : [80, 90, 100, 70]
		-> 총점 : 340점
		-> 평점 : 85점
	 */
	Scanner sc = new Scanner(System.in);
	int[] arr; 
	int sum = 0;
	float avg = 0;	
	
	System.out.print("몇 과목인가요? : ");
	int num = sc.nextInt();
	arr = new int[num]; 
	System.out.println();
	
	System.out.println(num+"과목의 점수를 하나씩 입력하세요 : ");
	for(int i=0; i<=num-1; i++) {
	arr[i] = sc.nextInt();
	sum+=arr[i];
	}
	System.out.println("입력한 점수 : " + Arrays.toString(arr));
	System.out.println("총점 : " + sum+"점");
	System.out.println("평점 : " + (float)sum/num+"점");
	
	
}
}
