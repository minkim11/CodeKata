package level3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 카드 뭉치 https://school.programmers.co.kr/learn/courses/30/lessons/159994
public class Q55 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {

        List<String> arrayCards1 = new ArrayList<>(Arrays.asList(cards1));
        List<String> arrayCards2 = new ArrayList<>(Arrays.asList(cards2));
        boolean isPresent = true;

        for (int i = 0; i < goal.length; i++) {
            if (!arrayCards1.isEmpty() && goal[i].equals(arrayCards1.get(0))) {
                arrayCards1.remove(0);
                continue;
            }
            if (!arrayCards2.isEmpty() && goal[i].equals(arrayCards2.get(0))) {
                arrayCards2.remove(0);
                continue;
            }
            isPresent = false;
            break;
        }

        return isPresent ? "Yes" : "No";
    }
}
