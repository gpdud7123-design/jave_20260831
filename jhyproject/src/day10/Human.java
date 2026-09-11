package day10;

import java.util.ArrayList;

public class Human {
	String name;
	Human(String name) {
		this.name = name; //디스는뭐였드라 생성자?
		ArrayList<Human> humanList = new ArrayList<>();
		Human hong = new Human("홍길동"); // 휴먼으로만든객체이니까 들어갈수있다? 업캐스팅에의해서.
		Human kim = new Human("김철수"); 
		humanList.add(hong);
		humanList.add(kim);
		System.out.println(humanList);
		
	}
	
}
