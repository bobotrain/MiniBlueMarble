package day5;

public class Ex6반복문 {
public static void main(String[] args) {
	//for / while / do while
	
	
	int i;
	//for문 예제 1: 1 2 3 4 출력
	for(i= 1; i<=4; i++) {
		System.out.print(i + " ");
	}
	System.out.println(); // 줄바꿈
	
	
	//while 변환 : 위 예제1과 같음을 이해하기
	i=1;
	while(i<=4){ 
		System.out.print(i + " ");
		i++;
	}
	System.out.println();
	
	//do while문 : 위 예제1과 같음을 이해하기
	i=1;
	do {
		System.out.print(i + " ");
		i++;
	}while(i<=4);
	System.out.println();
	
	//while문과 for문을 자유자재로 바꿔서 적을줄 알아야함.
	
	//연습 0 1 2 3 4 5 을 while문으로 do while문으로 출력
	i=0;
	while(i<=5) {
		System.out.print(i + " ");
		i++;
	}
	System.out.println();
	
	//연습 0 1 2 3 4 5 을 do while문으로 출력
	i=0;
	do {
		System.out.print(i + " ");
		i++;
	}while(i<=5);
	System.out.println();
	
	
	
	
	
	
	
	
	
	
	
}
}
