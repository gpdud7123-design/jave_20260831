package day15;

import java.util.List;

public class Human {
	private String name;
	private int age;
	private String gender;
	String addr;
	
	
	static String intro = "Human 클래스 멤버입니다.";
	static void intro() {
//		addr = "인천" // 논스태틱에접근불가능 non-static
		System.out.println("Human 클래스 멤버(메소드)입니다.");
	}
	
	
	public Human () {};
	
	public Human(String name, int age) {
		this(name, age, "알수없음"); //밑에생성자호출해주는거 밑에세줄보다깔끔
//		this.name = name;
//		this.age = age; 
//		this.gender = "알수없음";
	}
	public Human(String name, int age,String gender) {
		this.name = name;
		this.age = age; 
		this.gender = gender; // 새롭게호출하는건 새로하나더만들어야댐
	}
	
	
	public Human(String string) {
		// TODO Auto-generated constructor stub
	}


	public void Walk() {
		System.out.println(name + "(이)가 걷는다!");
	}
	public String eat(String food) {
		return food + "를 먹는다.";
	}

	public String getName() {
		
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age < 0) {
			System.out.println("나이는 0 이상 입력해주세요");
			return; // 리턴해서 나이수정안됨
		}
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
//	@Override
//	public String toString() {
//		return name; //어레이리스트3 객체출력오버라이딩
//	}
	

}
