package day15;


public class Food {
	
	private String Name;
	private int price;
	private int Count;
	
	static String marketName = "코딩천국";
	
	public Food() {
		this("이름없음", 0, 0);
	}
	public Food(String Name, int price) {
		this.Name = Name;
		this.price = price; 
	}
	public Food(String Name, int price,int Count) {
		this.Name = Name;
		this.price = price; 
		this.Count = Count;
	}
	
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return Count;
	}
	public void setCount(int count) {
		Count = count;
	}

}
