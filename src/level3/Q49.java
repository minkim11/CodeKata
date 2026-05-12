package level3;

import java.util.HashSet;
import java.util.Set;

// 두 개 뽑아서 더하기 https://school.programmers.co.kr/learn/courses/30/lessons/68644
public class Q49 {
    public int[] solution(int[] numbers) {
        Set<Integer> temp = new HashSet<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                temp.add(numbers[i] + numbers[j]);
            }
        }
        return temp.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
}
