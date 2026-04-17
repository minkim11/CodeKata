package level2;

public class Q34 {
    public String solution(String s) {
        String answer = "";
        String tempS = s;
        char max = '0';
        while (tempS.length() >= 1) {
            max = '0';
            for (int i = 0; i < tempS.length(); i++) {
                if (max < tempS.charAt(i)) max = tempS.charAt(i);
            }
            tempS = tempS.replaceFirst(max + "", "");
            answer += max;
        }
        return answer;
    }
}
