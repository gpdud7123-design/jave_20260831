package day7_테스트;

import java.util.Random;
import java.util.Scanner;

public class Quiz9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		9. 홀짝 맞추기 게임을 만들어주세요. 랜덤으로 생성되는 숫자의 범위는 1~100 사이 값 입니다.
//		1번 메뉴로 들어가면 5문제를 출제하며, 선택한 답변에 따라 정답 및 오답을 출력합니다.
//		2번 메뉴를 선택하면 종료되며, 그 외의 값을 입력하면 다시 입력하도록 유도합니다.
//		자세한 내용을 아래 이미지를 참고해주세요.
		Scanner scan = new Scanner(System.in);
		System.out.print("[1. 홀짝 게임 시작, 2. 종료] : ");
		
		
		Random ran = new Random();
		int x = ran.nextInt(100) + 1;
		System.out.println(x);
		
	}

}
