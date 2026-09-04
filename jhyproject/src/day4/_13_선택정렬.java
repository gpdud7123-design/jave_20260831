package day4;

import java.util.Arrays;

public class _13_선택정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9,6,7,3,5}; //배열의 -1번만큼
		
		for(int j=0; j<arr.length-1; j++) {
			int minIndex = j;
			for(int i=j+1; i<arr.length; i++) {
				if(arr[minIndex] > arr[i]) {
					minIndex = i;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[j];
			arr[j] = temp;
			System.out.println(Arrays.toString(arr));
		}
		
		

	}

}
