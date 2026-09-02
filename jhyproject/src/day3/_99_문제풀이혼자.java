package day3;

import java.util.Random;
import java.util.Scanner;

public class _99_문제풀이혼자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 카페에 '랜덤구구단 연습문제' 게시글에 있는
		// 이미지처럼 동작하도록 코드 작성
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		System.out.println("== 랜덤 구구단 ==");
		System.out.println("[ (1)구구단 시작 (2)구구단 종료 ]");
		System.out.println("문제수를 입력해주세요 :");
		int count = 0;
		int corrextCnt = 0;
		for(;;) {
			
			int x = ran.nextInt(8) + 2;
			int y = ran.nextInt(9) + 1;
			
			System.out.print(x + " * " + y + " = ");
			int answer = scan.nextInt();
			
			if(answer == 2) {
				System.out.println("종료되었습니다.");
				break;
			}
			
			if(x*y == answer) {
				System.out.println("정답!!!");
				corrextCnt++;
				count++;
			} else {
				System.out.println("오답!!!");
				count++;
			} 
		}
		System.out.println("총 " + corrextCnt + "문제 맞추셨습니다.");
		
		
		

	}

}
