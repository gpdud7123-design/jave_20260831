package day14;

import java.util.Arrays;

public class _4_2차원배열연습문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 4 x 4의 2차원 배열을 만들고 이곳에 1에서 10까지 범위의 정수를 임의의 위치에 삽입하라. 
		// 나머지 6개의 숫자는 모두 0이다. 만들어진 2차원 배열을 화면에 출력하라. 
		// (중복 x, 나머지 6개는 0으로 출력)
		int arr[][] = {
				{2, 0, 8, 0},
				{6, 1, 0, 0},
				{0, 4, 10, 0},
				{5, 7, 9, 3}
				
		};
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));
		System.out.println(Arrays.toString(arr[3]));
		

	}

}
