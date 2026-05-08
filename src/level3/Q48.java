package level3;

import java.util.Arrays;

// K번째 수 https://school.programmers.co.kr/learn/courses/30/lessons/42748
public class Q48 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] tempArray = Arrays.stream(array, commands[i][0] - 1, commands[i][1]).sorted().toArray();
            answer[i] = tempArray[commands[i][2] - 1];
        }

        return answer;
    }
}
