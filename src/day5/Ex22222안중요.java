package day5;

public class Ex22222안중요 {
public static void main(String[] args) {
	
	//연습 1 문자 
		char c1 = 'a'; // 97
		char c2 = 'A'; // 65
		System.out.println(c1==c2);
		
		String s1 = "abc";
		
		String s2 = new String("abc");
		// = String s2 = "abc";
		
		System.out.println(s1==s2);  // false나오는것 알 수 있음 / 즉 s1의 내용과 s2의 내용이 같냐는 표현이 아니다... 
		// 문자의 동등비교 : == 
		// 문자열의 동등비교 : 문자열.equals(문자열)
		
		System.out.println(s1.equals(s2)); // true나오는것 알 수 있음. / 즉 s1의 내용과 s2의 내용이 같냐는 표현
		System.out.println(s2.equals(s1)); // true나오는것 알 수 있음. / 즉 s2의 내용과 s1의 내용이 같냐는 표현
		
		System.out.println("----------------------------");
		
 
		//논리연산자 : && || ! ^ --> true와 false에 대한 연산.
		//비트연산자 : & | ~ ^  -> 값(2진수)에 대한 연산. // 고급
		
		/*
		&앰퍼샌드
		|파이프
		~틸트
		^캐럿
		*/
		
		//고급  &(AND연산자) : 둘 다 1이어야 1.( 그 외에는 0 ) 1이TRUE 0이 FALSE라고 생갛하면 편함
		
		System.out.println(0b0001 & 0b0011); // 이진수를 10진수를 2진수로 표현 = syso(1&3)과 같은 말이다. 
		System.out.println(1&3);
		//1출력됨을 이해하기  ->이진수의 세계에서  
		//0001 
 		//0011
		//____  세로로 계산 생각하기.
		//0001 -> 1
		
		int a = 2;
		System.out.println((a-1) & (a+10)); //1나옴 알 수 있음
		
		//고급 ~연산자(=틸드) :not연산자, 뒤집어!
		byte b = (byte)0b11110111; 
		System.out.println(~b); // -8 나오는것 이해
		//1111 0111 -> 0000 1000 (~때문에 뒤집힘 ) -> (-) 붙이기 -> -00001000 이므로 -8임을 알 수 있음	
		
		//고급의 고급
		byte b2 = (byte)0b11110111;
		System.out.println(~b2); //8나옴을 알 수 있음
		System.out.println("----------------------");
		//고급 4 |(or연산자) : 둘 중 하나라도 1이면 1
		System.out.println(1|3); //3나오는것 이해
		//0001 
 		//0011
		//____  세로로 계산 생각하기.
		//0011 -> 3 ( 이진수 ) 
		
		
		//조건식 연습
		//"num이 10보다 작으면서, 2 또는 3 또는 7이 아니라면 true"
		int num=5;
		System.out.println((num<10) && !(num==2||num==3||num==7));
		System.out.println("---------------------");
		
	    // [7/고급] ^(논리연산자)(XOR. 배타적 논리합. eXclusive-or) : 둘이 달라야  true.
		// [8/고급] ^(비트연산자) = (캐럿) (XOR) : 둘이 달라야 1
		System.out.println(0b0001^0b0011); // 2 됨을 이해하기
		//0001 
 		//0011
		//____  세로로 계산 생각하기.
		//0010 -> 2 ( 이진수 ) 
		
}
}
