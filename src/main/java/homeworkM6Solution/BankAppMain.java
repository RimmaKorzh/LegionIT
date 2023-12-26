package homeworkM6Solution;

public class BankAppMain {

    public static void main(String[] args) {
        Manager manager = new Manager("Moshe", 1, "10.11.2000");
        Accountant accountant1 = new Accountant("Sara", 2, "23.01.1975");
        Clerk clerk1 = new Clerk("Dan", 3, "01.01.2000");

        System.out.println(manager.toString());
        System.out.println(accountant1.toString());
        System.out.println(clerk1.toString());

        manager.fireEmployee("Moshe");
        accountant1.createReport();
        clerk1.makeCall("Ivan");

        accountant1.setName("Mary");
        System.out.println(accountant1.toString());
}}
