package level3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Q54 {
    public String solution(int a, int b) {
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int diffDate = 0;

        if (a == 1) {
            diffDate = b - 1;
            return day[diffDate % 7];
        }

        for (int i = 2; i <= a; i++) {
            diffDate += month[i - 2];
        }

        diffDate = diffDate + (b - 1);

        return day[diffDate % 7];
    }
}
