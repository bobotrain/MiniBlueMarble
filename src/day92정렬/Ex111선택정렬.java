package day92정렬;

import java.util.Arrays;

// 버블정렬 당연히 알기. ( (1)스왑이용한 오름차순 )
// 선택정렬 ( 선택정렬은 (1)최솟값 인덱스 구하기 + (2)스왑 )  

// 선택정렬 (selection sort) " [15, 2, 1, 7] -> [1, 2, 7, 15] 출력
// i : 0~2번방까지 비교
// j : i~3번방까지 비교  // 무슨말인지 이해하기 -> [최솟값의 인덱스]와 [i]하고 비교해서 서로 바꾸면 됨

public class Ex111선택정렬 {
public static void main(String[] args) {
	
	int[] arr = {15, 2, 1, 7}; 
	for(int i=0; i<=2; i++) { //2 또는 arr.length-2 / 총 4개의 항이므로 3번만 비교하면 됨. arr은 0번부터시작이니 2 빼야함
		
		//최솟값의 인덱스를 구함
		int idx=i; //최솟값 넣어둘 자리 만들어둠 // 첫번째 요소가 최소값이라고 가정하고 시작
		for(int j=i; j<=3; j++) { // 3또는 arr.length-1
			if(arr[idx] > arr[j]) {//최솟값의 인덱스를 구함.arr[idx]
				idx = j;
			}	
			
		}	
		//SWAP : [최솟 값의 인덱스 ] and [i]
		int t = arr[i];
		arr[i] = arr[idx];
		arr[idx] = t;	
	}
	System.out.println(Arrays.toString(arr));
	
}
}
