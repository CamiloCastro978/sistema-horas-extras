package co.bamocol.horasextras;

public class Employee {

    // Attributes
    private String idNumber;
    private String name;
    private String position;
    private Shift workday;
    private boolean active;

    // Constructor
    public Employee(String idNumber, String name, String position,
            Shift workday) {
        this.idNumber = idNumber;
        this.name = name;
        this.position = position;
        this.workday = workday;
        this.active = true;
    }

    // Getters
    public String getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public Shift getWorkday() { return workday; }

    public boolean isActive() {
        return active;
    }

    // Setters
    public void setActive(boolean active) {
        this.active = active;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setWorkday(Shift workday) { this.workday = workday; }

    // String representation
    @Override
    public String toString() {
        return idNumber + " - " + name + " (" + position + ") " +
                workday;
    }
}
