package day5;

import java.util.Scanner;

public class Ex3반복문응용 {
public static void main(String[] args) {
	
	//고급1 (실행결과 다음과 같이 나오게 하라)반복문 아는 사람만
	// 정수입력 : 15328 (엔터) --> 다섯자리여야만 하는건 아님
	// 거꾸로 : 82351
	// 모든 자릿수의 합 : 19    // 8+2+3+5+1=19
	
	Scanner sc = new Scanner(System.in);
	System.out.print("정수입력 : ");
	int num = sc.nextInt();
	int num1 = num;
	System.out.print("거꾸로 : ");
	int sum=0;
	
	
	while (num > 0){
	System.out.print(num % 10);  
	num=num/10;
	} 
	System.out.println();
	
	for(int i=num1; i>0; i/=10){ 
		int j = i;
		j %= 10;
		sum+=j;
		} 
	System.out.println("모든 자릿수의 합 : "+ sum);
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
