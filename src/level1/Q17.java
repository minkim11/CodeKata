package level1;
/*
출처 https://school.programmers.co.kr/learn/courses/30/lessons/12932
문제 설명
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

제한 조건
n은 10,000,000,000이하인 자연수입니다.
*/

public class Q17 {
    public int[] solution(long n) {
        String stringN = n + "";
        int left = 0;
        int right = stringN.length() - 1;
        String[] tempList = stringN.split("");
        int[] answer = new int[tempList.length];
        while (left <= right) {
            answer[left] = Integer.parseInt(tempList[right]);
            answer[right] = Integer.parseInt(tempList[left]);
            left++;
            right--;
        }
        return answer;
    }
}
// 다른 사람 풀이
//new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();