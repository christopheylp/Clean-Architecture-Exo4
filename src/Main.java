import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CommandParser commandParser = new CommandParser(args);
        String operation = commandParser.getOperationArg();
        String filePath = commandParser.getFilePathArg();

        FileParser fileParser = new FileParser();
        ArrayList<Integer> values =  fileParser.getFileValues(filePath);

        OutputPrinter outputPrinter = new OutputPrinter();
        Calculator calculator = new Calculator(outputPrinter);
        int result = calculator.calculate(values, operation);
        outputPrinter.printResult(result, operation);
    }
}
