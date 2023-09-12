package CalculatorPackage;

public class CalculatorConverter {

    public static String CalculatorConverter(Integer numberOne, Integer numberTwo, String operator) {

        int DecimalResult = 0;

        switch (operator) {
            case "+" -> DecimalResult = numberOne + numberTwo;
            case "-" -> DecimalResult = numberOne - numberTwo;
            case "*" -> DecimalResult = numberOne * numberTwo;
            case "/" -> DecimalResult = numberOne / numberTwo;
            default -> {
            }
        }

        return Integer.toString(DecimalResult, 4);

    }
}
