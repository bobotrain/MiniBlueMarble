package day9;

import java.util.Arrays;
import java.util.Random;

public class Ex113array연습문제3 {
public static void main(String[] args) {
	
	/*
	5개의 정수를 담을 수 있는 배열을 만들고,
	난수발생(1 이상 10 이하)해서 5개의 정수를
	랜덤하게 배열에 채우고.
	1) 반복문을 사용해서 아래의 형식으로 
	   모든 요소를 출력.
	   (실행결과의 예) (3 9 8 4 5)
	2) 이 배열에서 홀수의 개수와 짝수의 개수를 출력.
	   (실행결과의 예) 홀수 3개
			   짝수 2개
	3:고급) 이 배열에 중복된 숫자가 있는지 여부를 판단
	   해서 출력.
	   (실행결과의 예) (3 9 8 4 5) 
	   -> "중복된 숫자 없음!"이라고 출력.
	   (실행결과의 예) (3 7 3 1 2)
	   -> "중복된 숫자 있음!"이라고 출력.
	4:고급) 이 배열이 오름차순 또는 내림차순으로
	   정렬된 상태인지 여부를 판단해서 출력.
	   (실행결과의 예) (3 9 8 4 5) 
	   -> "정렬X"라고 출력.
	   (실행결과의 예) (3 4 5 8 9)
	   -> "정렬O(오름차순)"라고 출력.
	5:고급) 이 배열로부터 홀수와 짝수를 구분해서
	   별도의 배열A와 배열B를 만들어 홀수와 짝수를
	   각각 배열A와 배열B에 넣고 아래와 같이 출력.
	   (실행결과의 예) 배열 : [3, 9, 8, 4, 5]
	   		   배열A : [3, 9, 5]
			   배열B : [8, 4]
	※ Arrays.toString() 이용해서 출력하세요.
	 */
	
	
	//1)
	Random rd = new Random();
	int[] arr = new int[5];
	
	for(int i=0; i<=arr.length-1; i++) {
		arr[i] = rd.nextInt(10)+1;
	}
	System.out.print("(");
	for(int i=0; i<=arr.length-2; i++) {
	System.out.print(arr[i] + " ");
	}
	System.out.println(arr[4] + ")");
	
	//2) 이 배열에서 홀수의 개수와 짝수의 개수를 출력. (실행결과의 예) 홀수 3개    짝수 2개
	int a=0; // 짝수
	int b=0; // 홀수
	for(int i=0; i<=arr.length-1; i++) {
		if(arr[i]%2==0) {
			a++;
		}else {
			b++;
		}
	}
	System.out.println("홀수 " + b + "개,  "+"짝수 " + a + "개" );
	
	//3)이 배열에 중복된 숫자가 있는지 여부를 판단
	 //  해서 출력.
	 //  (실행결과의 예) (3 9 8 4 5) 
	 // -> "중복된 숫자 없음!"이라고 출력.
	 // (실행결과의 예) (3 7 3 1 2)
	 // -> "중복된 숫자 있음!"이라고 출력.
	
	int cnt =0;
	for(int i=0; i<=arr.length-1; i++) {
		
		for(int j=0; j<=arr.length-1; j++) { // 분명 각 배열자리별로 1개씩만 겹칠것.. 근데 2개이상 겹치면 cnt의 숫자가 5를 넘어서 6이상으로 될 것임.
			if(arr[i]==arr[j]) {
				cnt++;
			}
		} 
	}
	
	if (cnt>=6) {  // cnt가 6이 넘는다는 것은 중복된 숫자가 2개이상 있다는 뜻 
		System.out.println("중복된 숫자 있음!");
	}else {
		System.out.println("중복된 숫자 없음!");
	}
	 
	
	//4) 이 배열이 오름차순 또는 내림차순으로 정렬된 상태인지 여부를 판단해서 출력.
	
	int k1=0;
	int k2=0;
	
	
		for(int i=0; i<=arr.length-2; i++) {
				if(arr[i]<=arr[i+1]) {
					k1++;
				}	
		}
		for(int i=0; i<=arr.length-2; i++) {
				if(arr[i]>=arr[i+1]) {
					k2++;
				}			
		} 
		
		if(k1==4||k2==4) {
			System.out.println("정렬 O");
		}else {
			System.out.println("정렬 X");
		}
		
	//5) 5:고급) 이 배열로부터 홀수와 짝수를 구분해서
	/*	   별도의 배열A와 배열B를 만들어 홀수와 짝수를
		   각각 배열A와 배열B에 넣고 아래와 같이 출력.
		   (실행결과의 예) 배열 : [3, 9, 8, 4, 5]
		   		   배열A : [3, 9, 5]
				   배열B : [8, 4]
		※ Arrays.toString() 이용해서 출력하세요.
		*/
		
		int[] arr1 = new int[b]; // 홀수 배열A  아까 구해둔 b홀수카운트 이용
		int cnt1 =0; // 홀수 array 자릿수 나타내는 변수
		int[] arr2 = new int[a]; // 짝수 배열B  아까 구해둔 a짝수카운트 이용
		int cnt2 =0; // 짝수 array 자릿수 나타내는 변수
		
		for(int i=0; i<=arr.length-1; i++) {
			if(arr[i]%2==0) { //짝수배열
				++cnt2;
				arr2[cnt2-1] = arr[i];	
			}else { // 홀수배열
				++cnt1;
				arr1[cnt1-1] = arr[i];
			}
		}
		
		System.out.println("배열A : " + Arrays.toString(arr1));
		System.out.println("배열B : " + Arrays.toString(arr2));
		
		
		
}
}
