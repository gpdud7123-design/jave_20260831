package day17;

import day4.Human;

public class Dog extends Animal{

	public Dog(String name, int age) {
		super(name, age);
	}
	
	// 2. 해당 클래스(Dog)의 객체 생성 후 sound 메소드 호출 시 '멍멍'이 출력되도록 코드를 작성할 것
	 // 1. 에러가 발생하지 않도록 생성자 작성(name, age 초기화)
//	(5점) 아래 코드를 다운받아서 조건에 맞게 Dog 클래스를 완성하시오. (Animal 클래스 수정 금지)
//	 - main 메소드에서 Dog 객체를 생성 후 Sound 메소드 호출(아래 코드 참고)
	 Animal dog = new Animal("진돗개", 10); 
	 dog.sound(1);   // 실행결과 캡처
	
	
	
}
