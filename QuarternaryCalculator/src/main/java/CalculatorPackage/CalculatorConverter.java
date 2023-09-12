package CalculatorPackage;

public class CalculatorConverter {

    public static long CalculatorConverter(long numberOne, long numberTwo, String operator) {


        return switch (operator) {
            case "+" -> numberOne + numberTwo;
            case "-" -> numberOne - numberTwo;
            case "*" -> numberOne * numberTwo;
            case "/" -> numberOne / numberTwo;
            default -> 0;
        };




    }
}
