// int형 변수에 byte형 값을.
// byte형 변수에 int형 값을.

public class Ex107 {
	public static void main(String[] args) {
		byte b = 10;
		int num = b;
		System.out.println(num);	// 10
		// 이해 : 1바이트 공간에 있는 정보를 4바이트 공간으로 가져다 놓을 수 있음.
		//		(정보의 소실 우려가 없음 ---> 그러니까 가능해)
		
		int num2 = 10;
		//byte b2= num2;	// ERR
		// 이해 : 4바이트 공간에 있는 정보를 1바이트 공간으로 가져다 놓을 수 없음!
		//		(정보의 소실 우려가 있음 ---> 그러니까 안돼!)
		
		
		
	}
}
