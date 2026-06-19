package level3;

// 덧칠하기 https://school.programmers.co.kr/learn/courses/30/lessons/161989
public class Q59 {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int idx = 0;
        int check = 0;
        while (idx < section.length) {
            if (idx > 0 && section[check] + m - 1 >= section[idx]) {
                idx++;
                continue;
            }
            if ((section[idx] + m - 1) >= n) {
                answer++;
                break;
            }
            check = idx;
            answer++;
            idx++;
        }
        return answer;
    }
}
