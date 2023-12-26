package homeWorkM7;

import java.util.ArrayList;
import java.util.List;

public class SelfTraining {
    public static void checkTyping(String[] userTyped, String[] correctlyArray) {
      List<Integer> result = new ArrayList<>();
        for (int i = 0; i < userTyped.length && i < correctlyArray.length; i++) {
            if (userTyped[i].equals(correctlyArray[i])) {
                result.add(1);

            } else {
                result.add(-1);
            }

        }
        String game = result.toString();
        game=game.concat("dog");
        System.out.println(result);
        System.out.println(game);
    }

  public static  String nameShuffle(String fullName){
      String[] names = fullName.split(" ");
      if (names.length ==2){
          String firstName = names[0];
          String lastName = names[names.length-1];
          return lastName + " " +firstName;
      } else{
          return fullName;
      }

  }

//    public static void main(String[] args) {
//        System.out.println(nameShuffle("Donald Trump"));
//        System.out.println(nameShuffle("Donald Trump Junior"));
//    }



    public boolean doubleLetter(String txt) {
        boolean result = false;
        for (int i = 0; i <= txt.length() - 2; i++) {
            if (txt.charAt(i) == txt.charAt(i + 1)) {
                return true;

            }
        }
        return result;
    }
   public int[] counterLetter(String txt){
       int[] scores = new int[3];
      for( char type : txt.toCharArray()) {
          switch (type){
              case 'a':
                  scores[0]++;
                  break;
              case 'b':
                  scores[1]++;
                  break;
              case  'c':
                  scores[2]++;
                  break;
          }
      }
     return scores;

}


}











