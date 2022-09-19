package day7;

import java.util.Scanner;

public class Ex209 {

	public static void main(String[] args) {
		

		/*
		연습9. (실행결과) 1 -4 9 -16 25 -36 49 -64 81 -100
		Hint. 코드의 일부:
			for(int i=1; i<=10; i++) {
				if(i%2==0){
				syso(-i*i+" ")
				
			}
		*/
	
		int j;
		int i=1;
		for(j = 3; j<=19; j+=2) {
			System.out.print(i +" ");
			if(i>=0) {
				i+=j;
			}else {
				i-=j;
			}
			i*=-1;	
		}//for
		
		
		
		
		
		
		
		
		
	}//main

}
