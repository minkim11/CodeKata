package level3;

public class Q44 {
    public int solution(int[][] sizes) {
        int w = 0;
        int h = 0;
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] <= sizes[i][1] && sizes[i][1] > w) {
                w = sizes[i][1];
            }
            if(sizes[i][0] <= sizes[i][1] && sizes[i][0] > h) {
                h = sizes[i][0];
            }
            if (sizes[i][0] > sizes[i][1] && sizes[i][0] > w) {
                w = sizes[i][0];
            }
            if (sizes[i][0] > sizes[i][1] && sizes[i][1] > h) {
                h = sizes[i][1];
            }
        }
        return w * h;
    }
}
// 다른 사람 풀이 Math.Max, Min 사용