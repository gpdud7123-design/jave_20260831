package day16;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 연습문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = new int[5];
		// 스캐너를 통해 입력받은 값을 5개 공간 배열에 값 넣기
		// 값은 10~30 사이 값만넣기.
		// 그 외 값은 다시 입력받기
		Scanner s = new Scanner (System.in);
		
		// 5개 공간의 배열에 값 넣기
        for (int i = 0; i < arr1.length; i++) {
            while (true) {
                System.out.print((i + 1) + "번째 숫자를 입력하세요 (10~30): ");
                int input = s.nextInt();
                
                // 값은 10~30 사이 값만 넣기
                if (input >= 10 && input <= 30) {
                    arr1[i] = input;
                    break; // 올바른 값이 입력되면 while 루프 탈출 후 다음 인덱스로 이동
                } else {
                    // 그 외 값은 다시 입력받기
                    System.out.println("잘못된 입력입니다. 10에서 30 사이의 숫자만 입력해주세요.");
                    i--;
                }
            }
        }

        // 입력된 배열 값 확인용 출력
        System.out.print("입력된 배열: ");
        for (int val : arr1) {
            System.out.print(val + " ");
        }
        
        
        
		
		
		int arr2[] = { 3, 9 , 6 , 5, 4, 2, 15, 8 };
		// 홀수 먼저 정렬 => 오름차순
		// 짝수 뒤에 정렬 => 내림차순
		// {3,5,9,15,8,6,4,2}
		// 결과는 배열로 출력. 새로운 배열 만들어도 됨
		// 1. 홀수와 짝수의 개수 세기
        int oddCount = 0;
        int evenCount = 0;
        for (int num : arr2) {
            if (num % 2 != 0) oddCount++;
            else evenCount++;
        }
        
        // 2. 분리할 임시 배열 생성 (짝수 내림차순을 위해 Integer wrapper 사용)
        int[] odds = new int[oddCount];
        Integer[] evens = new Integer[evenCount];
        
        int oddIdx = 0, evenIdx = 0;
        for (int num : arr2) {
            if (num % 2 != 0) {
                odds[oddIdx++] = num;
            } else {
                evens[evenIdx++] = num;
            }
        }
        
        // 3. 홀수는 오름차순 정렬, 짝수는 내림차순 정렬
        Arrays.sort(odds);
        Arrays.sort(evens, Collections.reverseOrder());
        
        // 4. 새로운 결과 배열에 합치기
        int[] result = new int[arr2.length];
        System.arraycopy(odds, 0, result, 0, odds.length);
        for (int i = 0; i < evens.length; i++) {
            result[odds.length + i] = evens[i];
        }
        
        // 결과 출력
        System.out.println(Arrays.toString(result)); 
		
		
		

	}

}
