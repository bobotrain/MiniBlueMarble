package day2;

import java.util.Scanner;

public class Ex209 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	//증감연산자 : ++ --
	int num = 6;
	num++;
	System.out.println(num); //7
	System.out.println(num++); //7
	System.out.println(++num); //9
	System.out.println(num); //9
	System.out.println(++num); //10
	System.out.println(--num); //9
	
	System.out.println("-----------------------");
	num=5;
	int num2 = num--; //num2 = 5  ( num2 에 num을 넣을 당시에는 5이다.)
	System.out.println(num); // 4
	System.out.println(--num2); //4
	
	
	
	
	
	
}//main
}
