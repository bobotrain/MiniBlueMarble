package day2;

import java.util.Scanner;

//키보드 입력
//암기1)  "Scanner sc = new Scanner(System.in);" -> "Scanner 객체 생성 문장"
//암기2) "sc.nextInt()"
public class Ex208 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("정수를 입력하세요 : ");
	int num = sc.nextInt();
	
	System.out.println("짝수냐:" + (num%2==0));
	
	
	
	
	
	
}
}
