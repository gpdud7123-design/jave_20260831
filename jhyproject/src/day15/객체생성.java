package day15;


public class 객체생성 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human hong = new Human("홍길동", 30);
		hong.Walk();
		String result = hong.eat("라면"); //문자열을받아서밑에프린트문으로출력
		System.out.println(result);
		

	}

}
