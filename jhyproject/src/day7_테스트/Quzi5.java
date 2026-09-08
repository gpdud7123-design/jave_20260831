package day7_테스트;

import day6.Food;

public class Quzi5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		5. 사용자로부터 세 과목(국어, 영어, 수학)의 점수를 각각 입력받아 평균을 구하세요.
//		평균이 80점 이상이면 '합격', 그렇지 않으면 '불합격'을 출력합니다. 
//		단, 세 과목 중 단 한 과목이라도 50점 미만이 있다면 평균 점수와 상관없이 '과락으로 인한 불합격'을 출력해야 합니다.
		int score = 0;
		
		
		if(score >= 80) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}  if (score < 50) {
			System.out.println("과락으로 인한 불합격");
		}
		
	}

}
