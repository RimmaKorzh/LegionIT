package homeworkM6OOP;

public class Clerk extends Manager  {
    public Clerk(String name, int id, String title, int birth, int salary, String address) {
        super(name, id, title, birth, salary, address);
    }
public void clerkCallToClients(){
    System.out.println("Clerk - " + employeeName  + "  can call to clients");
}


}
