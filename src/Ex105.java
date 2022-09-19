// 변수에 값을 저장할 때, '표현범위' 내의 값만!
// byte ----> "1바이트 정수"
// byte의 표현범위 : -128 부터 +127 까지(256가지, 2^8)		// 기억 ★
// int -----> "4바이트 정수"
// int의 표현범위 : -21억쯤 부터 +21억쯤 까지	// 기억 ★

public class Ex105 {
	public static void main(String[] args) {
		byte b;
		b = -128;
		b--;	// (나중에) 변수 b의 값을 1 감소.	// 의도: -128 -> -129
		System.out.println(b);	// 이해 : 절대로, b로는 -129를 표현할 수 없음!
		
		int num;	// 4바이트 정수
		num = -21_0000_0000;	// 실행될 때, 이 언더바(_)는 무시됨.
		System.out.println(num);
		
	}
}
