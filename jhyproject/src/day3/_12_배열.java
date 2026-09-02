package day3;

public class _12_배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 => 하나의 변수(x)에 여러개의 값 보관 가능
		// 배열은 기본적으로 대괄호('[]')를 사용
		
//		int arr1[] = {}; // int[] arr1 = {}; 변수 앞이나 뒤에붙든상관없음
//		int arr2[] = new int[3];
//		int arr3[] = {1,2,3,4,5};
		
		// array
		int arr[] = new int[5]; // 인덱스 초기 기본값 {0,0,0,0,0}
		arr[0] = 10; // {10,0,0,0,0}
		arr[1] = 15; 
		arr[2] = 3;
		arr[3] = 8;
		arr[4] = 12; // 최종 {10,15,3,8,12}
//		System.out.println(arr[4]); // 원하는 arr[]숫자넣어서 실행
		
		
		int arr2[] = {10, 15, 3, 8, 12}; // 윗구조와 동일
		// arr2에 있는 모든 숫자의 합 구하기
		int sum = 0;
		for(int i=0; i<arr2.length; i++) {
//			System.out.println(arr[i]); // 윗구조 실행 반복문 응용
			sum += arr2[i]; // sum = sum + arr2[i]
		}
		System.out.println(sum);
		
		
		

	}

}
