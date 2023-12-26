package module3;

public class HomeWork1 {
    public static void main(String[] args) {
       HomeWork1 m3 = new HomeWork1();
       m3.oddAndEven(10);
    }

public void oddAndEven(int limit){
for (int i =0; i<=limit; i++){

    if  (i % 3 ==0 && i % 2 ==0) {
        System.out.println(i + " divided by 2 and 3");
    }

   else if(i % 3 ==0){
        System.out.println(i + " divisible by 3");
    }
    if(i % 2 == 1){
        System.out.println(i + " is odd");
    }
   else {
        System.out.println(i + " is even");
    }


//    System.out.println();
}}}
