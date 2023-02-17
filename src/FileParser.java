import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileParser {


    public ArrayList<Integer> getFileValues(String filePath) {
        try {
            ArrayList<Integer> values = new ArrayList<>();
            File myObj = new File(filePath);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String number = myReader.nextLine();
                values.add(Integer.parseInt(number));
            }
            myReader.close();
            return values;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return null;
    }

}
