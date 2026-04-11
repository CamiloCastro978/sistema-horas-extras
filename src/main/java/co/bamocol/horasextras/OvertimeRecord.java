package co.bamocol.horasextras;

import java.time.LocalDate;
import java.time.LocalTime;

public class OvertimeRecord {
    
    private Employee employee;
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;
    private String activity;
    private String overtimeType;


    // Constructor
    public OvertimeRecord(Employee employee, LocalDate date, LocalTime startTime, LocalTime endTime, String activity) {
        this.employee = employee;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.activity = activity;
        this.overtimeType = "";
    }

    // Getters and Setters

    public Employee getEmployee() {
        return employee;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getStartTime() {
        return startTime;
    }


    public LocalTime getEndTime() {
        return endTime;
    }


    public String getActivity() {
        return activity;
    }

    public String getOvertimeType() {
        return overtimeType;
    }


    public void setOvertimeType(String overtimeType) {
        this.overtimeType = overtimeType;
    }

    @Override
    public String toString() {
    return date + " | " + employee.getName() + " | " + 
           startTime + " - " + endTime + " | " + activity;
    
    }
}
