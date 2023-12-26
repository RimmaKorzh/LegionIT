package homeworkM6Solution;

import static java.lang.String.format;

public abstract class Employee {
    private String name;
    private final int id;
    private String position;
    private final String dateOfBirth;
    private double salary;

    public Employee(String employeeName, int employeeId, String employeePosition, String employeeDateOfBirth, double employeeSalary){
        this.name = employeeName;
        this.id = employeeId;
        this.position = employeePosition;
        this.dateOfBirth = employeeDateOfBirth;
        this.salary = employeeSalary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public int getId() {
        return id;
    }


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

public void receiveSalary(){
    System.out.println("The salary was sent to the employee account");
}
public String toString(){
    String txt = format("Employee name: %s, position: %s, salary: %f", name, position, salary);
    return txt;
    }
}
