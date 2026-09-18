package day15;

public class Private변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human hong = new Human("홍길동", 30);
//		hong.age = 31; 이건안됨 휴먼클래스에 변수 프라이빗으로막아놔서
		hong.setAge(-10); //휴먼클래스에겟셋메소드 해놔서 간접적허용
		
		System.out.println(hong.getAge());
		
		Human.intro(); // 휴먼클래스에 스태틱으로해놔서 메소드선언가능해진거
		hong.intro = "zzzzzzzzzzz"; // 클래스로접근가능하게만든거
		
		System.out.println(Human.intro); 
		
//		Math math = new Math(); //객체못만드는이유 프라이빗으로막혀있어서 ();생성자호출
//		Math 클래스는 모든 멤버가 static이라 객체 생성 없이 사용가능
		int max = Math.max(10, 20);
		

	}

}
