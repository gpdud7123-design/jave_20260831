package day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class _8_과일가게수정1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		System.out.println("====== 과일 가게 프로그램 ======");
		
		while(true) {
			System.out.print("[ (1) 과일등록 (2) 가격수정 (3) 과일구매 (그 외) 종료 ] : ");
			int menu = s.nextInt();
			if(menu == 1) {
				HashMap<String, Object> map = new HashMap<>();
				System.out.print("과일이름 : ");
				String name = s.next();
				HashMap<String, Object> fruit = FruitFunc.searchFruit(list, name);
				if(fruit != null) {
					System.out.println("이미 등록된 과일 입니다");
				} else {
					map.put("name", name);
					
					System.out.print("가격 : ");
					int price = s.nextInt();
					map.put("price", price);
					
					System.out.print("개수 : ");
					int Count = s.nextInt();
					map.put("Count", Count);
					
					list.add(map);
				}
			} else if(menu == 2) {
				System.out.print("수정할 과일 이름 : ");
				String name = s.next();
				
				HashMap<String, Object> fruit = FruitFunc.searchFruit
				for(fruit != null) {
						System.out.println("수정할 가격 입력");
						int price = s.nextInt();
						fruit.put("price", price);
				} else {
					System.out.println(" 해당 과일이 없습니다");
				}
				
			} else if(menu == 3) {
				System.out.print("구매할 과일 이름 : ");
				String name = s.next();
				HashMap<String, Object> fruit = FruitFunc.searchFruit(list, name);
				if(fruit != null) {
					System.out.println("변경 전 : " + fruit);
					System.out.print("구매할 과일 개수 : ");
					int count = s.nextInt();
					fruit.put("count", (integer) fruit.get("count") - count);
					System.out.println("변경 후 : " + fruit);
				} else {
					System.out.println(" 해당 과일이 없습니다");
				}
				
			}
			if(menu == 3) {
				// 메뉴를 제외한숫자를 입력받을 때
				int num = s.nextInt();
				// 0 이하의 숫자를 입력하면 바로 다시 입력받도록
				if(num > 0) {
					return num;
				}
				
				// 될 수 있으면 해당 부분은 메소드를 통해 일괄적으로 처리
				// (가격입력시 -10 입력하면 다시 바로 가격을 입력받도록)
				
			}
			// 내가얼마(가격)만큼 구매했는지 메세지주기
			// 현재 과일의 개수를 초과해서 구매못하도록
			// (현재 남은 과일의 개수는 oo개 입니다.)
			
			
		}
		
		

	}

}
