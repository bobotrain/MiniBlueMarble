// 두 변수.
// 실행은, 먼저 머리로 실행해보고나서, 실행(Ctrl+F11)하세요.

public class Ex103 {
	public static void main(String[] args) {
		int num = 5;
		int num2 = num;	// 이해 : 'num2가 num과 같다'는 뜻이 아님!
		num = num + 1;	// 체크 : = 은 오른쪽을 정리해서 왼쪽에 담는다.
		System.out.println("num : " + num);		// 6
		System.out.println("num2 : " + num2);	// 5
		

	}
}
