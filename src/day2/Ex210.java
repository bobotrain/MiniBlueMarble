package day2;
// 삼항 연산자 : 조건식?참일 때 값:거짓일 때 값

public class Ex210 {
public static void main(String[] args) {
	
	
	int num = 5;
	int num2 = (num>0 ? 1 : -1);
	System.out.println(num2); // 1나오는 것 확인 가능
	System.out.println(num%2==0 ? "짝수" : "홀수"); // 홀수
	
	char ch = (num%2==0 ? '짝' : '홀'); // 홀
	System.out.println(ch+ "수");
	System.out.println("---------------");
	
	
}
}
