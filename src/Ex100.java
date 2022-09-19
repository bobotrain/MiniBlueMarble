// 글자크기 : [Ctrl] + [+/-]	----> "주석(Comment)"
// 저장 : [Ctrl] + [s]
// 실행 : [Ctrl] + [F11]
// 한줄삭제 : [Ctrl] + [D]

// [정리] : 주석을 작성하는 법 :	(1) //부터 그 문장 끝까지.
//						(2) /*부터 */까지.

public class Ex100 {
	public static void main(String[] args) {
		System.out.println("Hello World");	// "문자열"
		
		System.out.println(123);	// "정수" --> 소수점 이하 없는 수
		System.out.println(3.14);	// "실수" --> 소수점 있는 수
		
		String s1;	// s1이라는 이름을 선언 --> 문자열을 저장
		s1 = "Hello ";
		String s2;
		s2 = "World";
		System.out.println(s1 + s2);	// 문자열 + 문자열
		
		String name = "DH";
		// 연습: name을 이용해서 "I'm DH" 라는 형식으로 문자열 출력.
		System.out.println("I'm " + name);
		
	}
}
