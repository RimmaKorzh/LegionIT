package homeworkM6OOP;

public class Manager  {

    String employeeName;
    int id;
    String title;
    int dateOfBirth;
    int salary;
    String address;

    public Manager(String name, int id, String title, int birth, int salary, String address){
     this.employeeName = name;
     this.id = id;
     this.title = title;
     this.dateOfBirth = birth;
     this.salary = salary;
     this.address = address;

    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


      public void printBankEmployee(){

          System.out.println("********");
          System.out.println("Name of Employee: " + employeeName);
          System.out.println("id: " + id);
          System.out.println("title: " + title);
          System.out.println("data of birth: " + dateOfBirth);
          System.out.println("salary: " + salary);
          System.out.println("address: " + address);


    }
public void hireAndFireEmployees(){
    System.out.println("Manager " + employeeName + " can hire and fire employees");
}
public void receiveSalary(){
    System.out.println("Employee : "  + employeeName +  " - "  + title + " will receive salary this month" );
}
}



