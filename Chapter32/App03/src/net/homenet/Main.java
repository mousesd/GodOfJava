package net.homenet;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();

        app.runDayOfWeekSample();
    }

    private void runDayOfWeekSample() {
        DayOfWeek[] dayOfWeeks = DayOfWeek.values();
        Locale locale = Locale.getDefault();

        for (DayOfWeek dayOfWeek : dayOfWeeks) {
            System.out.print(dayOfWeek.getDisplayName(TextStyle.FULL, locale) + " ");
            System.out.print(dayOfWeek.getDisplayName(TextStyle.SHORT, locale) + " ");
            System.out.println(dayOfWeek.getDisplayName(TextStyle.NARROW, locale));
        }
    }
}
