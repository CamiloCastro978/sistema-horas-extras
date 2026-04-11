package co.bamocol.horasextras;

import java.time.LocalTime;

public class Shift {

    // Attributes
    private String name;
    private LocalTime startTime;
    private LocalTime endTime;
    private boolean nightShift;

    // Constructor
    public Shift(String name, LocalTime startTime,
            LocalTime endTime, boolean nightShift) {
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.nightShift = nightShift;
    }

    // Getters
    public String getName() {
        return name;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public boolean isNightShift() {
        return nightShift;
    }

    // Setters for changeable fields
    public void setName(String name) {
        this.name = name;
    }

    public void setNightShift(boolean nightShift) {
        this.nightShift = nightShift;
    }

    // String representation
    @Override
    public String toString() {
        return name + ": " + startTime + " to " + endTime;
    }
}
