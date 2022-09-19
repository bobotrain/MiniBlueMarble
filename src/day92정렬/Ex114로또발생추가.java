package day92정렬;

import java.util.Arrays;

public class Ex114로또발생추가 {
	public static void main(String[] args) {

		// 추가고급연습 ( int 타입으로 쉽게 해보자 !)
		// 6개의 자리에 0부터 44개의 숫자 랜덤해서 넣기
		// 1) 중복제거
		// 2) 오름차순 정렬. // 정렬 알고리즘 직접 구현.

		int[] arr = new int[6];

		for (int i = 0; i <= 5; i++) { // 6번반복

			// 난수발생0~44 해서 6자리에 채워넣기
			int r = (int) (Math.random() * 45); // 0이상 44이하

			// 중복제거
			boolean found = false; // true이면 같은 값을 찾은 것
			for (int j = 0; j <= i - 1; j++) {
				// arr[j] vs r, 같은게 하나라도 있으면 --> 아래를 실행하면 안됨.(found = true;)
				if (arr[j] == r) {
					found = true;
				}
			}
			if (!found) { // 이해하기
				arr[i] = r;
			} else { // found가 true인 상황 --> 해당 i에 대한 '작업'을 한번 더 함
				i--; // 이해 : i를 한번 더 굴리겠다.

			}
		}
		System.out.println(Arrays.toString(arr));

		// 오름차순
		for (int i = 5; i >= 0; i--) { // 6번반복
			int temp = 0;
			for (int j = 0; j < i; j++) {
				if (arr[j] >= arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.print(Arrays.toString(arr));

	}
}
