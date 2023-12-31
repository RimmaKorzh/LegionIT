import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import staticClasesEnumsExceptions.Calculator;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {

   @BeforeAll
   public static void classSetUp(){
       System.out.println("Before all methods");
   }


   @AfterAll
   public static void classTearDown(){
       System.out.println("After all methods");
   }

   @BeforeEach
   public void beforeTest(){
       System.out.println("before each method");
   }

   @AfterEach
   public void afterEach(){
       System.out.println("after each method");
   }

 static Stream<Arguments> dataProvider(){
       return Stream.of(
               Arguments.of(2, 2, 4, Calculator.Type.SUMMARY),
               Arguments.of(4, 2, 2, Calculator.Type.DIVISION),
               Arguments.of(2, 2, 4, Calculator.Type.MULTIPLICATION),
               Arguments.of(5, 2, 3, Calculator.Type.SUBTRACTION)

       );
 }
 @ParameterizedTest
 @MethodSource("dataProvider")
 public void methodSourceTest( double a, double b, double expectedResult, Calculator.Type type){
       double actualResult = Calculator.calculate((int) a, (int) b, type);
       assertEquals(expectedResult, actualResult);

 }




@ParameterizedTest
@ValueSource(ints = {-10, 0, 27, 87328732, -87328732})
public void summaryParamsTest(int a){
    double b=6;
    double expectedResult = b + a;
    double actualResult = Calculator.calculate((int) a, (int) b, Calculator.Type.SUMMARY);
    assertEquals(expectedResult, actualResult, "Summary result is incorrect");
}
@ParameterizedTest
@EnumSource(Calculator.Type.class)
public void calculationTypesTest(Calculator.Type type){
    double a=25;
    double b=6;

    double actualResult = Calculator.calculate((int) a, (int) b, type);
    assertNotNull(actualResult);
    assertTrue(actualResult>0);
}



  @Test
  public void summarytest(){
      double a=5;
      double b=6;
      double expectedResult = 11;

      double actualResult = Calculator.calculate((int) a, (int) b, Calculator.Type.SUMMARY);
      assertEquals(expectedResult, actualResult, "Summary result is incorrect");
  }

  @Test
    public void divisionTest(){
      double a=10;
      double b=2;
      double expectedResult = 5;

      double actualResult = Calculator.calculate((int) a, (int) b, Calculator.Type.DIVISION);
//      assertNull(actualResult);
     assertNotNull(actualResult, "null was returned");
      assertEquals(expectedResult, actualResult, "division result is incorrect");
      assertTrue(actualResult>0);
      assertFalse(actualResult==0);

  }
  @Test
  @DisplayName("Nullpointer Exeption test")
    public void errorTest(){
      double a=10;
      double b=20;
      double expectedResult = 5;

    assertThrows(NullPointerException.class,() ->Calculator.calculate((int) a, (int) b, null));





  }
  @ParameterizedTest
    @CsvSource({"2, 2, 4, SUMMARY", "4, 2, 2, DIVISION" })
    public void csvParamsTest( double a, double b, double expectedResult, Calculator.Type type){
        double actualResult = Calculator.calculate((int) a, (int) b, type);
        assertEquals(expectedResult, actualResult);

    }



}
