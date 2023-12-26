package homeworkM6Solution;

public class Manager extends Employee {
    public Manager(String employeeName, int employeeId,  String employeeDateOfBirth) {
        super(employeeName, employeeId, Constants.MANAGER_TYPE, employeeDateOfBirth, Constants.MANAGER_DEFAULT_SALARY);
    }
    public void hireEmployee(String employeeName){
        System.out.printf("The employee %s was hired", employeeName);
    }
    public void fireEmployee(String employeeName){
        System.out.println(String.format("The employee %s was fired", employeeName));
    }
}
