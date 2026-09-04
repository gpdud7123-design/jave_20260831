package day5;

public class _6_참고 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 삼항연산자
		// = 상황에 따라서 if~else 대체 가능
		
		int score = 75;
		String result = score >=60 ? "Pass" : "Fail"; // score가 60점 이상이면 'Pass' 아니면 'fail' 넣기
		
//		String result ;
//		if(score >= 60) {
//			result = "Pass";
//		} else {
//			result = "Fail";
//		}
		
		
		// 향상된 for문
		int arr[] = {1,3,5,2,4};
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		for(int num : arr) {
			System.out.println(num); // 값의조건이맞춰졌을땐 유용할수있지만 인덱스관련 처리는 위에가 효율적
		}
		
		// final
		int age = 30;
		// 나이는 언젠가는 변할 수 있는 값
		age += 1;
		
		// pi => 3.14...
		//final로 선언된 변수를 '상수' 라고 표현
		final double PI = 3.141592; // 절대 수정 금지 앞에 파이널 붙히면 수정못하게하는문구
								// 파이널로 선언하는 변수는 다 대문자로 사용하기로 약속되어있음
		
		
		
		
		

	}

}
