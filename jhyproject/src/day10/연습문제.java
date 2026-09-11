package day10;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class 연습문제 {
		
		public static boolean sameNumberCounts(int[] arr1, int[] arr2) {
		    // 구현
			if (arr1.length != arr2.length) {
		        return false;
		    }

		    Map<Integer, Integer> countMap = new HashMap<>();

		    // 첫 번째 배열의 숫자 개수 카운트
		    for (int num : arr1) {
		        countMap.put(num, countMap.getOrDefault(num, 0) + 1);
		    }

		    // 두 번째 배열의 숫자로 카운트 차감
		    for (int num : arr2) {
		        // 첫 번째 배열에 없는 숫자가 있거나 개수가 초과되면 false
		        if (!countMap.containsKey(num) || countMap.get(num) == 0) {
		            return false;
		        }
		        countMap.put(num, countMap.get(num) - 1);
		    }

		    return true;
		}
		// 입력: [1, 2, 2, 3], [3, 2, 1, 2]
		// 출력: true

		// 입력: [1, 2, 2], [1, 2, 3]
		// 출력: false

//		# 두 개의 정수 배열이 주어졌을 때, 공통으로 포함된 숫자들만 중복 없이 리스트로 반환
		// 예시 입력: {1, 2, 3, 4}, {3, 4, 4, 5}
		// 예시 출력: [3, 4]
		public static List<Integer> findIntersection(int[] arr1, int[] arr2) {
		    // 구현
			List<Integer> result = new ArrayList<>();
		    Set<Integer> set = new HashSet<>();

		    // 첫 번째 배열의 원소들을 Set에 추가 (중복 자동 제거)
		    for (int num : arr1) {
		        set.add(num);
		    }

		    // 두 번째 배열을 순회하며 공통 원소 찾기
		    for (int num : arr2) {
		        // Set에 존재한다면 공통 원소임
		        if (set.contains(num)) {
		            result.add(num);
		            set.remove(num); // 결과 리스트에 중복으로 들어가는 것을 방지
		        }
		    }

		    return result;

		
		

	}
		
}
