package day15;

public class Student extends Person{
	
	private String stuNo; // 값을가지게하는거
	public Student(String name, int age, String addr, String stuNo) { // 스튜던트라는생성자 
		super(name, age, addr); //부모생성자호출하는키워드
		this.stuNo = stuNo;
		
		
	}
	
	public void study() {
		System.out.println("공부한다!");
	}
	
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		// '김철수'의 나이는 25살 입니다. '주소는 서울, 학번은 1234 입니다.' 출력
		String info = super.getInfo() + "주소는" + getAddr() + " 학번은 " + stuNo + "입니다.";
		return info;				
	}
	

}
