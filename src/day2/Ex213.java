package day2;
//for문
public class Ex213 {
public static void main(String[] args) {
	for(int i=1; i<=10; i++) {
		System.out.print(i + " ");
	}
	
	System.out.println();
	
	
	//연습2. 5 6 7 8 9 출력하세요
	
	for(int i = 5; i<=9; i++) {
		System.out.print(i+" ");
	}
	System.out.println();
	
	//연습3 9 8 7 6 5 출력하세요
	for(int i =9; i>=5; i--) {
		System.out.print(i+" ");
	}
	System.out.println();
	
	//연습4 1 3 5 7 9 11 출력하세요
	
	for(int i=1; i<=11; i+=2) {
		System.out.print(i+" ");
	}
	System.out.println();
	
	//연습5 -2 -4 -6 -8 출력하세요
	for(int i=-2; i>=-8; i-=2) {
		System.out.print(i+" ");
	}
	System.out.println();
	
}
}
