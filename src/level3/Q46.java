package level3;
//출처 https://school.programmers.co.kr/learn/courses/30/lessons/81301?language=java
public class Q46 {
    class Solution {
        public int solution(String s) {
            String[] num = {"zero", "one", "two", "three", "four",
                    "five", "six", "seven", "eight", "nine"};

            for (int i = 0; i < num.length; i++) {
                s = s.replaceAll(num[i], i+"");
            }

            return Integer.parseInt(s);
        }
    }
}
