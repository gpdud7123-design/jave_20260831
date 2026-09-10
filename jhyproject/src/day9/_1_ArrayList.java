package day9;

import java.util.ArrayList;

public class _1_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Integer> list = new ArrayList<Integer>(); // 예전에는 Integer를넣었어야됨
		ArrayList<Integer> list = new ArrayList<>(); //지금은 버전업되면서 안넣어도됨
		
		// 데이터 삽입
		list.add(10);
		list.add(25);
		list.add(12);
		System.out.println(list.toString()); // toString 지워도출력가능
		
		list.add(1, 100); // 첫번째인덱스에 100이라는값이들어간다는뜻
		System.out.println(list);
		
		System.out.println(list.contains(99)); // 판별가능하다
		
		list.remove(1);
		System.out.println(list);
		
		
		int sum = 0;
		for(int i=0; i<list.size(); i++) {
			sum += list.get(i); // 꺼내오는거
		}
		System.out.println(sum);
		
		// add, get, contains, remove *꼭기억
		
	}

}
