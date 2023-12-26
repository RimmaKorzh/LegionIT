package lesson3;

public class LetterInWord {
    public static void main(String[] args) {
        LetterInWord letter_b  =new LetterInWord();
       boolean result = letter_b.letterInWord("huub");
        System.out.println(result);


    }
    public boolean letterInWord(String text){
    boolean result;
     int myfirstInd=text.indexOf("b");
        System.out.println("the place of the first b is " + myfirstInd);
     int mysecondInd=text.indexOf("b",myfirstInd+2);
        System.out.println("the place of the second b is " + mysecondInd);
     if(mysecondInd-myfirstInd==2){
         result=true;
     }
     else {result=false;}

     return result;
     }}








