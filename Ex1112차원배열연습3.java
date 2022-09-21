package day932차원배열;

import java.util.Arrays;

public class Ex1112차원배열연습3 {
public static void main(String[] args) {
	
	/*
	고급연습3. 배열을 하나 만든 후,
	arr1 : [1, 3, 2, 4, 5]
			아래와 같은 실행결과가 되도록 코드를 작성하세요.

			int[] arr1 =  여기에 작성  ;
	int delIndex = 2;    // 세 번째 요소를 삭제하려 함.

	 여기에 작성 

	 sysout("arr2 : " + Arrays.toString(arr2));
	 
	 (실행결과)
	 arr2 : [1, 3, 4, 5]   // 배열은 한번 바꾸면 고정이니 arr2새로만들어야함
	*/
	
	int arr1[] = {1, 3, 2, 4, 5};
	int delIndex = 2;

	int cnt=0;
	int[] arr2 = new int[4];
	for(int i=0; i<=4; i++) {
		if(i==delIndex) {
			continue;
		}
		arr2[cnt]=arr1[i];
		cnt++;
	}

	 System.out.println("arr2 : " + Arrays.toString(arr2));
	
}
}
