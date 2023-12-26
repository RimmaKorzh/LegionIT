package homeworkM6OOP;

public class Accountant extends Manager {
    public Accountant(String name, int id, String title, int birth, int salary, String address) {
        super(name, id, title, birth, salary, address);
    }
public void createReport(){
    System.out.println("Accountant " + employeeName + " will prepare the report");
}

}
