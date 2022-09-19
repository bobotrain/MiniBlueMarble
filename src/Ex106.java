// 변수(Variable) : 값이 '변'할 수 있어서 변수.
// 상수 : 항'상' 그 값이어서 상수.
// "변수의 선언" 앞에 final 키워드를 사용 ----> '상수'가 됨.

public class Ex106 {
	public static void main(String[] args) {
		final int a = 5;
		// a = 10;	// ERR.(이해)		--> a는 상수로 선언되었기 때문에 값을 변경할 수 없음
		// a = 15;	// ERR.(이해)
		
		// 변수의 이름은 소문자로 시작하지만,
		// 상수의 이름은 전체대문자로.
		final double PI = 3.141592;
		

	}
}
