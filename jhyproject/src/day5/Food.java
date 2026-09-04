package day5;

public class Food {
	String name;
	int price;
	
	Food(String name, int price) {
		this.name = name;
		this.price = price; 
		
		
	}
	void info() {
		System.out.println(name + "은 " + price + "원 입니다.");
	}
	
	void setPrice(int price) {
		this.price = price;
	}
	
	int getPrice() {
		return price; // 현재갖고있는 값을 되돌려주는
	}

}
