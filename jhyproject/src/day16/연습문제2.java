package day16;

import java.awt.Container;
import java.util.ArrayList;
import java.util.Scanner;

public class 연습문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		// 1. 스캐너를 통해 숫자 5개 입력받아서 배열에 넣기
		// 양수를 입력하면 음수로, 음수를 입력하면 양수로넣기
		// ex) 5 => -5, -3 => 3
		Scanner s = new Scanner (System.in);
		for(int i=0; i<arr.length; i++) {  // 1. 반복문을 통해 5개의 숫자 입력받기
			System.out.print( i+1 + "번째 숫자 : ");
			int input = s.nextInt();
			arr[i] = -input;   // 2. 부호를 반전시켜 배열에 저장 (-를 곱해주면 부호가 바뀝니다)
		}
		System.out.println("\n--- 부호가 반전된 배열 결과 ---");  // 배열에 저장된 결과 출력하기
        for (int num : arr) {
            System.out.print(num + " ");
        }
		
		
		
		
		int arr2[] = {7, 5, 7, 10, 3, 16, 16, 18, 30, 30};
		// 2. 배열에서 중복된 값제거 후 출력
		// 결과 " {5, 10, 3, 18}
		// 단, 배열에 0은 없다고 가정해도 좋음.
		ArrayList<Integer> list = new ArrayList<>();
		 for (int i = 0; i < arr2.length; i++) {
			 if(!list.contains(arr2[i])) {
				 list.add(arr2[i]);
			 }
		 }
		 System.out.println(list);
		 
		 int newArr[] = new int[list.size()];
		

	}

}
