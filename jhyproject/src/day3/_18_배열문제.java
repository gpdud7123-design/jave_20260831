package day3;

import java.util.Arrays;
import java.util.Random;

public class _18_배열문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 6개의 공간을 가지는 int형 배열을 만든 후
		// 1부터 100사이의 랜덤한 숫자를 넣어주세요.
		// 단, 홀수만
//		int arr[] = {0, 1, 2, 3, 4, 5}; //내가푼거
//		
//		Random ran = new Random();
//		int x = ran.nextInt(100) + 1;
		Random ran = new Random();
		int arr[] = new int[6];// 정답
		for(int i=0; i<arr.length; i++) {
			int ranNum = ran.nextInt(100) + 1;
			if(ranNum % 2 == 1) {
				arr[i] = ranNum;
				} else {
					i--;
				}
			
			}
		System.out.println(Arrays.toString(arr)); // 위에거 실행시키는 문자
		
		// 2. 1번에서 만든 배열의 숫자들의 평균을 구하기.
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum / arr.length); // sum이라는숫자를 배열의크기로 나눠서 평균구함
		
		// 3. 1번에서 만든 배열에서 가장 큰 숫자와 가장 작은 숫자의
		// 위치를 바꾸기
		// ex ) [85, 67, 53, 29, 11] => [11, 67, 53, 37, 29, 85]
		// 중복된 숫자가 있으면 먼저나온 숫자를 기준으로 하면 됩니다.
		
//		int sum = 0; //내가푼거
//		for(int i=0; i<arr.length; i++) {
//			
//		}
		
		// 정답
		
		

	}

}
