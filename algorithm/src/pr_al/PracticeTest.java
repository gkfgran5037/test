package pr_al;

import java.util.ArrayList;
import java.util.List;

/**프로그래머스 모의고사 - 완전탐색
 * 
 * 문제설명 ) 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
 *         1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
 *         2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
 *         3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
 *         1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 
 *         가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
 *         
 * 제한조건 ) 시험은 최대 10,000 문제로 구성되어있습니다.
 *         문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
 *         가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
*/
public class PracticeTest {
	public static void main(String[] args) {
		int[]answers = {1,2,3,4,5};
		solution(answers);
	}
	
	// 방법 1
    public static int[] solution(int[] answers) {
    	int[][] students = {{1, 2, 3, 4, 5}
    				     , {2, 1, 2, 3, 2, 4, 2, 5}
    				     , {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
    	List<Integer> answer = new ArrayList<Integer>();
    	//
    	int maxScore = 0;
    	for (int i = 0; i < students.length; i++) {
    		int score = getScore(answers, students[i]);
    		if (maxScore > score ) continue;
    		//
    		if (maxScore < score ) {
    			answer.clear();
    			maxScore = getScore(answers, students[i]);
    		}
    		answer.add(i+1);
		}
    	
    	//
    	return answer.stream().mapToInt(x->x).toArray();
    }
    
    public static int getScore(int[] answers, int[] student) {
		int score = 0;
    	for (int i = 0; i < answers.length; i++) {
			if (answers[i] == student[i%student.length]) {
				score++;
			}
		}
    	return score;
	}

}
