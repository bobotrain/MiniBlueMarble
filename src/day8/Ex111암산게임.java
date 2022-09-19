package day8;
import java.util.Random;
import java.util.Scanner;

public class Ex111암산게임 {
public static void main(String[] args) {
	
	//암산게임
	// - 숫자 2개(a, b) 그리고 연산자는 (+,-,*,/)를 난수발생.
	// 숫자는 한 자릿수의 정수(0이상 9이하)
	// 단, 나눗셈 연산자 이면서 b가 0이 되면 안됨! ( 난수발생하실 때, 0으로 나누는 상황 나오면 다시 난수발생시켜라 )
	
	//(실행결과의 예) 
	// 문제 1번. 5+3 = 8(엔터)
	// 문제 2번. 7-2 = 5(엔터)
	// ...
	// 문제 5번. 1*8 = 8(엔터)
	// 5문제 중 5문제 정답!
	
	Scanner sc = new Scanner(System.in);
	Random rd = new Random(); 
	String[] op = { "+", "-", "*", "/"};
	int idx1 = rd.nextInt(10); 
	int idx2 = rd.nextInt(10); 
	
	int idx3 = rd.nextInt(4);
	
	 
	String op1 = op[idx3];
	
	int cnt=0;
			
	for(int i=1; i<=5; i++  ) {
		idx1 = rd.nextInt(10);
		idx2 = rd.nextInt(10);
		idx3 = rd.nextInt(4);
		op1 = op[idx3];
		
		
		int sum = 0;
		
		if(op1.equals("+")) {
			sum =  idx1+idx2;	
		}else if(op1.equals("-")) {
			sum =   idx1-idx2;	
		}else if(op1.equals("*")) {
			sum =   idx1*idx2;	
		}else if(op1.equals("/")) {
			idx2 = rd.nextInt(9)+1;
			sum =   idx1/idx2;	
		}
		
		System.out.print("문제 " + i + "번. "+ idx1+op1+idx2 +" = ");
		int answer = sc.nextInt();
		if (answer==sum) {
			cnt++;
		}
	}//for
	System.out.println("5문제 중 "+ cnt + "문제 정답!");
}
}
