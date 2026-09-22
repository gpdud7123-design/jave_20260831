package day17;

import java.util.Scanner;

public class 시험2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2.(10점) 스캐너를 통해 입력받은 숫자가 홀수인지 짝수인지 판별하는 코드를 작성하시오.
		Scanner s = new Scanner(System.in);
		System.out.print("숫자 입력 :");
		int num = s.nextInt();
		if(num % 2 == 0) {
			System.out.println("짝수 입니다");
		}else {
			System.out.println("홀수 입니다");
		}

	}

}
