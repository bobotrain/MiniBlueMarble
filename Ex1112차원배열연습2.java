package day932차원배열;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex1112차원배열연습2 {
	public static void main(String[] args) {
		/*
		  아래의 빈칸에 코드를 작성하여 제시된 실행결과를 만들어보세요.
			int[] arr1 = { 1,3,5,7 };

			여기에 작성 

			sysout(Arrays.toString(arr1));
			sysout(Arrays.toString(arr2));

			int[] arr3;
			여기에 작성 

			sysout(Arrays.toString(arr3));

			(실행결과)
			arr1 : [1, 3, 5, 7]
			arr2 : [6, 4, 2]
			arr3 : [1, 3, 5, 7, 6, 4, 2]
					
			*/
			
	int[] arr1 = {1,3,5,7};
	
	int[] arr2 = {6,4,2};
	System.out.println(Arrays.toString(arr1));
	System.out.println(Arrays.toString(arr2));
			
	int[] arr3;	
	
	arr3 = new int [7];
	int k=1;
	int s=6;
	for(int i=0; i<=6; i++) {
		
		if(i>=4) {
			arr3[i]=s;
			s-=2;
		}else {
			arr3[i]=k;
			k+=2;
		}
	}
	
	System.out.println(Arrays.toString(arr3));	

	}
}
