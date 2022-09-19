package day92정렬;

import java.util.Arrays;

//버블정렬은 오름차순( 작은게 앞으로 ) or 내림차순
public class Ex110버블정렬 {
	public static void main(String[] args) {

		int[] arr = { 15, 2, 7, 1};
		for (int i = 3; i >= 0; i--) { // 3 또는 arr.length-1
			int temp = 0; // 스왑변수

			for (int j = 0; j < i; j++) {
				// j번째가 j+1보다 크면 교환 SWAP
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}
}
