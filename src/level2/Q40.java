package level2;
/*
출처 https://school.programmers.co.kr/learn/courses/30/lessons/68935
문제 설명
자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.

제한사항
n은 1 이상 100,000,000 이하인 자연수입니다.
*/

public class Q40 {
    public int solution(int n) {
        if (n < 3) return n;
        int answer = 0;
        int i = 1;
        int max = 1;
        while (true) {
            if (n / (int)Math.pow(3, i) < 3) {
                max = (int)Math.pow(3, i);
                answer += n / (int)Math.pow(3, i);
                break;
            }
            i++;
        }
        n -= max * (n / (int)Math.pow(3, i));
        for (int j = i - 1; j >= 0; j--) {
            max /= 3;
            if (n / max < 3) {
                answer = answer + (n/max) * (int)Math.pow(3, i - j) ;
                n -= max * (n / max);
            }
        }
        return answer;
    }
}
