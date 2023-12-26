package lesson2;

public class HomeWorkLoops {
    public static void main(String[] args) {
        HomeWorkLoops Loops = new HomeWorkLoops();
        Loops.countNumbers(10);
//HomeWorkLoops Numbers =new HomeWorkLoops();

    }
        public void countNumbers(int limit) {
for(int i = 1; i<=limit; i++){



        if (i%3==0){
          System.out.println( " Number " + i + " is divisible by 3 ");


}
    else if (i%2==1) {

        System.out.println(" Number " + i + " is odd ");

    }
if (i%2==0){
    System.out.println( " Number " + i + " is even");
}
    System.out.println();
            }


    }




}





















