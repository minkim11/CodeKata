package level1;
/*
출처 https://school.programmers.co.kr/learn/courses/30/lessons/12931
문제 설명
자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
        예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

제한사항
N의 범위 : 100,000,000 이하의 자연수
*/

public class Q13 {
    public int solution(int n) {
        String stringN = n + "";
        int answer = 0;
        for (int i = 0; i < stringN.length(); i++) {
            answer += stringN.charAt(i) - '0';
        }
        return answer;
    }
}
// 다른 사람 풀이
// 반복문 answer += n % 10, n = n / 10, n < 10 break; 1의 자리만 남을때까지 1의 자리를 계속 더해주기