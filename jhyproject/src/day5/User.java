package day5;

public class User {
	
	public String name;
	int age;
	protected String addr;
	private String gender; // 프라이빗은 이장 괄호안에서만쓸수있음
	
	void info() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + addr);
		System.out.println("성별 : " + gender);
	}
	
	
	
	

}
