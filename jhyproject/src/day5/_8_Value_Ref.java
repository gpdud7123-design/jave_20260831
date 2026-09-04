package day5;

import java.util.Arrays;

public class _8_Value_Ref {
	
	static void valueMethod(int a) {
		a = a + 1;
	}
	static void refMethod(int[] qqq) {
		qqq[1] = 1000; // qqq주소를 1000으로 바꾸는 문자
	}
	
	static void refMethod(Animal animal) {
		animal.age += 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10; //변수는 값을그냥 복사해서 넣음
		valueMethod(a);
		System.out.println(a); // 10
		
		int arr[] = {1,2,3,4,5}; // 배열 만드는문자 arr => 주소를 갖고있음 예아무값:dafeae
		refMethod(arr); // 배열실행 문자
		System.out.println(Arrays.toString(arr));
		
		Animal dog = new Animal("강아지", "댕댕이", 5);
		System.out.println("메소드 호출 전 : " + dog.age);
		refMethod(dog);
		System.out.println("메소드 호출 후 : " + dog.age);
		
		// 배열의 값을 복사하고 싶을 때
		
		int arr2[] = {3,5,2,4,1};
//		int copyArr[] = arr2; // arr2의 주소를 복사하므로
//							  // 두 배열은 같은 곳을 바라보게된다.
		int copyArr[] = new int[arr2.length];
		for(int i=0; i<arr2.length; i++) {
			copyArr[i] = arr2[i]; // 직접 넣어줘야된다
		}
		
		
		

	}

}
