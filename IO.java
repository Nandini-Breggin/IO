import java.util.Scanner;
import java.io.*; //import everything from java.io


public class IO {

    // Exception -> IOException
    // throws -> some other code handles it, not my problem
    // throws IOException, FileNotFoundException
    public static void main(String[] args) throws IOException {
       
        System.out.println("Input/Output Example");

        PrintWriter output = new PrintWriter("output.md");

        output.println("My new data");

        

        Dog dog = new Dog("Spot", "Terrier", 10);
        output.println(dog);

        output.close(); // MUST CLOSE THE FILE closes the file

        // File file;
        // Scanner scan;


        // // try/catch/finally -> we manage it ourselves
        // try {
        //     file = new File("data.csv");
        //     // code has to match up to what the data is
        //     scan = new Scanner(file);


        //     while (scan.hasNextLine()) {
        //         String[] parameters = scan.nextLine().split(",");

        //         Dog dog = new Dog(parameters);

        //         System.out.println(dog);
        //     }



        // } catch (FileNotFoundException e) {
        //     e.printStackTrace(); // error message that happens by default
        // } finally { // runs code no matter what
        //     System.out.println("Done");
        // }
        // System.exit(0); // quit the program


    }
}