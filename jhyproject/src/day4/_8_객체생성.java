package day4;

import java.util.Random;

public class _8_객체생성 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human hong = new Human();  // 독립적 문장
		hong.name = "홍길동";
		Human kim = new Human();
		kim.name = "김철수";
		Human park = new Human();
		
		hong.eat();
		kim.eat();
		
		hong.walk(1); // 숫자넣어야 오류안남
	}

}
