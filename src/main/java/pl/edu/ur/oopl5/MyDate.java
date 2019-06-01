package pl.edu.ur.oopl5;

import java.time.LocalDate;

public class MyDate {

    private LocalDate now = LocalDate.now();

    public MyDate() {
        System.out.println(now);
    }

    void weeklater() {
        now = now.plusDays(7);
        System.out.println(now);
    }

    void weekbefore() {
        now = now.minusDays(7);
        System.out.println(now);
    }
}
