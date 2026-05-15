package level3;

// 푸드파이트 대회 https://school.programmers.co.kr/learn/courses/30/lessons/134240
public class Q51 {

    public String solution(int[] food) {
        String player1 = "";
        String player2 = "";
        for (int i = 1; i < food.length; i++) {
            player1 += (i + "").repeat(food[i] / 2);
        }

        for (int j = food.length - 1; j >= 0; j--) {
            player2 += (j + "").repeat(food[j] / 2);
        }

        return player1 + "0" + player2;
    }
}
