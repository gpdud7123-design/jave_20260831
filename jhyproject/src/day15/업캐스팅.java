package day15;

public class 업캐스팅 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person hong = new Person("홍길동", 30, "인천");
		Student kim = new Student("김철수", 25, "서울", "1234");
		
		Person p = kim; // 가능
		Student s = (Student) p; // 자식이부모를담을순없음 근데스튜던트로다운캐스팅하면됨
		
		
		Object obj1 = hong; // 자식클래스는 오브젝트로가능 오브젝트로 업캐스팅
		Object obj2 = kim;
		
//		오브젝트 //웹퍼클래스로 박싱됙떄문에가능
		
		
	}

}
