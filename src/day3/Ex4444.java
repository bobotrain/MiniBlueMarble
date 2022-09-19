package day3;

import java.util.Scanner;

public class Ex4444 {
public static void main(String[] args) {
	
	//정수리터럴, 0b___(이진수), 0______(8진수), 0x______(16진수), 그냥쓰면 당연히 10진수
	//참고로 대/소문자는 무관 0B,0O,0X로 써도 상관X
	
	int num = 5; // num : 변수, 5 : 리터럴(정수)
	final int NUM2 = 55; //리터럴(정수)로 55
	final int NUM3 = 0x55; //16진수로 55 -> 리터럴(정수)로는 85
	final int NUM4 = 055; //8진수로 55 -> 리터럴(정수)로는 45
	final int NUM5 = 0b01111111; //2진수로 0111 1111 -> 리터럴(정수)로는 127
	
	System.out.println(NUM2);
	System.out.println(NUM3);
	System.out.println(NUM4);
	System.out.println(NUM5);
	
	System.out.println("-----------------------------------------");
	// 연습 1)  12를 2진수 리터럴, 8진수 리터럴, 16진수 리터럴로 각각 표현.
	// sysout(_____________); //12
	// sysout(_____________); //12
	// sysout(_____________); //12
	
	System.out.println(0b1100);
	System.out.println(014);
	System.out.println(0xC);
	
	
	// 연습 2) 
	// 1. 8진수 정수 리터럴을 사용하여, 7과 14와 21을 출력
	// 2. 16진수 정수 리터럴을 사용하여, 7과 14와 21을 출력
	
	System.out.println(07); 
	System.out.println(016);
	System.out.println(025);

	System.out.println(0x7);
	System.out.println(0xE);
	System.out.println(0x15);
	System.out.println("---------------------");
	
	//연습 3)
	// 화씨온도를 섭씨온도로 바꾸기 공식: C = 5/9 * ( F -32 ) 
    // 1)정수 값을 입력받아서 화씨온도 입력
	// 2)입력받은 화씨온도를 섭씨온도로 변환 후 출력. 
	// 단 섭씨온도는 int로 화씨온도는 float으로 받기
	// 고급 : 소수첫째자리까지만 나타내기 ( 배운것만 이용 )
	 
	System.out.print("화씨 : ");
	Scanner sc = new Scanner(System.in);
	int F = sc.nextInt();
	float C = 5*(F-32)/9f;
	
	
	System.out.println("------------------");
	
	//내코드
	int C2 = (int)C; // 몫만 발라내기
	
	float C3 = (float)(C-C2);
	C3*=10;
	int C4 = (int)C3; // 나머지만 발라내서 붙이기
	System.out.println(C2+"."+C4);
	
	//정답코드
	C*=10; // 소수점 첫째자리까지 살리고
	System.out.println((int)C/10.0f); //소수점 아래로 다 버리고 다시 첫째자리 살리기 위해 10으로 실수나눔해줌..		
}
}
