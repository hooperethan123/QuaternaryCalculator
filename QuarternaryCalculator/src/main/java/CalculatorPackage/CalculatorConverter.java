package CalculatorPackage;

public class CalculatorConverter {

    public static long CalculatorConverter(long numberOne, long numberTwo, String operator) {


        switch(operator) {
            case "+": return numberOne + numberTwo;
            case "-": return numberOne - numberTwo;
            case "*": return numberOne * numberTwo;
            case "/": return numberOne / numberTwo;

            default: return 0;
        }




    }
}
