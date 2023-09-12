import CalculatorPackage.CalculatorConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorConverterTest {

    @Test
    public void testRandomAddition(){
        String ResultOne = CalculatorConverter.CalculatorConverter(3, 3, "+");
        String ResultTwo = CalculatorConverter.CalculatorConverter(6, 1, "+");
        String ResultThree = CalculatorConverter.CalculatorConverter(20, 8, "+");
        String ResultFour = CalculatorConverter.CalculatorConverter(4, 4, "+");

        Assertions.assertEquals(ResultOne, "12");
        Assertions.assertEquals(ResultTwo, "13");
        Assertions.assertEquals(ResultThree, "130");
        Assertions.assertEquals(ResultFour, "20");
    }

    @Test
    public void testRandomSubtraction(){
        String ResultOne = CalculatorConverter.CalculatorConverter(3, 1, "-");
        String ResultTwo = CalculatorConverter.CalculatorConverter(3, 4, "-");
        String ResultThree = CalculatorConverter.CalculatorConverter(7, 2, "-");
        String ResultFour = CalculatorConverter.CalculatorConverter(20, 5, "-");

        Assertions.assertEquals(ResultOne, "2");
        Assertions.assertEquals(ResultTwo, "-1");
        Assertions.assertEquals(ResultThree, "11");
        Assertions.assertEquals(ResultFour, "33");
    }
    @Test
    public void testRandomMultiplication(){
        String ResultOne = CalculatorConverter.CalculatorConverter(3, 3, "*");
        String ResultTwo = CalculatorConverter.CalculatorConverter(3, 5, "*");
        String ResultThree = CalculatorConverter.CalculatorConverter(7, 1, "*");
        String ResultFour = CalculatorConverter.CalculatorConverter(20, 5, "*");

        Assertions.assertEquals(ResultOne, "21");
        Assertions.assertEquals(ResultTwo, "33");
        Assertions.assertEquals(ResultThree, "13");
        Assertions.assertEquals(ResultFour, "1210");
    }

    @Test
    public void testRandomDivision(){
        String ResultOne = CalculatorConverter.CalculatorConverter(3, 3, "/");
        String ResultTwo = CalculatorConverter.CalculatorConverter(21,7, "/");
        String ResultThree = CalculatorConverter.CalculatorConverter(35, 5, "/");
        String ResultFour = CalculatorConverter.CalculatorConverter(2, 3, "/");

        Assertions.assertEquals(ResultOne, "1");
        Assertions.assertEquals(ResultTwo, "3");
        Assertions.assertEquals(ResultThree, "13");
        Assertions.assertEquals(ResultFour, "0");
    }

}



