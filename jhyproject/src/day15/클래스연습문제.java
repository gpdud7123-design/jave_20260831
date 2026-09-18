package day15;

import day6.Food;

public class 클래스연습문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 모든필수 변수는 프라이빗으로선언
		Food f1 = new Food();
		Food f2 = new Food("라면", 1000);
		Food f3 = new Food("김밥", 2000, 10);
		
//		System.out.println(f1.name); // 오류발생
		System.out.println(f1.getName()); //'이름없음'출력
		System.out.println(f1.getPrice()); // '0' 출력
		
		System.out.println(f2.getName()); //"라면"출력
		System.out.println(f3.getCount()); // '10'출력
		
		System.out.println(Food.marketName); // '코딩천국'출력
		

	}

}
