package day92정렬;

import java.util.Arrays;

//insertion sort [15, 2 ,1, 7, 3]을 각각 올바른 위치에 삽입하기 -> [1,2,3,7,15]로 출력하기
public class Ex113삽입정렬 {
	public static void main(String[] args) {
		

		int[] arr = { 15, 2, 1, 7, 3 };
		
		for(int  i = 0; i<=4; i++ ) {
			for(int j=i-1; j>=0; j--) { // 오른쪽 i번쨰 배열부터 왼쪽으로 하나씩 비교해서 왼쪽으로 밀기
				// [j] vs [j+1]
				
				if(arr[j] > arr[j+1]) { //왼쪽이 더 크면 오른쪽이랑 왼쪽 배열 바꾸기.. : 더 큰 것이 오른쪽으로 가게...
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}else if(arr[j]<arr[j+1]) {
					break;
				}
				
				
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
	}

}
