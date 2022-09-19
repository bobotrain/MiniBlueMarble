package day91;

import java.util.Scanner;

import java.util.Random;

public class Ex4배열연습부루마블 {
	public static void main(String[] args) {

		/*
		 * 부루마블 만들기 초기지급금액 : 2000 나라별 각겨 : 1번나라 100원 /2번나라 200원 .../ 7번나라 700원 처음으로 땅에
		 * 걸리면 무조건 구매 가정 -> 만약 남이 구매한 땅에 걸리면 그 나라 가격만큼 땅 주인에게 지급 ex) player가 4번나라를 400원에
		 * 구매 -> com이 4번나라를 밟음 -> com -=400; player +=400;
		 * 
		 * 한바퀴 돌면 100원 월급받음 주사위를 굴리지 않으면 게임 종료 0원되면 게임 종료 게임순서 player부터 시작
		 * 
		 * (출력화면 예시) 4 5 6 [1] 1번나라 Player (보유금액 : 1000) [2] 2번나라 3 7 [3] 3번나라 Com (보유금액
		 * : 500) [4] 4번나라 2 1 0 [5] 5번나라 [6] 6번나라 [7] 7번나라 [0] 출발지
		 */

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		String[] arr = { "[1] 1번나라", "[2] 2번나라", "[3] 3번나라", "[4] 4번나라", "[5] 5번나라", "[6] 6번나라", "[7] 7번나라",
				"[0] 출발지" };
		String[] position = { " ", " ", " ", " ", " ", " ", " ", " ", };
		int[] position1 = { 1, 2, 3, 4, 5, 6, 7, 0 };

		int dice1 = 0; // player 주사위
		int dice2 = 0; // computer 주사위
		int Pmoney = 2000;
		int Cmoney = 2000;

		int[] ground1 = { 0, 0, 0, 0, 0, 0, 0, 0 }; // 플레이어 땅 구매여부 ( 0 : 미구매 / 1: 구매된 상태 ) // 1번땅 ~ 8번땅
		int[] ground2 = { 0, 0, 0, 0, 0, 0, 0, 0 }; // 컴퓨터 땅 구매여부

		while (true) { // 게임 끝날 때 까지 무한반복

			for (int k = 0; k <= 7; k++) { // 완전히 초기화 - > 나라옆에 플레이어와 컴퓨터 위치 표시하고 보유금액 표시하는 칸. 0으로 비워뒀다가 필요할때만 표시되도록.. 
				position[k] = " ";
			}

			System.out.print("주사위를 굴리시겠습니까? : ");
			String agree = sc.next();

			if (agree.equals("y")) {// 주사위 굴렸을 때,

				// <플레이어>
				int dice = rd.nextInt(6) + 1;
				System.out.println("플레이어 주사위 결과 : " + dice);
				dice1 += dice;

				if (dice1 >= 8) {// 주사위 카운트 초기화 ->8번나라는 없음. 7번나라까지 돌고 그 이후부터는 [0]출발지부터 다시 돌아야 하기 때문 
					dice1 -= 8;

					Pmoney += 100;
					System.out.println("플레이어가 월급 100원을 얻었습니다!"); // 월급지급
				}

				// 플레이어 처음으로 땅 밟았을 때, 땅 구매
				for (int i = 0; i <= 7; i++) {
					if (position1[i] == dice1) {
						if (ground1[i] == 0 && ground2[i] == 0 && !(dice1 == 0)) {
							ground1[i] = 1;
							Pmoney -= (i + 1) * 100;
						}
						// 컴퓨터 땅 밟았을 때, 통행료 지불 + 지불한 통행료 컴퓨터 통장으로 입금
						if (ground2[i] == 1) {
							Pmoney -= (dice1) * 100;
							Cmoney += (dice1) * 100;
						}

					}
				} // for

				for (int i = 0; i <= 7; i++) {
					if (position1[i] == dice1) {
						position[i] += "Player (보유금액 : " + Pmoney + ")"; // 현재 머물고 있는 위치에 각 플레이어 표시 & 플레이어 보유금액 표시

					}
				}

				// <컴퓨터>
				dice = rd.nextInt(6) + 1;
				System.out.println("COM주사위 결과 : " + dice);
				dice2 += dice;

				if (dice2 >= 8) {// 주사위 카운트 초기화
					dice2 -= 8;
					Cmoney += 100;
					System.out.println("Com이 월급 100원을 얻었습니다!");
				}

				// 컴퓨터 처음으로 땅 밟았을 때, 땅 구매
				for (int i = 0; i <= 7; i++) {
					if (position1[i] == dice2) {
						if (ground1[i] == 0 && ground2[i] == 0 && !(dice2 == 0)) {
							ground2[i] = 1;
							Cmoney -= (i + 1) * 100;
						}
						// 플레이어땅 밟았을 때, 통행료 지불 + 지불한 통행료 플레이어 통장으로 입금
						if (ground1[i] == 1) {
							Cmoney -= (dice2) * 100;
							Pmoney += (dice2) * 100;
						}
					}
				} // for

				for (int i = 0; i <= 7; i++) {
					if (position1[i] == dice2) {
						position[i] += "Com (보유금액 : " + Cmoney + ")";

					}
				}

			} else {
				System.out.println("게임이 종료되었습니다"); // 게임종료
				break;
			}

			// 출력화면
			System.out.println("4   5   6    " + arr[0] + "  " + position[0]);
			System.out.println("             " + arr[1] + "  " + position[1]);
			System.out.println("3       7    " + arr[2] + "  " + position[2]);
			System.out.println("             " + arr[3] + "  " + position[3]);
			System.out.println("2   1   0    " + arr[4] + "  " + position[4]);
			System.out.println("             " + arr[5] + "  " + position[5]);
			System.out.println("             " + arr[6] + "  " + position[6]);
			System.out.println("             " + arr[7] + "  " + position[7]);

			if (Pmoney <= 0) {// 게임종료 코드
				System.out.println("COM 승리");
				break;
			} else if (Cmoney <= 0) {
				System.out.println("Player 승리");
				break;
			}

		} // while

	}// main
}
