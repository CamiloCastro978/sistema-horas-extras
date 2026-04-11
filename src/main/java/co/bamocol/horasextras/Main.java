package co.bamocol.horasextras;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
     public static void main(String[] args) {  // ← método main
    // 1. Create a shift
        Shift morningShift = new Shift("Morning", 
            LocalTime.of(7, 0), 
            LocalTime.of(17, 0), 
            false);

        // 2. Create an employee
        Employee employee1 = new Employee(
            "12345678", 
            "Carlos Martinez", 
            "Driver", 
            morningShift);

        // 3. Create overtime records
        OvertimeRecord record1 = new OvertimeRecord(
            employee1,
            LocalDate.of(2026, 6, 14),  // Sunday
            LocalTime.of(17, 0),
            LocalTime.of(19, 0),
            "Monthly inventory closing");

        OvertimeRecord record2 = new OvertimeRecord(
            employee1,
            LocalDate.of(2026, 6, 15),  // Monday - night
            LocalTime.of(20, 0),
            LocalTime.of(22, 0),
            "Route coverage");

        // 4. Classify
        OvertimeClassifier classifier = new OvertimeClassifier();
        classifier.classifyAndUpdate(record1);
        classifier.classifyAndUpdate(record2);

        // 5. Print results
        System.out.println("=== Overtime Records ===");
        System.out.println(record1);
        System.out.println("Type: " + record1.getOvertimeType());
        System.out.println("---");
        System.out.println(record2);
        System.out.println("Type: " + record2.getOvertimeType());
    }
}