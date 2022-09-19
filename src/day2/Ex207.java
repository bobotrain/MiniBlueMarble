package day2;

public class Ex207 {
public static void main(String[] args) {
	// 논리연산자 : && || ( true , false 에 대한 연산 -> 연산의 결과도 true, false로 나온다.)
	// & : 앰퍼샌드 ( ampersand )
	// || : 파이프( pipe )
	
	// && (and 연산자) : 둘 다 true여야만 true
	// || (or 연산자) : 둘 중 하나라도 true이면 true
	
	int n = 4;
	System.out.println(n>3 && n<10); // true
	
	System.out.println("-------------------------");
	//연습. 
	// "num이 짝수이면서 (num이) 0보다 크냐?"
	int num = 16;
	System.out.println(num%2==0 && num>0); // true가 나오게 하려면 앞쪽 식 == 써야함.. ture와 false를 비교
	
	System.out.println("---------------------------------");
	
	//연습1. 해석
	System.out.println(num>10 || num%2==0); // num이 10보다 크거나 짝수이면 true -> true나옴
	System.out.println(num>5 || num%2!=0); // num이 5보다 크거나 짝수가 아니면 true -> true나옴
	System.out.println("---------------------------------");
	
	//연습2. "num이 홀수이거나 5이상이냐?"
	System.out.println(num%2!=0 || num>5);
	
	//연습3. "num이 0보다 작거나 짝수냐?"
	System.out.println(num<0 || num%2==0);
	
	//연습4. "num이 7의 배수냐?"
	System.out.println(num%7==0);
	
	//연습 5. "a가 5 또는 6 또는 7이냐?"
	int a= 57;
	System.out.println(a==5 || a==6 || a==7  );
	//연습 6. 
	System.out.println("a의 일의자리 숫자는 : " + a%10);
	
	
	
}
}
