package day5;

// private, protected, public, 디폴트(접근지정자 생략)
public class Animal {
	String kind; // 동물 종류
	String name; // 동물 이름
	int age; // 나이
	Animal() {}
	Animal(String kind, int age) {
		this(kind, "이름미정", age);  // 밑에방법보다 깔끔한 방법, 첫줄에와야됨
	}
	Animal(String kind, String name, int age) {
		this.kind = kind;
		this.name = name;
		this.age = age;
	}
	
	
	
	
	
	

}
