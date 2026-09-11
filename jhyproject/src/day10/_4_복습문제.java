package day10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class _4_복습문제 {

	private static boolean searchFlg;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 숫자의 법위(음수 허용x)
		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list =new ArrayList<>();
		ArrayList<String> nameList = new ArrayList<>(); // 네임리스트를 만든것
		System.out.println("======= 과일가게 프로그램 =======");
		
		while(true) { // 무한루프안에서
			System.out.print(" [ (1) 추가 (2) 가격수정 (3)가격수정v2 (그 외) 종료 ] : ");
			int menu = scan.nextInt();
			if(menu == 1) {
				// 과일이름, 가격을 입력받아서 map에 저장 후
				// 해당 map을 리스트에 저장
				HashMap<String, Object> map = new HashMap<>(); // 맵선언
				System.out.print("과일이름 : "); // 과일입력을입력받는것
				String name = scan.next(); // 스캐너를통해서 입력받는것
				map.put("name", name);
				
				System.out.print("가격 : ");
				int price = scan.nextInt();
				map.put("price", price);
				
				list.add(map);
				nameList.add(name); // 과일이름만들어갈것
			} else if(menu == 2) {
				// 과일 이름 입력받은 후 해당 과일 있으면
				// 가격 입력받아서 수정
				// 없으면 '해당 과일은 없습니다' 출력 후 메뉴로
				Boolean searchFlg = false;
				System.out.print("과일 이름 : ");
				String name = scan.next();
				for(int i=0; i<list.size(); i++) {
					HashMap<String, Object> fruit = list.get(i);
					if(name.equals(fruit.get("name"))) { // 문자열비교 이퀄스
						int price = scan.nextInt();
						fruit.put("price", price);
				searchFlg = true;
				break;
				//어제했던 for써도 되고, 메소드 만들어서 활용해도 됨
				// 추후 작업할 거 생각하면 메소드만드는게 좀 더 좋다.
			}
				}
			}
			if(!searchFlg) {
			System.out.println("해당 과일은 없습니다");
			}else if (menu == 3) {
				System.out.println("과일 이름 : ");
				String name = scan.next();
				if(nameList.contains(name)) {
					int index = nameList.indexOf(name);// 사과가있으면 프린트해내는데 숫자리턴 바깥쪽으로뺴두댐
					//해쉬맵으로꺼내기 프룻 리스트겟 인뎃스 쓰면댐 등등등.. 방법은여러가지
				} else {
					System.out.println("해당 과일은 없습니다");
				}
				
			
		} 
			
		}

	}

}
