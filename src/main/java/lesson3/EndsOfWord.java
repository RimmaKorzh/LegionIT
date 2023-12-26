package lesson3;

public class EndsOfWord {
    public static void main(String[] args) {
  EndsOfWord endsOfWord=new EndsOfWord();
  boolean success= endsOfWord.endsOfWord("dude");
        System.out.println(""+success);
    }
public boolean endsOfWord(String txt){
       boolean success=true;
       if(txt.endsWith("s")){
        System.out.println(txt);
       }
    else{
        success=false;
           System.out.println(txt);
       }
    return success;
}
}

