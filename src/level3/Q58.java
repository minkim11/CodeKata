package level3;

// 소수만들기 https://school.programmers.co.kr/learn/courses/30/lessons/12977
public class Q58 {
    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    boolean check = true;
                    for (int l = 2; l <= Math.sqrt(sum); l++) {
                        if (sum % l == 0) {
                            check = false;
                            break;
                        }
                    }
                    if (check) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}
