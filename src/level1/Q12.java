package level1;
/*
출처 https://school.programmers.co.kr/learn/courses/30/lessons/12944
문제 설명
정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.

제한사항
arr은 길이 1 이상, 100 이하인 배열입니다.
arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
*/

import java.util.Arrays;

public class Q12 {
    public double solution(int[] arr) {
        return Arrays.stream(arr).average().orElse(0);
    }
}
//average는 중간연산, OptionalDouble이 반환되므로 orElse 최종으로 사용해야 함
// 값이 있으면 값 반환, null이면 other 반환