package day9; // 

import java.util.Scanner;

public class Ex111스캐너 {
public static void main(String[] args) {
	
	
	//sc.next() : 한 단어 입력
	//sc.nextLine() : 한 문장입력
	
	Scanner sc = new Scanner(System.in);
	System.out.print("문자열 입력 : ");
	String s = sc.next();
	System.out.println("입력받은 문자열 : " + s);
	
	System.out.print("문자열 입력 : ");
	String s2 = sc.next();
	System.out.println("문자열2 : " + s2);
	 // 띄어쓰기를 기준으로 하나의 단어로 인식... _ > 오늘은 금요일 입니다 쳐보고 어떻게 나오는지 확인하기.
	
	
	//정리 : 스캐너(객체)는 입력버퍼를 바라보고 있다.
	// 스캐너를 사용해서 입력받을 때, 입력버퍼가 비어있는 상태라면 커서를 보여주고 사용자 입력을 기다린다.
	// 입력버퍼가 비어있지 않으면 (사용자 입력을 받지 않고) 입력버퍼의 내용을 가져온다. =-> 금요일 입니다를 치지 않아도 자동으로 s2에 들어가있는 이유 -> by입력버퍼
	// 따라서 스캐너 사용할 때는, 현재 입력버퍼가 비어있는지를 고려해야 함.
	
	//정수입력 
	// sc.nextByte()
	// sc.nextShort()
	// sc.nextInt()
	// sc.nextLong() 
	//실수입력
	// sc.nextFloat()
	// sc.nextDouble();    
	
	// char은 없다.
	
	//byte b = sc.nextByte(); -> b = sc.nextInt() 하면 오류남... 자동형변환 안되는 방향.. 이해하기
	
	
	
}
}