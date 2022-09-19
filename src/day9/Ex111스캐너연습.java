package day9; // 

import java.util.Scanner;

public class Ex111스캐너연습 {
public static void main(String[] args) {
	
	
	Scanner sc = new Scanner(System.in);
	System.out.print("나이를 입력하세요 : ");
	int age = sc.nextInt();
	System.out.println("입력된 나이는 : " + age);
	sc.nextLine(); // 꼭 사이에 넣어야함 -> 입력버퍼에 줄바꿈문자가 남아있기 때문에 오류가 발생
	
	System.out.print("이름을 입력하세요 : ");
	String name = sc.nextLine();
	System.out.print("입력된 이름은 : " + name); // 어? 왜 입력이 안되지?
	
	// nextInt뒤에 nextLine이 올 때만 일어나는 버그..
	
	//따라서 sc.nextLine(); 를 중간에 넣어야 (줄바꿈문장) 오류없이 이용가능
	
	
	
	
	
}
}