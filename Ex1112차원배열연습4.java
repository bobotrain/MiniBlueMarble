package day932차원배열;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1112차원배열연습4 {
public static void main(String[] args) {
	/*
	고급연습4. 배열을 하나 만든 후,
	arr1 : [1, 3, 2, 4, 5]
   	사용자로부터 입력받은 값을 네 번째 요소에 추가.
   	아래와 같은 실행결과가 되도록 코드를 작성하세요.
	int[] arr1 =  여기에 작성  ;

	여기에 작성 

	sysout("arr2 : " + Arrays.toString(arr2));

	여기에 작성 

	sysout("arr1 : " + Arrays.toString(arr1));

	(실행결과)
	네 번째 요소에 추가할 숫자 입력 : 7 (엔터)
	arr2 : [1, 3, 2, 7, 4, 5]
	arr1 : [1, 3, 2, 7, 4, 5]
			
	*/
	Scanner sc = new Scanner(System.in);
	
	int[] arr1 = {1, 3, 2, 4, 5};	
	
	
			
	System.out.print("네 번째 요소에 추가할 숫자 입력 : ");
	int num = sc.nextInt();
	int addIndex = 3;

	int cnt=0;
	int[] arr2 = new int[6];
	for(int i=0; i<=4; i++) {
		if(i==addIndex) {
			arr2[cnt] = num;	
			cnt++;
		}
		arr2[cnt]=arr1[i];
		cnt++;
	}
	
	System.out.println("arr2 : " + Arrays.toString(arr2));
	
	arr1=arr2; // 가능
	
	System.out.println("arr1 : " + Arrays.toString(arr1));
	
}
}
