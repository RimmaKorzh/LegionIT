package lesson2;

public class SumBetween {
    public static void main(String[] args) {
      SumBetween sumBetween = new SumBetween();
        sumBetween.sumBetween(1,3);


    }
    public void sumBetween(int a, int b){
        int result = a+b+(b-a);

        System.out.println("The result of sum is " +result);
    }


}
