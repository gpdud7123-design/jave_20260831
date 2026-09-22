package day17;

import java.util.Arrays;
import java.util.Random;

public class 시험3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3.(10점) int arr[] = new int[5] 와 같이 배열을 선언하고
//				   1~30 사이의 랜덤한 값을 넣은 후 출력하시오. 
		int arr[] = new int[5];
		Random ran = new Random();
		for (int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(30) + 1;
        }
		 System.out.println(Arrays.toString(arr));
		
		
	}

}
