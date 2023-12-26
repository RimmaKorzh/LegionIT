package homeworkM6OOP;

import java.util.concurrent.Callable;

public class BankEmployeesMain {
    public static void main(String[] args) {

        Manager manager = new Manager("Moshe", 1, "Manager", 11112000, 10000, "Tel Aviv");
        Clerk clerk1 = new Clerk("Kate", 10, "Clerk", 12122000, 3000, "Tel Aviv");
        Clerk clerk2 = new Clerk("Katy", 11, "Clerk", 13122000, 3000, "Tel Aviv");
        Clerk clerk3 = new Clerk("Kiti", 12, "Clerk", 14122000, 3000, "Tel Aviv");
        Accountant accountant = new Accountant("Arnold", 2, "Accountant", 15112000, 5000, "Tel Aviv" );

        manager.printBankEmployee();

        accountant.printBankEmployee();

        clerk1.printBankEmployee();
        clerk2.printBankEmployee();
        clerk3.printBankEmployee();
        System.out.println("*****");
        manager.hireAndFireEmployees();
        accountant.createReport();
        clerk1.clerkCallToClients();
        clerk2.clerkCallToClients();
        clerk3.clerkCallToClients();
        manager.receiveSalary();
        clerk1.receiveSalary();
        accountant.receiveSalary();

        accountant.setEmployeeName("Mary Petrov");
        accountant.printBankEmployee();
    }


}