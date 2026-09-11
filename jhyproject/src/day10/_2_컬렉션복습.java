package day10;

import java.util.HashMap;

public class _2_컬렉션복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 해쉬맵 = > 키(열쇠의의미 상자를여는느낌 벨류에접근하기위함), 벨류의 쌍
		HashMap<String, Object> map = new HashMap<>();
		map.put("name", "홍길동");
		map.put("age", "30");
		map.put("height", 170.1);
		
		System.out.println(map);//윗 사람의 정보를 꺼내고싶을때
		
		System.out.println(map.get("name")); // 이름만알고싶을때 해당키로접근 키안에있는벨류실행하는개념
		if(map.containsKey("age")) { // 컨테인스키는 해당키존재하는지안하는지 구분하는메소드키
		System.out.println((Integer)map.get("age") + 1); // 나이를알고싶으면 age넣으면됨 키는 height
		}	// 없는거는 null이나옴 인티져넣어주면 수학적연산가능 +1같은거
											 
	}

}
