package day7;

public class Ex207 {

	public static void main(String[] args) {
	
		//연습7. 1부터 100까지의 정수 중 "7의 배수가 아니면서 13의 배수인" 수를 출력.
		
		for(int i =1; i<=100; i++) {
			if(i%7!=0 && i%13==0) {
				System.out.println(i);
			}
		}
		
		System.out.println("---------------------------");
		//(연습7-추가고급연습) continue; 를 사용하는 방식으로 바꿔보세요.
		
		int j = 1;
		while(j<=100) {
			if(j%7==0 || j%13!=0) {
			j++;
			continue;
			}
			System.out.println(j);
			j++;
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
		
		
		
		
		
			
	}
