package day92정렬;

import java.util.Arrays;

public class Ex115향상된for문 {
public static void main(String[] args) {
	
		int[] arr = {15, 2, 1, 7}; // -> {-15, 2, -1, 7}
	    //만약에 이 배열의 요소가 홀수이면 -부호를 붙혀라
		
		
		for(int n : arr) {
			if(n%2!=0) {
				n= -n;
			}
			System.out.print(n + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(arr)); // arr 의 값은 변한게 없다
	
	}
}
