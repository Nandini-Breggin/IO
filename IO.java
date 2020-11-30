import java.util.Scanner;
import java.io.*; //import everything from java.io


public class IO {

    // Exception -> IOException
    // throws -> some other code handles it, not my problem
    public static void main(String[] args) throws IOException, FileNotFoundException {
        System.out.println("Input/Output Example");

        File file;
        Scanner scan;


        // try/catch/finally -> we manage it ourselves
        try {
            file = new File("data.csv");
            // code has to match up to what the data is
            scan = new Scanner(file);

            while (scan.hasNext()) {
                // while there are words left to read in data.csv
                
                String letter = scan.next();
                System.out.println("The next letter is " + letter);
            }

            // scan.hasNextINT -> for numbers 
            // scan.hasNextLine -> for lines at a time
            // scan.hasNext -> for one string (word) at a time

            

        } catch (FileNotFoundException e) {
            // System.out.println("Error: The file doesn't exist");
            e.printStackTrace(); // error message that happens by default


        } finally { // runs code no matter what
            System.out.println("Done");
        }

        // System.exit(0); // quit the program


    }
}