package level3;

// 콜라 문제 https://school.programmers.co.kr/learn/courses/30/lessons/132267
public class Q52 {
    public int solution(int a, int b, int n) {
        int totalCoke = 0;

        while (n >= a) {
            int cokeCount = n / a * b;
            totalCoke += cokeCount;
            n = n % a + cokeCount;
        }

        return totalCoke;
    }
}
