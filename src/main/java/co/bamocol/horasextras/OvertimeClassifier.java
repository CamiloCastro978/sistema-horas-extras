package co.bamocol.horasextras;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class OvertimeClassifier {

    // Night shift starts at 7:00 pm (law 2466 of 2025)
    private static final LocalTime NIGHT_START = LocalTime.of(19, 0);
    private static final LocalTime NIGHT_END = LocalTime.of(6, 0);

    // Colombian holidays 2026
    private static final List<LocalDate> HOLIDAYS = List.of(
            LocalDate.of(2026, 1, 1),
            LocalDate.of(2026, 1, 12),
            LocalDate.of(2026, 3, 23),
            LocalDate.of(2026, 4, 2),
            LocalDate.of(2026, 4, 3),
            LocalDate.of(2026, 5, 1),
            LocalDate.of(2026, 5, 18),
            LocalDate.of(2026, 6, 8),
            LocalDate.of(2026, 6, 29),
            LocalDate.of(2026, 7, 2),
            LocalDate.of(2026, 7, 20),
            LocalDate.of(2026, 8, 7),
            LocalDate.of(2026, 8, 17),
            LocalDate.of(2026, 10, 12),
            LocalDate.of(2026, 11, 2),
            LocalDate.of(2026, 11, 16),
            LocalDate.of(2026, 12, 8),
            LocalDate.of(2026, 12, 25));

    public String classify(OvertimeRecord record) {
        LocalDate date = record.getDate();
        LocalTime start = record.getStartTime();

        boolean isSunday = date.getDayOfWeek() == DayOfWeek.SUNDAY;
        boolean isHoliday = HOLIDAYS.contains(date);
        boolean isNight = !start.isBefore(NIGHT_START) || start.isBefore(NIGHT_END);

        if ((isSunday || isHoliday) && isNight) {
            return "SUNDAY_NIGHT";
        } else if (isSunday || isHoliday) {
            return "SUNDAY_DAY";
        } else if (isNight) {
            return "WEEKDAY_NIGHT";
        } else {
            return "WEEKDAY_DAY";
        }
    }

    public void classifyAndUpdate(OvertimeRecord record) {
        String type = classify(record);
        record.setOvertimeType(type);
    }
}
