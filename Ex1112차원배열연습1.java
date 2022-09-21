package day932차원배열;

import java.util.Arrays;

public class Ex1112차원배열연습1 {
public static void main(String[] args) {
	//연습1 - 2차원 배열을 만들어서 아래에 따르세요
	//123
	//456
	//789 출력
	
	int arr[][] = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
	};
	
	for(int i=0; i<=arr.length-1; i++) {
		for(int j=0; j<=arr.length-1; j++) {
			System.out.print(arr[i][j]);
		}
		System.out.println();
	}

	System.out.println("--------------------------------------");
	
	
	
	//연습2
	//[1, 2, 3]
	//[4, 5, 6]
	//[7, 8, 9] 출력
	
	for(int i=0; i<=arr.length-1; i++) {
		System.out.println(Arrays.toString(arr[i]));  // 각각의 행을 배열로인식해서 뽑기
	}
	
	System.out.println("-------------------------------------");
	
	
	
	//연습 3 - 변경 후 출력
	//[10, 20, 30]
	//[40, 50, 60]
	//[70, 80, 90] 출력
	
	for(int i=0; i<=arr.length-1; i++) {
		for(int j=0; j<=arr.length-1; j++) {
			arr[i][j] *= 10; // *10은 각각의 값을 바꿔야 하니까 2차원배열 각각에 곱해줘야함
		}
		System.out.print(Arrays.toString(arr[i])); // 각각의 행을 배열로 출력
		System.out.println();
	}
	
	System.out.println("-----------------------------------------------------------------");
	
	//이미 배열은 모두 *10 해서  바뀐 상태 
	
	//연습4 모든 요소의 합 =_____
	//연습5 모든 요소의 평균 =_____
	//연습6 최대 값=_____
	//연습7 최소 값=_____
	//단 ! 정수형 나눗셈 가정
			
	int sum = 0;
	int avg = 0;
	int max = 0;
	int min = arr[0][0];
	
	for(int i=0; i<=arr.length-1; i++) {
		for(int j=0; j<=arr[i].length-1; j++) {
			sum += arr[i][j];	
			
			if(max<arr[i][j]) {
				max=arr[i][j];
			}
			if(min>arr[i][j]) {
				min=arr[i][j];
			}
		}
	}
	
	System.out.println("모든 요소의 합 : " + sum);
	System.out.println("모든 요소의 평균 : " + sum/(arr.length*arr[0].length));
	System.out.println("최대값 : " + max);
	System.out.println("최소값 : " + min);
	
	
	arr[0][1] = 1;
	arr[2][2] = 2;
	arr[1][0] = 3;
	arr[2][0] = 4;
	arr[1][1] = 5;
	arr[0][2] = 6;
	arr[1][2] = 7;
	arr[0][0] = 8;
	arr[2][1] = 9;
	
}
}
