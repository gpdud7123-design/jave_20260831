package day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class _5_성적관리프로그램 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		ArrayList<String> nameList = new ArrayList<>();

		System.out.println("======= 성적관리 프로그램 =======");
		while (true) {
			System.out.print("[ (1) 성적등록 (2) 성적확인 (3) 성적순위 (그 외) 종료 ] : ");
			int menu = scan.nextInt();
			if (menu == 1) {
				// 메뉴 1번에 대한 조건
				// 1. 학번은 무조건 4글자. 4.글자 벗어나게 입력하면 다시 입력하도록 이것도리턴? 다시입력
				// 2. 이미 있는 학번이라면 마찬가지로 다시입력 하도록 유도 return;?
				// 3. 각 과목의 점수를 입력받을 때 점수의 범위는
				// 자바 : 0~40, db : 0~35 html : 0~25
				// 해당 범위 외의 숫자 입력 시 다시 입력하도록,

				HashMap<String, Object> student = new HashMap<>(); // 틀을잡는코드 html까지

				System.out.print("학번 4글자 :");
				String input = scan.next();
				// 1. 4글자 체크
				if (input.length() != 4) {
					System.out.println("학번은 무조건 4글자여야 합니다. 다시 입력하세요.");
					continue;
				}
				String stuNo = scan.next();
				student.put("stuNo", stuNo);

				System.out.print("이름 : ");
				String name = scan.next();
				student.put("name", name);

				System.out.print("자바점수 : ");
				int javaScore = scan.nextInt();
				student.put("javaScore", javaScore);

				System.out.print("db점수 : ");
				int dbScore = scan.nextInt();
				student.put("dbScore", dbScore);

				System.out.print("html점수 : ");
				int htmlScore = scan.nextInt();
				student.put("htmlScore", htmlScore);

//				System.out.print("학번 4글자 :");
//				String input = scan.next();
//				// 1. 4글자 체크
//				if (input.length() != 4) {
//					System.out.println("학번은 무조건 4글자여야 합니다. 다시 입력하세요.");
//					continue;
//				}

				// 2. 중복 학번 체크 (list 안의 HashMap에서 "stuNo" 키 값 비교)
				boolean isDuplicate = false;
				for (HashMap<String, Object> map : list) {
					if (map.containsKey("input") && map.get("input").equals(input)) {
						isDuplicate = true;
						break;
					}
				}

				if (isDuplicate) {
					System.out.println("이미 존재하는 학번입니다. 다시 입력하세요.");
					continue;
				}

				// 조건 통과 시 반복문 탈출
				break;

//		        static //선언 int 숫자입력
//		        while(true) // 무한루프
//		        	.nextInt // 입력받는문자

			} else if (menu == 2) {
				// 학번을 입력받아서
				System.out.print("학번 입력 : ");
				String stuNo = scan.next();
				// 해당 학번이 존재하면 해당 학생의 시험 총점 출력
				// 인덱스오브 스튜넘버 리스트
				if (index != -1) {
					해쉬맵 <스트링, 오브젝트> 스턴트 = list.get(index); // 겟 리스트에 인덱스를넣어준거
					int total = (Integer) student.get("java");//인티져숫자를넣을수잇게넣은거
								(Integer) student.get("db");
								(Integer) student.get("html");
					System.out.println(" 총점 : " + total);
				}

				// 해당 학번이 없으면 '학번을 출력해주세요' 출력 후 메뉴로이동

			else {System.out.println("학번을 출력해주세요");}

			}
			else if (menu == 3) {
				
				// 5명 있으면 1등 : ooo(학번), oo점(총점)
				// 2등 : ooo(학번), oo점(총점) ... 5등(학번), oo점(총점) 까즤
				int soreArr[] = new int [list.size()];
				String stuNoArr[] = new String[list.size()];
				for(int i=0; i<list.size(); i++) {
					HashMap<String, Object> student = list.get(i);
					scoreArr[i] = (Integer) student.get("java");
								  (Integer) student.get("db");
								  (Integer) student.get("html");
					stuNoArr[i] = (String) student.get("stuNo");
					
				}
				for(int i=0; i=scoreArr.length; i++) {
					int maxIndex = i;
					for(int j=i+1; j<scoreArr.length; j++) {
						if(scoreArr[maxIndex] < scoreArr[j]) {
							maxIndex = j;
						}
					}
					int temp = scoreArr[maxIndex];
					scoreArr[maxIndex] = scoreArr[i];
					scoreArr[i] = temp;
					
					String temp2 = stuNoArr[maxIndex];
					stuNoArr[maxIndex] = stuNoArr[i];
					stuNoArr[i] = temp;
				}
				System.out.println(Arrays.toString(scoreArr));
				System.out.println(Arrays.toString(stuNoArr));
				
				for(int i=0; i<socreArr.length; i++) {
					System.out.println((i+1) + " 등 : " + stuNoList[i] + ", " + scoreArr[i] + " 점 ");
				}
				
		        
			
		}

	

}
