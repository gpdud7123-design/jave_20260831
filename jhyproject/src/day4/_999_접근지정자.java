package day4;

public class _999_접근지정자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User();
		user.name = "홍길동";
//		user.age = 30; 다른패키지이므로 default접근불가
//		user.addr = "인천"; 다른패키지이므로 protected 접근 불가
//		user.gender = "남자"; 앞에 유저파일에서 프라이빗 이라 접근 불가
		

	}

}
