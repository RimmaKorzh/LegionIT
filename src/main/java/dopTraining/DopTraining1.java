package dopTraining;

import java.util.Arrays;
import java.util.Comparator;

public class DopTraining1 {
    public static void main(String[] args) {
        int sum =0;
        for( int i=1; i<=10; i++){
            sum+=i;

        }
        System.out.println("summ of the num is:"+sum);
    }

    public  void factorialCalculator(int num ) {
        int number =5;
        int factorial =1;
        for(int i= 1; i<=number; i++){
            factorial*=i;

        }
        System.out.println("factorial " + number+ " equal " + factorial);
    }
public void primeNumber(int num){

        if( num % 2 == 0 || num % 3==0)
            {
                System.out.println(false);

            }
           else{ System.out.println(num + " its a prime num " );}

}
public void sortOfArray(int[] array){
    Arrays.sort(array);

    for(int num :array){
        System.out.print(num+"");
    }

}
}
