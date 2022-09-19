package day5;

import java.util.Scanner;

public class Ex3333 {
public static void main(String[] args) {
	//증감연산자
	//num++; // 후위(postfix 후치)
	//++num; // 전위(prefix. 전치)
	
	int num = 5;
	System.out.println(num++); // 5
	System.out.println(num); // 6
	
	int num2 = num--; 
	System.out.println(num); //5
	System.out.println(num2); //6
	
	//삼항연산자 ( 설명 생략 )
	
	//예제 : 정수하나를 입력받아서 절대 값을 출력. (삼항연산자 써라 )
	// (실행결과) 정수 : -3(엔터)
    //                 -> 3
	// (실행결과) 정수 : 37(엔터)
	//                  ->37
	
	Scanner sc = new Scanner(System.in);
	System.out.print("정수 : ");
	
	int num3 = sc.nextInt();
	System.out.println(num3<0?-num3:num3);
	
	
	
	
}
}
