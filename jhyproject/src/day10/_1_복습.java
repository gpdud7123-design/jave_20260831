package day10;

import java.util.ArrayList;

public class _1_복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList, Hashmap
		// int arr[] / 인티져가될수도있음
		ArrayList<String> list = new ArrayList<>(); // 꺽새괄호? 인포트? 컨트롤쉬프트o
		list.add("홍길동"); //애드는 오버로딩이되어있음
		list.add("김철수");
		list.add(1, "박영희"); // 1번째 인덱스에 박영희가 들우감
		System.out.println(list); // 리스트 확인 //투스트링은오버라이딩되어있음 toString 
		System.out.println(list.get(0));// 0번째값? get메소드?
		
		for(int i=0; i<list.size(); i++) { // 반복문 왜넣는거지
			String name = list.get(i); // 문자열 i번째꺼 라는 뜻
			System.out.println(name); // 문자열 출력
		}
		
		list.remove(2); // 두번째
		list.remove("홍길동"); // 이건왜넣은걸까
		System.out.println(list); // 두번째 리스트출력
		
		
		
		

	}

}
