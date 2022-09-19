// 연습
// [암기] "자동 형 변환 규칙"
//		byte -> short -> int -> long -> float -> double
public class Ex108 {
	public static void main(String[] args) {
// 1) 정수형 값을 저장할 변수 a를 선언하고 33으로 초기화.
		int a;
		a = 33;
		
// 2) 실수형 값을 저장할 변수 b를 선언하고 3.14로 초기화.
		double b;
		b = 3.14;
		
// 3) 한 문자를 저장할 변수 c를 선언하고 '가'로 초기화.
		char c;
		c = '가';
		
// 4) 두 변수 x,y를 사용해서 아래와 같은 코드를 이용하여,
//	  5 + 3을 계산하려 합니다. 빈칸을 채워보세요.
// 	  ______ = ____;
// 	  int y = 3;
//	  System.out.println(x+y);
		int x = 5;
		int y = 3;
		System.out.println(x + y);
		
// 5) x2가 5이고 y2가 3일떄 -- 두 변수를 선언하고 그렇게 초기화 --
//	 이 두 변수의 합을 변수 z에 저장 한 후, z를 출력.
		int x2 = 5;
		int y2 = 3;
		int z = x2 + y2;
		System.out.println(z);
		
// 6) 3.14를 PI라는 이름의 상수에 대입하고,
// 	  10을 r이라는 이름의 변수에 대입한 후,
//	  원의 넓이(PI * r * r)를 변수 area에 대입한 후, area를 출력.
		final double PI = 3.14;
		int r = 10;
		double area = PI * r * r;
		System.out.println(area);
		
	}
}
