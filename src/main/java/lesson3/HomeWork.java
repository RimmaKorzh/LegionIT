package lesson3;

public class HomeWork {
    public static void main(String[] args) {
       HomeWork compareStrings = new HomeWork();
       compareStrings.compareString( "category  " , "cat");

    }

   public void compareString(String txt1, String txt2){
      if(txt1 == null || txt2 == null || txt1.isBlank() || txt2.isBlank()){
          System.out.println("one of the Strings is null or blank");
      }
      else if(txt1.equals(txt2)){
          System.out.println("The strings are the same");
      }
      else if(txt1.contains(txt2)){
          System.out.println(txt2 + "  is a part of  " + txt1);
      }
      else if(txt2.contains((txt1))){
           System.out.println(txt2 + " is a part of " + txt1);
       }

      else{
          System.out.println("Cannot compare Strings");
}

      }


   }



