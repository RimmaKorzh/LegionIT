package lesson3;

public class StringMoreTimes {

    public static void main(String[] args) {

        StringMoreTimes stringMoreTimes = new StringMoreTimes();
        String result =stringMoreTimes.stringMoreTimes("Hi", 2);
        System.out.println(result);
    }

    public String stringMoreTimes(String txt, int limit) {
        String result="";
        for(int i = 1; i <= limit; i++){
            result=result+txt;
        }


       return result;

    }
}
















