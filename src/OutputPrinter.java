public class OutputPrinter {

    public void print(String message) {
        System.out.println(message);
    }
    public void printResult(int result, String operation) {
        System.out.println("total =" + result + " " + operationToStringCharacters(operation));
    }

    public String operationToStringCharacters(String operation) {
        switch (operation) {
            case "+" -> {
                return "(addition)" ;
            }
            case "-" -> {
                return "(soustraction)" ;
            }
            case "*" -> {
                return "(multiplication)" ;
            }
            default -> {
                return "(Unknown)";
            }
        }
    }

    public void printDivider() {
        System.out.println("-------");
    }

    public void printCalculateStep(int value, String operation, int result) {
        System.out.println(operation + value + " (=" + result+ ")");
    }

}
