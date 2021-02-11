import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadCSV {

    /*
    * Author: Eranda Upeshitha
    * Last modified: 2021/02/11 */
    /*This class is defined for testing how to read CSV file*/

    public static void main(String[] args) {

        readCSVUsingScanner("E:\\User\\Downloads\\Employee - Sheet1.csv");
    }

    private static void readCSVUsingScanner (String filePath){
        /*
        * This method use string method to read CSV file
        */

        try {
            Scanner scanner = new Scanner(new File(filePath));

            while (scanner.hasNext()){
                System.out.println("User data: " + scanner.next().toString());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
