package day6;

public class ColorTV extends TV {
	private int color;
	
	ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	
	void prinProperty() {
		//32인치 1024컬러
		System.out.println(getSize() + "인치 " + color + "컬러");
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

}
