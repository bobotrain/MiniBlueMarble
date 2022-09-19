package day5;

import java.util.Scanner;

public class Ex5조건문연습문제1 {
public static void main(String[] args) {
	
	//연습1 기본 
	//switch문 사용하여 해라
	//요일을 한글로 입력 받아서(String input = sc.next(); 사용)
	//영어(SUN / MON/ TUE/ WED/ THU / FRI/ SAT)로 출력
	//실행결과의 예 : 
	// 요일 입력 : 일 (엔터)
	// 일요일은 SUN
	// * 문자열의 동등비교 : "문자열.eqauls(문자열)"
	
	Scanner sc = new Scanner(System.in);
	System.out.print("요일입력 : ");
	String input = sc.next();
	switch(input) {
		case "일":
			System.out.println("일요일은 SUN");
			break;
		case "월":
			System.out.println("월요일은 MON");
			break;
		case "화":
			System.out.println("화요일은 TUE");
			break;	
		case "수":
			System.out.println("수요일은 WED");
			break;
		case "목":
			System.out.println("목요일은 WED");
			break;
		case "금":
			System.out.println("금요일은 FRI");
			break;
		case "토":
			System.out.println("토요일은 SAT");
			break;
		default :
			System.out.println("잘못된 요일입니다.");
			break;
	}
	System.out.println("=======================");
	
	//연습2(고급). switch를 이용한 계산기(1)
	//(실행결과의 예)
	//정수1 : 3 (엔터)
	//연산자 : + (엔터)
	//정수2 : 5 (엔터)
	//3 + 5 = 8
	System.out.print("정수1 : ");
	int num1 = sc.nextInt();
	System.out.print("연산자 : ");
	String op = sc.next();
	System.out.print("정수2 : ");
	int num2 = sc.nextInt();
	System.out.print(num1 + op + num2 +" = ");
	switch(op) {
	case "+" :
		System.out.println(num1+num2);
		break;
	case "-" :
		System.out.println(num1-num2);
		break;	
	case "*" :
		System.out.println(num1*num2);
		break;	
	case "/" :
		System.out.println(num1/num2);
		break;			
	}
	
	System.out.println("=============================");
	
//연습3(고급) . switch를 이용한 계산기 (2)
	//실행결과의 예 : 
	// 숫자1 : 3(엔터)
	// 연산자 : +(엔터)
	// 숫자2 : 5.5(엔터)
	// 3 + 5.5 = 8.5
	
	System.out.print("정수1 : ");
	float num11 = sc.nextFloat();
	System.out.print("연산자 : ");
	String op1 = sc.next();
	System.out.print("정수2 : ");
	float num22 = sc.nextFloat();
	float sum1 = num11+num22;
	
	
	System.out.print(num11*10%10==0?((int)num11)+"":num11+""); // ""를 붙힌 이유는 삼항연산자의 한계때문에... -> 삼항연산자에서는 뒷항이 float이면 앞항을 강제로 (int)
	//로 적더라도 둘다 float으로 강제형변환 해서 적용. 따라서 둘 다 문자열로 만들어 주면 (String valueOf쓰거나 뒤에 "" 붙혀서 문자열의 나열로 바꿈) 본래의 형태 유지가능한 상태에서
	//강제형변환 막을 수 있음
	
	System.out.print(" " + op1 + " ");
	
	System.out.print(num22*10%10==0?(int)num22+"":num22+"");
	
	System.out.print(" = ");
	
	switch(op1) {
	case "+" :
		sum1=num11+num22;
		break;
	case "-" :
		sum1=num11-num22;
		break;	
	case "*" :
		sum1=num11*num22;
		break;	
	case "/" :
		sum1=num11/num22;
		break;			
	}
	
		System.out.print(sum1*10%10==0?(int)sum1+"":sum1+"");
	
}
}
