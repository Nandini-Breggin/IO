#  Input/Output

## Running

```bash
$ javac IO.java
$ java IO
```

// extension to import the file in the same folder

File file = new File("data.cvs");
        
// Exception handled
Scanner scan = new Scanner(file);
// read from data.cvs file





            // String[] letters = scan.nextLine().split(",");
            // splits the line where the commas are
            // A,B,C,D,E
            // System.out.println(letters[0]);
            // print letters at spot 0

            // // for each loop
            // for (String letter : letters) {
            //     // for each string in letters, grab one thing at a time
            //     System.out.println(letter);
            // }

            // // standard for loop -> changeable
            // for (int i=0; i < letters.length; i++) {
            //     System.out.println(letters[i]);
            // }



            // while (scan.hasNextLine()) {
            //     // while there are words left to read in data.csv
                
            //     String letter = scan.nextLine();
            //     System.out.println("The next letter is " + letter);
            // }

            // follows structure of the data in the right format
                // String letter = scan.nextLine();
                // int num = scan.nextInt();
                // String word = scan.next();

                // System.out.println(letter);
                // System.out.println(num);
                // System.out.println(word);

            // scan.hasNextInt -> for numbers 
            // scan.hasNextLine -> for lines at a time
            // scan.hasNext -> for one string (word) at a time