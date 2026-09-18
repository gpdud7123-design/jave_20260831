package day15;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList예제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human hong = new Human("홍길동", 30);
		Human kim = new Human("김철수", 30);
		Human park = new Human("박영희", 30);
		
		ArrayList<Human> list = new ArrayList<>();
		list.add(hong); // 객체주소
		list.add(kim); 
		list.add(park); 
		
		System.out.println(list); //객체세게에대한주소 // 휴먼클래스에서 투스트링오버라이딩하면 이름출력
		
		// 사람 이름 입력받고 list에 있는지 검색
		// 있으면 '있습니다' 출력 후 종료
		// 없으면 그냥 아무것도 출력 안해도 됨
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름입력 :");
		String name = s.next();
		for(int i=0; i<list.size(); i++) {
			Human h = list.get(i);
			if(h.getName().equals("내가입력한이름")) {
				System.out.print("있습니다");
				break;
			}
		}
		
		

	}

}
