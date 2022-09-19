package day2;

public class Ex203 {
public static void main(String[] args) {
	
	System.out.println(5/3);  // 같은 정수타입 = 1로 제대로 나옴 ( 정수형 나눗셈 = 소수점 x)
	System.out.println(5.24/3); // 하나는 실수(double), 하나는 정수(int) 에러가 날까?
	 // 자동형변환 방향에 따라 정수(int)가 실수(double)로 자동 형변환되어서 적용됨.
	// 따라서 /가 실수형 나눗셈으로 바뀌고 소수점까지 정확하게 나오는 것.
	
	System.out.println("-------------------------------");
	
	int a = 10;
	int b = 3;
	
	System.out.println(a+b);
	System.out.println(a-b);
	System.out.println(a&b);
	
	System.out.println(a/b);
	System.out.println(a%b);
	
	System.out.println(10.0%3);
	System.out.println(10.0/3);
	System.out.println(10%0.3);
	System.out.println(10/0.3);
	
	System.out.println("---------------------------------------");
	
	
	
	
	
	
}//main
}
