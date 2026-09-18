package day15;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap예제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 스캐너로 학번 , 이름, 자바점수, db점수 입력받아서
		// map(hong)에 저장
		// 키는 순서대로 'stuNo, name, java, db'로 저장
		HashMap<String, Object> hong = new HashMap<>();
		Scanner s = new Scanner(System.in);
		System.out.println("--- 학생 정보 입력 ---");

		System.out.print("학번 입력: ");
		String stuNo = s.next();
		hong.put("stuNo", stuNo);

		System.out.print("이름 입력: ");
		String name = s.next();
		hong.put("name", name);

		System.out.print("Java 점수 입력: ");
		int javaScore = s.nextInt();
		hong.put("java", javaScore);

		System.out.print("DB 점수 입력: ");
		int dbScore = s.nextInt();
		hong.put("db", dbScore);
		
        
		

	}

}
