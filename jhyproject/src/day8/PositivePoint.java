package day8;

public class PositivePoint extends Point{

	PositivePoint(){
		super(0, 0); // this여도됨
	}
	
	PositivePoint(int x, int y) {
		super(x, y); // 0, 0으로해도되고 x y로해도되고
		
	}
	
	@Override
	protected void move(int x, int y) {
		if(x >= 0 && y >= 0) {
			super.move(x, y);
		}
	}



}
