package lesson3;

public class fizzBizz {
    public static void main(String[] args) {
        fizzBizz fizzBizz = new fizzBizz();
        String result = fizzBizz.fizzBizz("fob");
        System.out.println(result);

    }

    public  String fizzBizz (String text) {
        String result= "";

        if (text.startsWith("f") && text.endsWith("b")) {
            result="FizzBuzz";

        }
        else if (text.startsWith("f")) {
            result="Fizz";
        }
        else if (text.endsWith("b")) {
            result="Buzz";
        }

        else {
            result="unchanged";
        }

        return result;
    }
}



