package day6;

public class _8_업캐스팅 {
	
	static void fruitBoxing(Fruit f) { // 부모 클래스형태로하면 자식클래스=모든과일을 담을수있는 형태가됨
		System.out.println(f.name + "를 포장했습니다.");
	}
	
	
	// 필요 x
	static void appleBoxing(Apple a) {
		System.out.println(a.name + "를 포장했습니다.");
	}
	static void appleBoxing(Orange o) {
		System.out.println(o.name + "를 포장했습니다.");
	}
	static void appleBoxing(Banana b) {
		System.out.println(b.name + "를 포장했습니다.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit f = new Fruit("과일");
		
		Apple apple1 = new Apple("사과");
		Orange orange1 = new Orange("오렌지");
		Banana banana1 = new Banana("바나나");
		
		appleBoxing(apple1);
		
		fruitBoxing(orange1);
		fruitBoxing(banana1);
		fruitBoxing(apple1);
		
//		Object arr[] = {3, "홍길동", true}; // int자리에 Object 숫자문자다들어갈수있게됨
		
//		f = apple1;
////		orange1 = banana1; x
//		f = banana1;
//		Fruit fruit2 = orange1;

	}

}
