package level1;
/*
출처 https://school.programmers.co.kr/learn/courses/30/lessons/120817
문제 설명
정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.

        제한사항
0 ≤ numbers의 원소 ≤ 1,000
        1 ≤ numbers의 길이 ≤ 100
정답의 소수 부분이 .0 또는 .5인 경우만 입력으로 주어집니다.
*/

import java.util.Arrays;

public class Q10 {
    public double solution(int[] numbers) {
        double answer = Arrays.stream(numbers).sum();
        return answer / numbers.length;
    }
}
// 다른 사람 풀이 -> 스트림 average도 있음, orElse(0) : 주어진 값이 null이 아니면 그냥 반환 아니면 0을 반환