package day9;

import java.util.Random;

public class Ex112랜덤난수주의사항 {
public static void main(String[] args) {
	
	//1~6까지의 정수중 하나를 뽑아서 출력 -> 10회반복
	//(1) Math.random() 방식 --> "0~0.999999..."로 뽑는 방법
	//0~5
	//0~5.9999999
	
	
	
	
	for(int i=1; i<=10; i++) {
		int num = (int)(Math.random()*6)+1; // 0.999999 * 6 = 거의 5.99999나오는데 거기서 (int) 강제형변환 넣으니 5만 떼어져나오고 거기서 1 더한것.
		System.out.print(num + " ");
	}
	
	
	System.out.println("====================================================");
	//(2) Random 클래스 방식
	Random rd = new Random();
	rd.setSeed(1000);
	for(int i=1; i<=10; i++) {
		//(0~5) + 1
		int num = rd.nextInt(6) +1;
		System.out.print(num + " ");
	}
	
	System.out.println("===================================");
	
	System.out.println(rd.nextInt()); // Int표현범위 내의 값 중 하나 뽑기
	System.out.println(rd.nextDouble()); // (=) Math.random() 즉 0.0~ 0.99999 사이의 값 나옴	
	
	//씨드값 설정 
	//1) rd.setSeed(System.currentTimeMillis());  -> 계속 새로운값 넣어줌으로써 일정한 패턴으로 나오는 난수마저 초기화 시켜주는 방법.
	//2) rd.setSeed(1000); -> 난수발생을 시키는데 기반이 되는 수 1000 -> 계속 같은값 나옴.
	System.out.println("=============================================================");
	
	
}
}
