import java.util.ArrayList;

public class Calculator {

    OutputPrinter outputPrinter;
    public Calculator(OutputPrinter outputPrinter) {
        this.outputPrinter = outputPrinter;
    }

    public int calculate(ArrayList<Integer> values, String operation) {
        int result = values.get(0);
        outputPrinter.print(String.valueOf(result));
        for (int i = 1; i < values.size(); i++) {
            int value = values.get(i);
            switch (operation) {
                case "+" -> result += value;
                case "-" -> result -=  value;
                case "*" -> result *=  value;
            }
            outputPrinter.printCalculateStep(value, operation, result);
        }
        outputPrinter.printDivider();
        return result;
    }

}
