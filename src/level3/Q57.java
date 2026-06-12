package level3;

import java.util.ArrayList;
import java.util.List;


// 모의고사 https://school.programmers.co.kr/learn/courses/30/lessons/42840
public class Q57 {
    public int[] solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        int[] user1 = {1,2,3,4,5};
        int[] user2 = {2,1,2,3,2,4,2,5};
        int[] user3 = {3,3,1,1,2,2,4,4,5,5};
        int user1grades = 0;
        int user2grades = 0;
        int user3grades = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == user1[i % 5]) {
                user1grades += 1;
            }
            if (answers[i] == user2[i % 8]) {
                user2grades += 1;
            }
            if (answers[i] == user3[i % 10]) {
                user3grades += 1;
            }
        }

        int max = user1grades;
        if (user2grades > max) {
            max = user2grades;
        }
        if (user3grades > max) {
            max = user3grades;
        }

        if (max == user1grades) {
            answer.add(1);
        }
        if (max == user2grades) {
            answer.add(2);
        }
        if (max == user3grades) {
            answer.add(3);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
