package day9;

import java.util.Random;

public class Ex112랜덤연습 {
public static void main(String[] args) {
	
	//간단한 연습. 
	//로또번호 생성기 // (1 ~ 45) 6개의 숫자
	//(중복된 값이 허용되는 문제가 있는데... 뒤에서)
	//(실행결과의 예) 6 1 19 12 36 27 
	
	Random rd = new Random();
	for(int i=1; i<=6; i++) {
		int num = rd.nextInt(45)+1;
		System.out.print(num + " ");
	}
	
}
}
