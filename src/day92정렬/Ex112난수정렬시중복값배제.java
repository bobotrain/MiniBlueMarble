package day92정렬;

import java.util.Arrays;

public class Ex112난수정렬시중복값배제 {
public static void main(String[] args) {
	
	// 랜덤값으로 배열에 난수 넣을 때, 중복값이 배제되도록 설정하기
	int[] arr = new int[6];
	
	for(int i=0; i<=5; i++) {
		int r= (int)(Math.random()*9)+1; // 1~9
		
		boolean found = false; // true이면 같은 값을 찾은 것
		for(int j=0; j<=i-1; j++) {
			//arr[j] vs r, 같은게 하나라도 있으면 --> 아래를 실행하면 안됨.(found = true;)
			if(arr[j]== r) {
				found = true;
			}
		}
		if(!found) { // 이해하기
			arr[i] = r;
		}else { // found가 true인 상황 --> 해당 i에 대한 '작업'을 한번 더 함
		 i--; // 이해 : i를 한번 더 굴리겠다. 
		}
	
	}
	System.out.println(Arrays.toString(arr));
	
	
	
}
}
