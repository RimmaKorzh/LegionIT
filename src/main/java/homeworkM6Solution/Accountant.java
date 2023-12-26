package homeworkM6Solution;

public class Accountant extends Employee {


    public Accountant(String employeeName, int employeeId, String employeePosition) {
        super(employeeName, employeeId, Constants.ACCOUNTANT_TYPE, "10.10.2000", Constants.ACCOUNTANT_DEFAULT_SALARY);
    }
    public void createReport(){
        System.out.println("Report Create");
    }
}
