package day8;
// 1 1 2 3 5 8 13 21 34 55 ...
public class Ex111피보나치수열 {
public static void main(String[] args) {
	
	// 반복할 내용 : 1) c를 계산 2) c를 출력 3) a,b를 이동.
	
	int a = 1;
	int b = 1;
	int c;
	System.out.print(a + " " + b + " "); // 첫 번째 항과 두 번째 항을 출력
	for(int i=1; i<=8; i++) {// 세 번째 항부터 열 번째 항까지 출력. 2부터 출력하라는 뜻
		c = a + b; 
		System.out.print(c + " ");
		a=b;
		b=c;
	}
	
}
}
