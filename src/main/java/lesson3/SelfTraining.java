package lesson3;

public class SelfTraining {

    public static void main(String[] args) {
        SelfTraining selfTraining = new SelfTraining();
        boolean success = selfTraining.maxStart("kax snacks");
        System.out.println("" + success);

    }

    public boolean maxStart(String txt) {
   //     return txt.substring(1).startsWith("ax") ;
        boolean success = false;

               if (!txt.substring(1).startsWith("ax")) {
                System.out.println(txt.substring(1));
          }

              else {
                  success=true;
               }

        return success;
    }

}
























