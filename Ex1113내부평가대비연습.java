package day932차원배열;

import java.util.Arrays;
import java.util.Random;

public class Ex1113내부평가대비연습 {
public static void main(String[] args) {
	
	/*
	내부평가01 대비 연습.

	-1) 피보나치 수열을 n개 담은 배열 생성 후 출력.
	ex) n : 6 ----> [1, 1, 2, 3, 5, 8]

	-2) 1 이상 100 이하의 정수 중 짝수만 랜덤으로 n개를 담은 배열 생성 후 출력.
	ex) n : 5 ----> [34, 72, 14, 40, 38]

	-3) 구구단 n단의 결과 값을 담은 배열 생성 후 출력.
	ex) n : 3 ----> [3, 6, 9, 12, 15, 18, 21, 24, 27]

	-4) (1부터 시작해서) 소수 n개를 담은 배열 생성 후 출력.
	ex) n : 7 ----> [2, 3, 5, 7, 11, 13, 17]

	-5) 1 이상 100 이하의 정수 중 소수를 모두 담은 배열 생성 후 출력.
	ex) [2, 3, 5, 7, 11, 13, ................... , 97]

	*/

	//1) 
	int a = 1;
	int b = 1;
	int c;
	int n = 6;
	
	int arr1[] = new int[n];
	arr1[0] = a;
	arr1[1] = b;
	
	
	for(int i=2; i<=n-1; i++) {
		c= a+b;
		a=b;
		b=c;
		arr1[i]=c;
	}
	System.out.println(Arrays.toString(arr1));
	
	System.out.println("-----------------------------------------");
	
	//2)
	Random rd = new Random();
	n=5;
	
	int arr2[] = new int[n];
	for(int i=0; i<=n-1; i++) {
		int num2 = rd.nextInt(100)+1;
		if(num2%2==0) {
			arr2[i]=num2;
		}else {
			i--;
		}
	}
	System.out.println(Arrays.toString(arr2));
	System.out.println("-----------------------------------------");
	
	
	//3)
	n=3;
	int arr3[] = new int[9];
	for(int i=1; i<=9; i++) {
		arr3[i-1] = n*i;
	}
	System.out.println(Arrays.toString(arr3));
	System.out.println("-----------------------------------------");
	
	//4)
	n=7;
	int arr4[] = new int[n];
	int cnt;
	int i =1;
	int k=0;
	
	while(true) {
		cnt=0;
		for(int j=1; j<=i; j++) {
			if(i%j==0) {
				cnt++;
			}
		}
		if(cnt==2) {
			arr4[k] = i;
			k++;
			i++;
		}else {
			i++;
		}
		
		if(k>=n) {
			break;
		}
	}
	System.out.println(Arrays.toString(arr4));
	System.out.println("-----------------------------------------");
	
	//-5) 1 이상 100 이하의 정수 중 소수를 모두 담은 배열 생성 후 출력.
	
	
	
	int count = 0;
	k=0;
	
	for(i=1; i<=100; i++) {
		cnt=0;
		for(int j=1; j<=i; j++) {
			if(i%j==0) {
				cnt++;
			}
		}
		if(cnt==2) {
			count++;   // 1부터 100까지 소수 총 몇개인지... 그래야 배열 개수 
		}	
	}
	int arr5[] = new int[count]; // 배열 그릇 완성
	
		
	for(i=1; i<=100; i++) {
		cnt=0;
		for(int j=1; j<=i; j++) {
			if(i%j==0) {
				cnt++;
			}
		}
		if(cnt==2) {
			arr5[k] = i;
			k++;
		}
	}
	
	
	System.out.println(Arrays.toString(arr5));
	System.out.println("-----------------------------------------");
}
}
