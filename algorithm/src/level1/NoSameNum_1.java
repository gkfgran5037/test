package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 프로그래머스 - 연습문제 - 같은 숫자는 싫어
 * 
 * 분제
 *  - 배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다. 
 *    배열 arr에서 제거 되고 남은 수들을 return 하는 solution 함수를 완성해 주세요. 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다.
 *    배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.
 * 
 * 제한조건
 *  - 1) 배열 arr의 크기 : 1,000,000 이하의 자연수
 *    2) 배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수
 *      
 * 입출력 예
 *  - 입력 [1,1,3,3,0,1,1] / 출력 : [1,3,0,1]
 *  - 입력 [4,4,4,3,3] / 출력 : [4,3]
 */
public class NoSameNum_1 {
	public int[] solution(int []arr) {
        int[] answer;
        List<Integer> list = new ArrayList<Integer>();
        
        list.add(arr[0]);
        for (int i=1; i<arr.length; i++) {
			if (arr[i-1]==arr[i]) 
				continue;
			list.add(arr[i]);
		}
        answer = list.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(answer));
        
        return answer;
	}
	
	public static void main(String[] args) {
		NoSameNum_1 n = new NoSameNum_1();
		int[] arr = {4, 4, 4, 3, 3};
		//int[] arr = {1,1,3,3,0,1,1};
		n.solution(arr);
	}
}
