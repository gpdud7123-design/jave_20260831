package day7_테스트;

import java.util.Random;

public class Quiz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		4. 1에서 50 사이의 숫자를 하나 입력받습니다.
//		만약 사용자가 1~50 범위를 벗어난 숫자를 입력하면, 올바른 범위의 숫자를 입력할 때까지 계속해서 다시 입력받도록 안내문을 띄웁니다. 
//		올바른 숫자가 입력되면 종료합니다.
		Random ran = new Random();
		int x = ran.nextInt(50) + 1;
		System.out.println(x);

	}

}
