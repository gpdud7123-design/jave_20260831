package day15;

public class 객체레퍼런스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = a;
		a = 15;
		System.out.println(b); // 바꾼다구 b에영향을안준다
		
		Human h1 = new Human("홍길동", 30);  // 두갠 다른객체 다른사람
		Human h2 = new Human("홍길동", 30);
		h1.addr = "인천";
		System.out.println(h2.addr);
		
		Human h3 = h2; // 이건같은객체를가르키게됨 같은곳을바라보는
		h2.addr = "서울";
		System.out.println(h3.addr);
		

	}

}
