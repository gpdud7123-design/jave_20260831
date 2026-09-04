package day5;

public class Fruit {
	private String name; // 과일이름
	private int count; // 수량
	private int price; // 가격
	
	Fruit(String name, int count, int price){
		this.name = name;
		this.count = count;
		this.price = price;
	}

	public void setPrice(int price) {
		// 일반사용자 : C, 관리자 : A
		String status = "A"; //로그인한 사용자의 권한
		
		
		if(price <= 0) {
			System.out.println("값을 다시 확인해주세요!");
			return;
		}
		
		this.price = price;
	} // set 값을 넣는의미
	public int getPrice() { // get 값을 얻어오는 의미
		return price;
	}
	// 밑에문장 자동으로 만들수있음 메뉴에서
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
}
