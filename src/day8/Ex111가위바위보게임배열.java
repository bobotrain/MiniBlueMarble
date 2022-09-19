package day8; // 

import java.util.Random;
import java.util.Scanner;
import java.util.Scanner;

public class Ex111가위바위보게임배열 {
public static void main(String[] args) {
	//array 가위바위보 게임 만들기
	//고급 : 1) 가위/바위/보 외의 문자열 --> 제대로 될 때까지 반복
	//고급 : 2) 몇 판을 할지 입력(홀수) --> ex.5판 ----> 3판을 먼저 이기는쪽이 최종 승!
	
	Scanner sc = new Scanner(System.in);
	Random rd = new Random(); 
	String[] arr = { "가위", "바위", "보"};
	
	//1) 변수 idx <---- 0, 1, 또는 2 (난수발생)
	int idx = rd.nextInt(3); // 0이상 3미만의 정수 하나를 골라줌. (난수 발생)
	String com = arr[idx]; // idx가 0이면 com은 가위, 1이면 바위, 2이면 보 나올것
	
	
	System.out.print("몇 판을 하시겠습니까? : ");
	int cnt = sc.nextInt();
	int finish = cnt/2+1;
	int winP = 0;
	int winC = 0;
	
	System.out.print("가위, 바위, 보 입력 : ");
	String player = sc.next(); // 또는 sc.nextLine();
	

	while (true) {
	
		while(!(player.equals("가위")||player.equals("바위")||player.equals("보"))) {
		System.out.print("잘못된 입력입니다. 다시 입력해주세요 : ");
		player = sc.next();
		}
		
		System.out.println("com : "+ com);
		
		if( (player.equals("가위")&& com.equals("보")) 
				|| (player.equals("바위")&& com.equals("가위"))
				|| (player.equals("보")&& com.equals("바위")) ) {
			System.out.println("플레이어 : " + player + ", 컴 : " + com + "-----> 플레이어 승리!" );
			winP+=1;
			
			
		}else if(  (player.equals("가위")&& com.equals("바위")) 
				|| (player.equals("바위")&& com.equals("보"))
				|| (player.equals("보")&& com.equals("가위")) ) {
			System.out.println("플레이어 : " + player + ", 컴 : " + com + "-----> 컴 승리!" );
			winC+=1;
		
			
		}else if( (player.equals("가위")&& com.equals("가위")) 
				|| (player.equals("바위")&& com.equals("바위"))
				|| (player.equals("보")&& com.equals("보"))
				) {
				System.out.println("플레이어 : " + player + ", 컴 : " + com + "-----> 비기셨습니다!" );
		
		}
		
		
		if(winP==finish) {
			System.out.println("플레이어의 승리");
			break;
		}else if(winC==finish) {
			System.out.println("컴퓨터의 승리");
			break;
		}
		idx = rd.nextInt(3);
		com = arr[idx];
		System.out.print("가위, 바위, 보 입력 : ");
		player = sc.next();
		System.out.println("com : "+ com);
	
	}//while
}
}
