package day3;

public class Ex2222 {
public static void main(String[] args) {
	//실수의 사용은 오차를 동반한다  ( 정수와 실수의 표현범위 이해 )
	//float 소수점 6번째 자리까지 정확도를 보장함
	//double 소수점 15번째 자리까지 정확도를 보장함	
	
	
	// 실수는 근사값으로 추정하기 때문에 정수보다 표현범위가 압도적으로 넓다. (이해) 
	
	
	//0.0이라고 표현하면  double타입의 값 / 0.0f라고 표현하면 float타입의 값으로 적용 (암기)
	
	
	//0.1을 백번 더하면?
	//float num = 0.0; ERR/ 현재 0.0은 double로 적용되는데 float으로 형변환 불가. f써서 강제형변환 하자
	//float num = 0; 적으면 괜찮다/ 현재 0은 int(정수)로 적용되는데 float으로 자동형변환 가능.
	//double num = 0.0f; 적으면 괜찮다/ 현재 0.0은 float이 적용되는데 당연히 double로 자동형변환 가능.
	
	
	float num = 0.0f;
	for(int i=1; i<=100; i++) {
		num+=0.1;
		//num = num + 0.1; / ERR 
		//0.1이 double로 적용되어있음..  +=는 0.1(double)을 0.1(float)으로 강제형변환 해주는데
		//"= num+0.1;"처럼 식을 쓰면 강제형변환 안해줌... 
	}
	
	// (고급) byte, short, int, char변수들 간에  +-*/연산의 결과는 int.
	// (고급) int보다 작은 '정수형' 변수에 대입할 때, 인트 값이 해당 형으로 자동형변환된다.
	
	byte b1 = 5;
	byte b2 = 3;
	int b3 = b1 + b2; //오류 안남
	// byte b3 = b1+ b2; err -> 연산의 결과가 int이기 때문
	byte b4 = (byte)(b1 + b2); // 연산의 결과가 int가 되지 않도록 byte 지정
	//byte b4 = (byte)b1 + b2; //err -> b1만 byte로 보호... 연산자체를 byte로 보호해야하는데 그러지못했음

	char c = 65; // int값(65)이 char로 자동 형 변환되어 대입 ( 예외 )
	
	//char c2= (c+32); //err -> c+32가 int값으로 바뀜... char의 단위는 short와 동일(4byte)... 
	//int 같은 8바이트 단위는 char로 자동형변환 불가.. 오류뜸 (char은 정수형 변수가 아니기 때문에 자동형변환 불가)
	
	
	
	char c2 = 'A' + 32; // 변수를 쓰지 않았음.
	//변수들 간의 거래만 해당...위와 다른 상황임을 이해 따라서 오류 안나고 a로 아스키코드 변환가능해서 출력
	
	System.out.println(c2); // 정수 97 = 아스키코드로 a 나타냄
	
}
}
