package level3;

import java.util.Arrays;

// 문자열 내 마음대로 정렬하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12915

public class Q47 {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings);
        Arrays.sort(strings, (a, b) -> a.charAt(n) - b.charAt(n));
        return strings;
    }
}
