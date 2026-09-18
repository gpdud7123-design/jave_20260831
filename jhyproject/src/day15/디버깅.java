package day15;

public class 디버깅 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,5,2,1,6};
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > arr[i+1]) { // i가 4일떄문제발생 디버깅 벌레모양
				int temp = arr[i]; //배열숫자바꾸는거
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		

	}

}
