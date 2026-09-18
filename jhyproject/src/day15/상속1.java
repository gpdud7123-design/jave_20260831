package day15;

public class 상속1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person hong = new Person("홍길동", 30, "인천");
		hong.speak();
//		hong.study();//호출불가능 자식클래스가갖고있어서 부모클래스가자식꺼는호출안됨
		
		Student kim = new Student("김철수", 25, "서울", "1234");
		kim.speak(); // 부모클래스 메소드 호출 가능
		kim.study();
		
		String hongInfo = hong.getInfo();
		System.out.println(hongInfo);
		// '홍길동의 나이는 30살 입니다.' 출력
		
		String kimInfo = kim.getInfo();
		System.out.println(kimInfo);
		// '김철수'의 나이는 25살 입니다. '주소는 서울, 학번은 1234 입니다.' 출력
		

	}

}
