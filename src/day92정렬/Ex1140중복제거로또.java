package day92정렬;

import java.util.Arrays;

public class Ex1140중복제거로또 {
public static void main(String[] args) {
	
	//(바이트 타입) 으로 로또번호 6개 출력하기
	
	
	//45개의 배열에 0을 채워넣고 랜덤의 자릿수 6개만 1로 중복없이 바꾸기 
		byte[] arr = new byte[45]; 
		
		for(int i =1; i<=6; i++) { // 6번반복
		
			//난수발생0~44
			int r = (int)(Math.random()*45); // 0이상 44이하
			
			//중복인지 아닌지 판단 필요 -> "arr[r]이 이미 1인지 판단"
			if(arr[r]==1) {
				i--; // i 다시굴려라~
				continue; //아래 진행하지말고 다시 처음부터 ~ // 여기서는 없어도됨
			}
			
			arr[r] = 1; //랜덤자릿수 1로 바꾸기
		}		
		
		
		//System.out.println(Arrays.toString(arr));
		System.out.print("발생된 로또번호 : ");
		for(int i=0; i<= 44; i++) { // i : 0~44
			if(arr[i]==1) {
				System.out.print((i+1) + " "); //1이 들어가 있는 자릿수 출력 ( 배열은 0부터시작이니까 1더해서 출력해야 자릿수나옴 )
				// 6개의 숫자가 나오거나 가끔 5개의 숫자가 나오는것 이해하기 -> 가끔 중복된 자리에 1이 들어가 있을경우... 5개의 숫자가 나옴 이해하기
			}
		}
		
		
		
	
}
}
