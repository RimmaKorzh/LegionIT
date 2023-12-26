package advancedOOPTraining;

public class Main {
    public static void main(String[] args) {

        Cars car = new Cars("car", "12345", "red", 123);
        System.out.println(car.toString());
        car.carParking();
    boolean result = car.parking("");

    }
}