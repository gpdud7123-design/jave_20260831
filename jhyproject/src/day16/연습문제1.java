package day16;

import java.util.Arrays;
import java.util.Random;

public class 연습문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 5, -9, -2, 5};
		//1. 배열의 모든 숫자의 합 구하기
		// 단, 음수는 양수로 바꿔서 계산
		
		int sum = 0;
		for(int num : arr) {
			sum += Math.abs(num);
		}
		System.out.println(sum); 
		
		
		int arr2[] = new int[6];
		// 2. 1~50사이 랜덤한 숫자 배열에 넣은 후
		// 두번째로 큰 숫자 구하기.
		// 중복 숫자 안들어 간다고 가정(중복체크 안해도 됨)
		Random ran = new Random();
		for (int i = 0; i < arr2.length; i++) {
            arr2[i] = ran.nextInt(50) + 1;
        }

        // 원본 배열 출력
        System.out.println("생성된 배열: " + Arrays.toString(arr2));

        // 2. 배열 정렬 (오름차순)
        Arrays.sort(arr2);

        // 3. 뒤에서 두 번째 값 출력 (중복이 없다고 가정하므로)
        int secondMax = arr2[arr2.length - 2];
        System.out.println("두 번째로 큰 숫자: " + secondMax);

	}

}
