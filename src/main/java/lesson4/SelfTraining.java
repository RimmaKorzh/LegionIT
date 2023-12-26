package lesson4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

public class SelfTraining {


    public boolean has22(int[] array){

        boolean result = false;

        for( int i=0; i<array.length-1; i++) {
            if(array[i] == 2 && array[i + 1] == 2) {
                result=true;
            break;
            }

        }
        return result;
    }


public boolean lucky13(int[] array){

        boolean result = false;
        for(int i=0; i<array.length; i++){
            if(array[i]==1 || array[i]==3){
                result = true;
            }
        }
return  result;
    }


public String maxTriple(int[] array) {
    String result = "";

    if (array.length % 2 == 1) {
        System.out.println("The array is odd");

        int first = array[0];
        int last = array[array.length - 1];
        int middle = array[(array.length - 1) / 2];

        if (first > middle && first > last) {
            result += first;
        } else if (middle > last) {
            result += middle;

        } else {
            result += last;
        }
    } else {
        result += "the array is even";}
        return result;
    }

    public int arrayFront9(int [] array){

int result=0;
 for(int i=0; i<=4; i++){
 if(array[i]==9){
     result= 9;
     break;
 }
    }
        return  result;
}

public int[] arrayList(int [] array){

        int[] res = new int[array.length];
    for (int i=0; i< array.length; i++){
        res [i]= array[i] * array[i];
        System.out.println(i+ "multiply" +i);
    }
          {
        
    }
return res;
       }
   }






















