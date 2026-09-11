package day10;

import java.util.ArrayList;
import java.util.HashMap;

public class _3_컬렉션복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 어레이리스트 안에 해쉬맵을 넣는형태
		// 제이선과 비슷한형태.
		HashMap<String, Object> hong = new HashMap<>();//HashMap<String, Object> hong 어레이리스트에담으면효율정ㄱ
		hong.put("name", "홍길동"); // 키와벨류형태  해쉬맵스트링오브젝트로 홍김박만듬
		hong.put("java", 95);
		hong.put("db", 92);
		hong.put("html", 96);
		System.out.println(hong);
		
		HashMap<String, Object> kim = new HashMap<>();
		kim.put("name", "김철수");
		kim.put("java", 91);
		kim.put("db", 99);
		kim.put("html", 92);
		System.out.println(kim);
		
		HashMap<String, Object> park = new HashMap<>();
		park.put("name", "박영희");
		park.put("java", 100);
		park.put("db", 99);
		park.put("html", 100);
		System.out.println(park);
		// 리스트는 대괄호로표현
		ArrayList<HashMap<String, Object>> list = new ArrayList<>(); // 해쉬맵으로위에서만든해쉬맵의객체를넣을수있게됨
		list.add(hong); //0번째
		list.add(kim);
		list.add(park);
		System.out.println(list);
		
		System.out.println(list.get(0).get("name")); // 리스트의 영번째객체출력 
										//이름만 알고싶을때 키를통해서벨류가져오는메소드.get("name") 편한사람은편한데 헷갈릴수잇음 
										// 리스트안에 자바점수만출력하고싶을때 밑에반복문
		for(int i=0; i<list.size(); i++) { // 해쉬맵넣었음 꺼낼때도해쉬맵으로
			HashMap<String, Object> user = list.get(i);
			System.out.println(user.get("java")); // 자바점수만 꺼내는프린트문
		}
		
		

	}

}
