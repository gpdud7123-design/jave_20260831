package day15;

public class 배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열의 단점(한계점?)
		// 1. 크기가 고정
		int arr[] = new int [5]; //오른쪽배열칸비워놓는거불가능 5개초과도불가능
		
		arr[5] = 100; // 5번째인덱스접근불가능 4개밖에없어서
		
		// 2. 삽입, 삭제 빈번할 때 컨트롤 힘들다
		int arr2[] = {3, 5, 2, 4, 1};
		// 맨 뒤에있는 1숫자를 두번째로 옮기고 나머지는 뒤로 밀기
		// {3,1,5,2,4} 어레이리스트 삽입삭제빈번할때 활용가능
		
	}

}
