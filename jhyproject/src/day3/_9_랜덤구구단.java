package day3;

import java.util.Random;
import java.util.Scanner;

public class _9_랜덤구구단 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		System.out.println("== 랜덤 구구단 프로그램을 실행합니다 ==");
		System.out.println("== 정답에 0을 입력하면 종료됩니다. ==");
		int count = 0; // 전체 문제 수
		int corrextCnt = 0; // 맞춘 개수
		for(;;) {
			
			int x = ran.nextInt(8) + 2; // 2~9
			// 0 1 2 3 4 5 6 7 2를 더하면 2 3 4 5 6 7 8 9
			int y = ran.nextInt(9) + 1;// 1~9
			
			System.out.print(x + " * " + y + " = ");
			int answer = scan.nextInt();
			
			if(answer == 0) {
				System.out.println("종료되었습니다.");
				break;
			}
			
			if(x*y == answer) {
				System.out.println("정답");
				corrextCnt++;
				count++;
			} else {
				System.out.println("오답");
				count++;
			} 
		}
		System.out.println(count + "문제 중" + corrextCnt + "문제를 맞추셨습니다.");
		
		
		

	}

}
