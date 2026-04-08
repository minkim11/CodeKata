package level1;
/*
출처 https://school.programmers.co.kr/learn/courses/30/lessons/12925
문제 설명
문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.

제한 조건
s의 길이는 1 이상 5이하입니다.
s의 맨앞에는 부호(+, -)가 올 수 있습니다.
s는 부호와 숫자로만 이루어져있습니다.
s는 "0"으로 시작하지 않습니다.
*/
public class Q18 {
    public int solution(String s) {
        return Integer.parseInt(s);
    }
}
// 다른 사람 풀이
/*
public int getStrToInt(String str) {
    boolean Sign = true;
    int result = 0;

    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (ch == '-')
            Sign = false;
        else if(ch !='+')
            result = result * 10 + (ch - '0');
    }
    return Sign?1:-1 * result;
}*/
