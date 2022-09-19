package day9;

import java.util.Arrays;

public class Ex113array {
public static void main(String[] args) {
	
	int[] arr = { 10, 20, 30 }; // 0,1,2번째 방에 값 입력
	System.out.println(arr[0]); // 0번째 방 값 출력
	
	int[] arr1; // 방 만들 준비만 해놓기 -> int형 배열을 가리킬 변수 arr을 선언함.
	arr1 = new int[3]; // 방 3개 만들기
	arr1[0] = 10; // 0번째 방에 10 넣기
	
	System.out.println(arr[0]);
	System.out.println("--------------------------------");
	
	
	//1. 배열 출력 : Arrays.toString(배열이름)
	System.out.println("arr : " +  Arrays.toString(arr));
	//2. 배열 출력 : 반복문 사용.
	for(int i=0; i<=2; i++) {
		System.out.print(arr[i] + " ");
	}
	System.out.println();
	System.out.println("====================================");
	
	//3. 향상된 for문 
	// 문법 : for(변수선언 : 집단) {....}
	System.out.print("arr : ");
	for(int n : arr) {
		System.out.print(n+ " ");
	}
	
	// 배열 추가 나열 방식
	// int[] arr = new int[] { 10, 20, 30 }; // 암기 - > []이 비워져 있으면 자바가 알아서 세줌
    // 		   = new int[3] { 10, 20, 30}; // ERR.. 왜 그런지는 모름...
	// int[] arr = {10, 20, 30}; -> 간편법 : 단! 두문장으로 나눌 수 없음
	
	
	//배열의 특징
	// 1) 사이즈가 한번 결정되기 전에는 '생성' 불가능
	// 2) 일단 한번 만들고 나면, (두번 다시) 사이즈를 변경 불가능
}
}
