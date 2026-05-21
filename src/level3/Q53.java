package level3;

// 명예의 전당(1) https://school.programmers.co.kr/learn/courses/30/lessons/138477
// 다른 풀이 : Queue 사용해서 풀기
public class Q53 {
    public int[] solution(int k, int[] score) {
        int[] ranker = new int[k];
        int[] answer = new int[score.length];
        int min = score[0];

        for (int i = 0; i < score.length; i++) {

            if (i < k) {
                ranker[i] = score[i];
                if (min > ranker[i]) {
                    min = ranker[i];
                }
            } else if (score[i] > min) {
                for (int j = 0; j < k; j++) {
                    if (min == ranker[j]) {
                        ranker[j] = score[i];
                        min = Integer.MAX_VALUE;
                        break;
                    }
                }
                for (int l = 0; l < k; l++) {
                    if (min > ranker[l]) {
                        min = ranker[l];
                    }
                }
            }
            answer[i] = min;

        }

        return answer;
    }
}
