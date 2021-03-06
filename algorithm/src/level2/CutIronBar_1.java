package level2;

import java.util.Arrays;
import java.util.List;

/* 프로그래머스 - 스택/큐 - 쇠막대기
 * 분제
 *  - 여러 개의 쇠막대기를 레이저로 절단하려고 합니다. 
 *    효율적인 작업을 위해서 쇠막대기를 아래에서 위로 겹쳐 놓고, 레이저를 위에서 수직으로 발사하여 쇠막대기들을 자릅니다. 
 *    쇠막대기와 레이저의 배치를 표현한 문자열 arrangement가 매개변수로 주어질 때, 
 *    잘린 쇠막대기 조각의 총 개수를 return 하도록 solution 함수를 작성해주세요.
 *    
 * 제한사항
 *  - 쇠막대기는 자신보다 긴 쇠막대기 위에만 놓일 수 있습니다.
 *  - 쇠막대기를 다른 쇠막대기 위에 놓는 경우 완전히 포함되도록 놓되, 끝점은 겹치지 않도록 놓습니다.
 *  - 각 쇠막대기를 자르는 레이저는 적어도 하나 존재합니다.
 *  - 레이저는 어떤 쇠막대기의 양 끝점과도 겹치지 않습니다.
 *  - arrangement의 길이는 최대 100,000입니다.
 *  - arrangement의 여는 괄호와 닫는 괄호는 항상 쌍을 이룹니다.
 *  
 *  입력 : ()(((()())(())()))(())
 *  출력 : 17
 */
public class CutIronBar_1 {
	public int solution(String arrangement) {
        int sumOfCount = 0;
        
        arrangement = arrangement.replaceAll("\\(\\)", "0");
        List<String> bars = Arrays.asList(arrangement.split(""));
        
        int countOfBar = 0;
        
        for (String bar : bars) {
        	if (bar.equals("(")) {
        		countOfBar++;
			}
        	if (bar.equals(")")) {
        		countOfBar--;
        		sumOfCount++;
        	}
        	if (bar.equals("0")) {
        		sumOfCount += countOfBar;
        	}
        }
        return sumOfCount;
    }
	
	public static void main(String[] args) {
		CutIronBar_1 c = new CutIronBar_1();
		String arrangement = "()(((()())(())()))(())";
		c.solution(arrangement);
	}
}
