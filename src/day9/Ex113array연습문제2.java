package day9;

import java.util.Arrays;

public class Ex113array연습문제2 {
public static void main(String[] args) {
	/*
	  Q801연습1.	
	크기가 10인 정수형 배열을 만들고,
	여기에 10,20,30,40,50,60,70,80,90,100을 넣고.
	1) 반복문을 사용해서 이 배열의 내용을 출력.
	   (실행결과) 10 20 30 40 50 60 70 80 90 100
	   (고급화) [10,20,30,40,50,60,70,80,90,100]
	2) 이 배열의 모든 요소의 총합을 촐력.
	   (실행결과) 550
	3) (고급) 요소들 중 십의자리가 짝수인
	  	  수를 모두 출력.
	   (실행결과) 20 40 60 80 100 
	4) (고급) 요소들 중 십의자리가 홀수인 요소들의
		  부호를 (-)로 만든 후
		  Arrays.toString()을 이용해서 출력.
	   (실행결과) [-10, 20, -30, 40, ..., -90, 100]
	 */
	
	int[] arr = new int[] {10,20,30,40,50,60,70,80,90,100};
	
	//1) 
	for(int i=0; i<=arr.length-1; i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	//1) 고급화
	System.out.print("[");
	for(int i=0; i<=arr.length-2; i++) {
		System.out.print(arr[i]+", ");
	}
	System.out.println(arr[9] + "]");
	
	//2)
	int sum=0;
	for(int i=0; i<=arr.length-1; i++) {
		sum+=arr[i];
	}
	System.out.println(sum);
	
	//3)
	for(int i=0; i<=arr.length-1; i++) {
		if(arr[i]%20==0) {
			System.out.print(arr[i] + " ");
		}
	}
	System.out.println();
	
	//4)
	for(int i=0; i<=arr.length-1; i++) {
		if(arr[i]%20!=0) {
			arr[i]*=-1;
		}
	}
	System.out.println(Arrays.toString(arr));
	
}
}
