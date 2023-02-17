import java.util.Scanner;

public class CommandParser {
    String[] args;

    public CommandParser(String[] args) {
        this.args = args;
    }

    public String getOperationArg() {
        if (args.length > 1) {
            return args[1];
        }
        return "";
    }

    public String getFilePathArg() {
        if (args.length > 0) {
            return args[0];
        }
        return "";
    }
}
