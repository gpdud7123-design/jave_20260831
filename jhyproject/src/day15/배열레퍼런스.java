package day15;

import java.util.Arrays;

public class 배열레퍼런스 {
	static int[] plusArr(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i] += 1; //배열숫자 하나씩증가시키기
		}
		return arr; //윗배열리턴  //리턴안해줘도됨
	}
//	static int[] plusArr(int[] arr) {
//		for(int i=0; i<arr.length; i++) {
//			arr[i] += 1; //배열숫자 하나씩증가시키기
//		}
//	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,5,2,6,7};
//		int newArr[] = plusArr(arr);
//		System.out.println(Arrays.toString(newArr));
		plusArr(arr);
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);//리턴안받음
		System.out.println(Arrays.toString(arr));
		

	}

}
