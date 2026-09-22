package day17;

import java.util.Arrays;
import java.util.Collections;

public class 시험6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6. (15점) int arr[] = { 3, 9, 6, 5, 4, 2, 15, 8 } 를 선언한 후 아래 조건과 같이 재배열하여 출력하시오.
//				조건. 홀수는 홀수번째에서 오름차순, 짝수는 짝수번째에서 내림차순
//				출력 결과 : {3,8,5,6,9,4,15,2}
		// 홀수 먼저 정렬 => 오름차순
				// 짝수 뒤에 정렬 => 내림차순
				// {3,5,9,15,8,6,4,2}
				// 결과는 배열로 출력. 새로운 배열 만들어도 됨
				// 1. 홀수와 짝수의 개수 세기
				int arr[] = { 3, 9, 6, 5, 4, 2, 15, 8 };
		        int oddCount = 0;
		        int evenCount = 0;
		        for (int num : arr) {
		            if (num % 2 != 0) oddCount++;
		            else evenCount++;
		        }
		        
		        int[] odds = new int[oddCount];
		        Integer[] evens = new Integer[evenCount];
		        
		        int oddIdx = 0, evenIdx = 0;
		        for (int num : arr) {
		            if (num % 2 != 0) {
		                odds[oddIdx++] = num;
		            } else {
		                evens[evenIdx++] = num;
		            }
		        }
		        
		        Arrays.sort(odds);
		        Arrays.sort(evens, Collections.reverseOrder());
		        
		        int[] result = new int[arr.length];
		        System.arraycopy(odds, 0, result, 0, odds.length);
		        for (int i = 0; i < evens.length; i++) {
		            result[odds.length + i] = evens[i];
		        }
		        
		        System.out.println(Arrays.toString(result)); 
		

	}

}
