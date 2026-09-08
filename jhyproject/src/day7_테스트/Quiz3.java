package day7_테스트;

public class Quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2~9사이 숫자가 아닐경우 '잘못 입력된 숫자 입니다'를 출력 후 종료해주세요.

		for(int i=2; i<=9; i++) {
			System.out.println("=====" + i + "단 =====");
			for(int j=1; j<=9; j++) {
				System.out.println(i + "*" + j + " = " + (i*j));
			}
		}
		if(i >= 2 && j <= 9 ) {
			System.out.println("잘못 입력된 숫자 입니다");
		}
		

	}

}
