package day7;

import java.util.Random;
import java.util.Scanner;

public class _1_Math클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		s.nextInt();
		
		Random ran = new Random();
		ran.nextBoolean();
//		Math m = new Math(); // Math 클래스 생성자가 프라이빗
		
		System.out.println(Math.PI);
		int max = Math.max(5, 3);
		int num = Math.abs(-5); // 절대 값
		System.out.println(num);
		
		

	}

}
