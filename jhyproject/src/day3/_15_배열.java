package day3;

public class _15_배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9, 8, 4, 6, 3};
		// 배열안에 있는 숫자 중에서 가장 큰 숫자가 뭔지 알고싶어요
		
		int max = 0; 
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);

		
		
		

	}

}
