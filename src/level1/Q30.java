package level1;
/*
출처 https://school.programmers.co.kr/learn/courses/30/lessons/12903
문제 설명
단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

        재한사항
s는 길이가 1 이상, 100이하인 스트링입니다.
*/

public class Q30 {
    public String solution(String s) {
        int sLastIndex = s.length() - 1;
        if (sLastIndex % 2 == 1) {
            return s.charAt(sLastIndex/2) + "" + s.charAt(sLastIndex/2 + 1);
        }
        return s.charAt(sLastIndex/2) + "";
    }
}
