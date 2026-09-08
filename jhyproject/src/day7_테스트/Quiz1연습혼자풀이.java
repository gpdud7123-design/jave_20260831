package day7_테스트;

import java.util.Arrays;
import java.util.Random;

public class Quiz1연습혼자풀이 {
//	0. 1부터 100까지의 숫자 중 5의 배수이지만 8의 배수는 아닌 숫자들만 화면에 출력하고, 
//	마지막에 그 숫자들의 총 개수를 출력하세요.
	for(int i=1; i<=100; i++) {
		if(i % 5 == 0 || !(i % 8 == 0)) {
			continue;
		}
		System.out.println(i);
//
//	0. 크기가 5인 정수형 배열을 만들고 1부터 100사이의 랜덤한 숫자 5개를 넣습니다.
	int arr1[] = new int[5];
	Random ran = new Random();
	int x = ran.nextInt(100) + 1;
	System.out.println(x);
//	이후 배열의 숫자들 중에서 '홀수'만 찾아내어 출력하고, 마지막에 홀수가 총 몇 개 입력되었는지 카운트하여 출력하세요.
	for(int i=1; i<=100; i++) 
		if(i % 2 == 1) {
			System.out.println(i);
		}
	//	0. 크기가 5인 정수형 배열을 선언하고 사용자로부터 5개의 숫자를 입력받아 저장하세요.
	int arr[] = new int[5];
//	그 후, 배열에 저장된 숫자들을 입력받은 순서의 반대(역순)로 화면에 출력하세요.
//	( Arrays.sort() 필요하다면 사용해도되고 안해도 되고.. )
//	(예: 10, 20, 30, 40, 50 순으로 입력했다면 50, 40, 30, 20, 10 순으로 출력되어야 합니다.)
	int minIndex = 1;
	for(int i=2; i<arr.length; i++) {
		if(arr[minIndex] > arr[i]) {
			minIndex = i;
		}
	}
	int temp = arr[minIndex];
	arr[minIndex] = arr[1];
	arr[1] = temp;
	System.out.println(Arrays.toString(arr));
//
//	0. Random 클래스를 활용하여 컴퓨터와 사용자의 '주사위 게임'을 만드세요.
		Random ran = new Random();
		int x = ran.nextInt(5)+1;
		System.out.println(x);
//	컴퓨터와 사용자가 각각 주사위(1~6 사이의 랜덤한 수)를 3번씩 던집니다(반복문 활용). 
		for(int i=1; i<=6; i++) {
			System.out.println(i); }
//	3번 던져서 나온 눈의 총합을 각각 구한 뒤, 총합이 더 큰 쪽이 승리합니다. 
//	최종적으로 "컴퓨터 총합: O점, 사용자 총합: O점"을 출력하고 
//	승자(컴퓨터 승리 / 사용자 승리 / 무승부)를 출력하세요.
			else if(){
				System.out.println("컴퓨터 승리");
				} else{
					System.out.println("사용자 승리");
				} else {
					System.out.println("무승부");
				}
			

}
