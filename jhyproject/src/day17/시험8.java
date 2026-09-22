package day17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class 시험8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		8. (5점) 6. 이미지 참고하여 코드를 완성하시오.
//		 -- 메뉴 1 : 중복 이름 저장 금지
//		 -- 메뉴 2 : java, oracle 점수 추가(0~100 사이 값), 없는 사용자 입력 시 메뉴로 이동
//		 -- 메뉴 3 : ArrayList 객체 그대로 출력, ex) System.out.println(list);
//		 -- 메뉴 4 : java, oracle 중 1가지 선택해서 점수 변경. 없는 사용자 입력 및 없는 과목 입력 시 메뉴로 이동
//		 -- 메뉴 5 : 종료
		Scanner s = new Scanner(System.in);
		HashMap<String, Object> student = new HashMap<>(); 
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("=== 학생 관리 시스템 입니다. ===");
		System.out.print("[ (1) 학생추가 (2) 성적입력 (3) 조회 (4) 성적수정 (5) 종료 ] :");
		int menu = s.nextInt();
		if(menu == 1) {
			
			System.out.print("이름 : ");
			String name = s.next();
			student.put("name", name);
			System.out.println("학생이 추가되었습니다");
			
		} else if (menu == 2) {
			int num = 0;
			
			System.out.print("이름 : ");
			String name = s.next();
			student.put("name", name);
			
			System.out.print("jave : ");
			int javaScore = s.nextInt();
			student.put("javaScore", javaScore);
			
			System.out.print("oracle : ");
			int oracleScore = s.nextInt();
			student.put("oracleScore", oracleScore);
			
			
		
			
		} else if (menu == 3) {
			System.out.print("조회 :");
			
		} else if(menu == 4) {
			System.out.print("성적수정 :");
			
		} else if(menu == 5) {
			System.out.println("종료되었습니다");
			
		}
		
		
		
		

	}

}
