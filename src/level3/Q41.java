package level3;

public class Q41 {
    public String solution(String s) {
        String answer = "";
        boolean spaceIsOdd = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && i % 2 == 0) {
                spaceIsOdd = true;
            } else if (s.charAt(i) == ' ' && i % 2 == 1) {
                spaceIsOdd = false;
            }
            if (spaceIsOdd && i % 2 == 1) {
                answer += (s.charAt(i) + "").toUpperCase();
                continue;
            } else if (spaceIsOdd && i % 2 == 0) {
                answer += (s.charAt(i) + "").toLowerCase();
                continue;
            }
            if (i % 2 == 0) {
                answer += (s.charAt(i) + "").toUpperCase();
            } else {
                answer += (s.charAt(i) + "").toLowerCase();
            }
        }
        return answer;
    }
}
