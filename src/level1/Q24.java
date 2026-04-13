package level1;

public class Q24 {
    public String solution(String[] seoul) {
        String answer = "김서방은 i에 있다";
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                answer = answer.replaceAll("i", i + "");
            }
        }
        return answer;
    }
}
// 다른 사람 풀이
// break 걸어주기