package day12;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import day11.DBClass;
import day11.MyFunction;

public class _1_성적관리프로그램_DB {
	static DBClass db = new DBClass();
	static Statement stmt = db.getStmt();
	static Scanner s = new Scanner(System.in);

	public static void inputScore() {
		// 성적 입력
		// 테이블명 : STUDENT, 컬럼 : STU_NO(학번), STU_NAME(이름), JAVA(자바점수), ORACLE(오라클점수),
		// HTML(HTML점수)
		// 학번, 이름, 3개 과목의 점수를 입력받아 STUDENT 테이블에 저장
		// 조건 1. 학번은 무조건 4글자(4자리 숫자). 잘못 입력할 경우 다시 입력받도록 함.
		// 조건 2. 학번은 중복되면 안됨(PK). 학번 입력받은 후 검색해보고 없을 경우 삽입
		// 중복된 학번을 입력할 경우 알림 메시지 후 메뉴로 이동 함.
		// 조건 3. 각 과목의 점수는 0~100 사이 값이여야 함.
		// 잘못된 범위를 입력할 경우 다시 입력받도록 함.
		try {
			System.out.print("성적 입력 : ");
			String studentNumber = "'" + s.next() + "'";
			String sql = "SELECT * FROM STUDENT WHERE STU_NAME = " + studentNumber;
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				System.out.println("이미 존재하는 과일입니다.");
				return;
			}
			int stuNum = MyFunction.nonNegative("학번 : ");
			int cnt = MyFunction.nonNegative("이름 : ");

			String insertSql = "INSERT INTO STUDENT " + "VALUES(" + studentNumber + "," + cnt + ")";
			int result = stmt.executeUpdate(insertSql);
			if (result > 0) {
				System.out.println("추가되었습니다");
			} else {
				System.out.println("추가에 실패했습니다");
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		
		
	}

	public static void rank() {
		// 순위 출력
		// 1등 : ooo(학번), ooo(이름), oo점(평균점수)
		// 2등 : ooo(학번), ooo(이름), oo점(평균점수)
		// ..
		// oo등 : ooo(학번), ooo(이름), oo점(평균점수)
		
		
	}

	public static void updateScore() {
		// 성적 수정
		// 학번을 입력받은 후 해당 학생의 과목 점수 수정
		// 입력한 학번의 학생이 없을 경우 메뉴로 이동
		// 학번이 있을 경우 새로운 메뉴 '[ (1) 자바 (2) 오라클 (3) HTML ]' 을 띄우고
		// 선택한 메뉴의 점수만 입력받아서 수정( ex : 2번 선택 후 점수 입력받으면 오라클 점수만 수정 )
		// 1~3번 외에 다른 숫자 입력 시 다시 입력받도록 하며, 점수의 범위는 0~100 사이
		try {
			System.out.print("학번 : ");
			String stuNum = "'" + s.next() + "'";
			String sql = "SELECT * FROM STUDENT WHERE STU_NAME = " + stuNum;
			ResultSet rs = stmt.executeQuery(sql);

			if (rs.next()) {
				System.out.println("현재 점수는 : " + rs.getInt("stuNo") + "점 입니다.");
				System.out.print("[ (1) 자바 (2) 오라클 (3) HTML ]");
				int newStuNo = s.nextInt();

				String updateSql = "UPDATE STUDENT SET " + " STUDENT = " + newStuNo + " WHERE STU_NAME = " + stuNum;
				int updateScore = stmt.executeUpdate(updateSql);
				if (updateScore >= 0 && updateScore <= 100 ) {
					System.out.println("수정되었습니다!");
				} else {
					System.out.println("수정에 실패했습니다.");
				}
				

			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

		
		
		
	}

	public static void removeScore() {
		// 삭제
		// 학번을 입력받은 후 해당 학번을 가진 학생 삭제
		// 따로 중복체크 없이 삭제 요청 후 삭제 여부에 따라 성공or실패 메시지 출력
		// 삭제하기전 정말 삭제할지 (Y or N) 묻고 진행
		try {
			System.out.print("학번 : ");
			String StudentName = "'" + s.next() + "'";

			System.out.print("정말 삭제하시겠습니까? y or n :");
			String answer = s.next().toUpperCase();

			if (answer.equals("Y")) {
				String sql = "DELETE FROM STUDENT WHERE STU_NAME = " + StudentName;
				int result = stmt.executeUpdate(sql);
				if (result > 0) {
					System.out.println("삭제되었습니다");
				} else {
					System.out.println("삭제에 실패했습니다.");
				}
			} else {
				System.out.println("취소되었습니다");
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

	public static void passFail() {
		// pass or fail
		// 학번 입력 후 해당 학번 학생이 있을 경우 pass or fail 여부 알려주기
		// 학번 없을 경우 메뉴로 이동
		// pass여부는 평균 점수가 60점 이상이며, 한과목이라도 40점 미만이 있을 경우 fail
		// 출력할때는 평균점수와 각 과목의 점수, pass or fail 여부를 출력
		try {
			System.out.println("학번 입력 : ");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			while (true) {
				System.out.print("[ (1) 성적입력 (2) 순위 (3) 성적수정 (4) 삭제 (5) 통과여부 (그 외) 종료 ] : ");
				int menu = s.nextInt();

				switch (menu) {
				case 1:
					inputScore();
					break;
				case 2:
					rank();
					break;
				case 3:
					updateScore();
					break;
				case 4:
					removeScore();
					break;
				case 5:
					passFail();
					break;
				default:
					System.out.println("종료되었습니다.");
					break;
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}