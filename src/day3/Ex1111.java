package day3;

public class Ex1111 {
public static void main(String[] args) {
	
	byte b = 3;
	short s = b;
	int i = s;
	long lo = i;
	float f = lo;
	double d= f;
	System.out.println(d);
	
	char c = 'A';
	int i2 = c;
	System.out.println(i2);
	System.out.println(c);	
	System.out.println(c+1); // 알파벳에 정수가 더해지면 65로 강제형변환 되어서 연산됨
	
	// d : 3.0 ( double 타입 )
	// double - > int 자동형변환 불가
	// double - > int 강제형변환은 가능
	
	int i3 = (int)d; // 강제형변환 시키면 오류 없어짐. 가능... 단 정보의 소실 우려 있음
	
	//"강제 형 변환" : 강제로 형(type) 변환을 시킴.
	//"(변환할 데이터 타입) 값"
	//ex : (int)3.7 --> 3 (소수점 뒤를 그냥 밀어버림.. 정보의 소실 )
	
	System.out.println((int)3.7);
	System.out.println((int) -4.7);

	System.out.println("---------------------");
	
	int num = 5;
	int num2 = 10;
	System.out.println("num+num2 : " + num + num2); // 문자열과 무언가를 더했을 때, 그 결과는 문자열...
	// 절대 15가 나올 수 없고 단순하게 문자열끼리의 결합으로 들어감. 
	//따라서 문자열로 강제형변환 되어서 num과 num2가 문자열로 인식됨.
	
	System.out.println("----------------------------");
	
	System.out.println(num + num2 + "num+num2 : "); // 이것은 내가 알고 있는 방식으로 정수와 문자열의 결합!
}
}
