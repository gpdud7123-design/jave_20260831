package day16;

import java.util.Arrays;
import java.util.Collections;

public class 예시문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,5,2,4,1};
		// 주어진 배열을 내림차순
		Arrays.sort(arr);

		for (int i = 0; i < arr.length / 2; i++) {
		    int temp = arr[i];
		    arr[i] = arr[arr.length - 1 - i];
		    arr[arr.length - 1 - i] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
		
		int arr3[] = {3,5,2,4,1};
		// 배열에서 가장 큰값과 가장 작은값의 차이를 구해라
		Arrays.sort(arr3);
		System.out.println(arr3[arr3.length-1] - arr3[0]);
		

	}

}
