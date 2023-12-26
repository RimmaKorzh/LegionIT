import lesson4.ArrayListOfDays;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.*;



class DayOfWeekTest {
    ArrayListOfDays arrayListOfDays = new ArrayListOfDays();

  @ParameterizedTest
  @CsvSource({"1,Sunday", "2,Monday","3,Tuesday", "4,Wednesday","5,Thursday", "6, Friday", "7,Saturday"})

    public void returnes_happy_pathTest(int dayNumber, String dayName){


    assertEquals(dayName,arrayListOfDays.getDay(dayNumber));

    }
@Test

public void nullpointerException_when_receives_null(){

      assertThrows(NullPointerException.class,()->arrayListOfDays.getDay(null));

  }
  @Test
    public void returnsMessage_whenInputLessthanOne(){
    assertEquals("the number should be equal or larger than 1",arrayListOfDays.getDay(0));
  }
    @Test
    public void returnsMessage_whenInputMorethanSeven(){
        assertEquals("the number should be equal or smaller than 7",arrayListOfDays.getDay(8));
    }


  }



