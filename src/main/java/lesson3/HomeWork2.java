package lesson3;

public class HomeWork2 {
    public static void main(String[] args) {
     HomeWork2 isPalindrome = new HomeWork2();
        boolean success = isPalindrome.isPalindrome("alal");
        System.out.println( success);
    }



  public boolean isPalindrome(String txt) {
      boolean success = false;
        System.out.println(String.format("The input string is %s", txt ));
     String result = "";
      int lastLetter = txt.length()-1;
      for(int i=lastLetter;i>=0;i--){
          result=result+txt.charAt(i);
          if(txt.equals(result)) {success=true;}
          else {success= false;

          }
      }

         return success;
        }



}









