package day17;

import java.util.ArrayList;
import java.util.Scanner;

public class 시험5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		5.(15점) int arr[] = new int[6] 를 선언하고 스캐너를 통해 입력받은 숫자를 순차적으로 넣으시오.
//				단, 홀수번째 위치에는 홀수만, 짝수번째 위치에는 짝수만 넣으며, 잘못 입력된 경우 다시 입력받아서 넣으시오.
//				( 주의점 : index 상관없이 첫번째 입력받은 숫자는 홀수일 경우 넣고, 두번째 숫자는 짝수로 )
		int arr[] = new int[6];
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=1; i<=6; i++) {
			System.out.print(i + "번째 문자 입력 : ");
			int num = s.nextInt();
			list.add(num);
			
		}
		
		System.out.println(list);
				

	}

}
