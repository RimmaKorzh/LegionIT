package staticClasesEnumsExceptions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Type;

import static staticClasesEnumsExceptions.Calculator.logger;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);


    public static void main(String[] args) {

    double result = Calculator.calculate(2, 3, null);
    logger.info("result:" + result);


    result = Calculator.calculate(22, 3, Calculator.Type.SUMMARY);
    logger.info("result:" + result);


    result = Calculator.calculate(244, 3, Calculator.Type.SUBTRACTION);
    logger.info("result:" + result);

    result = Calculator.calculate(244, 3, Calculator.Type.DIVISION);
    logger.info("result:" + result);




}

}







