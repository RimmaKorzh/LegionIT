package  staticClasesEnumsExceptions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public  class Calculator {

//    public static final int MULTIPLICATION = 1;
//    public static final int SUMMARY = 2;
//    public static final int DIVISION = 3;
//    public static final int SUBTRACTION = 4;

//enum final constants

    static  final Logger logger = LogManager.getLogger(Calculator.class);

    public enum Type{
        MULTIPLICATION,
        DIVISION,
        SUMMARY,
        SUBTRACTION
    }


    public static double calculate(int a,int b, Type type){
logger.info("Running method calculate");
        double result=0;
//        if(type==MULTIPLICATION){
//
//        return a*b;
//    }
//        else if (type == SUMMARY) {
//            return a + b;

//        }
        // do with switch case
try {
    switch (type) {
        case MULTIPLICATION -> {
            result = a * b;
            break;
        }
        case SUMMARY -> {
            result = a + b;
            break;
        }
        case DIVISION -> {
            result = (double) a / b;
            break;
        }
        case SUBTRACTION -> {
            result = a - b;
            break;
        }
        default -> {
            result = -1;
        }
    }
}
catch (Exception err){
    logger.info("Something bad happened", err);
    throw err;
}
//finally {
//    System.out.println("finally block");
//    result = -1;
//}



    return result;
    }

}
