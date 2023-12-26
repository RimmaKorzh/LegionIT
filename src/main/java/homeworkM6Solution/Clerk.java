package homeworkM6Solution;

public class Clerk extends Employee{


    public Clerk(String employeeName, int employeeId,  String employeeDateOfBirth ) {
        super(employeeName, employeeId, Constants.CLERK_TYPE, employeeDateOfBirth, Constants.CLERK_DEFAULT_SALARY);
    }
    public void makeCall(String customerName){
        System.out.println(String.format("Connected to customer %s", customerName));
    }
    public void getCall(String customerName){
        System.out.printf("Answered to customer %s", customerName);
    }
}
