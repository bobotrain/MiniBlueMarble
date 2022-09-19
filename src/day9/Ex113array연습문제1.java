package day9;

import java.util.Arrays;

public class Ex113array연습문제1 {
public static void main(String[] args) {
	
	//연습
	String[] arr1; // string타입 배열만들기
	arr1 = new String[3]; //방 2개 만들기.
	
	//연습 
	// 임태훈 실행결과)
	// [곽호승, 이종환, 임태훈]
	arr1[0] = "곽호승";
	arr1[1] = "이종환";
	arr1[2] = "임태훈";
	
	System.out.println("arr : " +  Arrays.toString(arr1));
	
	
}
}
