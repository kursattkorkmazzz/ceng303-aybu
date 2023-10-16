package operations;
import classes.LinkedList;
import java.io.*;
import java.time.LocalTime;

public class Operation2 {
    private final String fileName;
    private Long startTime;
    private Long endTime;
    // Constructor for Operation2
    public Operation2(String fileName) {
        this.fileName = fileName;
    }

    LinkedList myList = new LinkedList();

    // Does all operations and prints the outputs
    public void printStatus() throws IOException {

        // Builds the list and calculates the time
        startTime = System.currentTimeMillis();
        buildList(myList, fileName);
        endTime = System.currentTimeMillis();

        System.out.println("2a) The integer list structure is built in " + calculateTime() + " milliseconds.");

        // Inserts an integer into the head and calculates the time
        startTime = System.currentTimeMillis();
        myList.insertFirst(99);
        endTime = System.currentTimeMillis();


        System.out.println("2b) An integer is inserted into the first index of the integer list in " + calculateTime() + " milliseconds.");

        // recognises the file
        int index = findIndex(fileName);

        // Inserts an integer into the essential index and calculates the time
        startTime = System.currentTimeMillis();
        myList.insertLast(11);
        endTime = System.currentTimeMillis();

        System.out.println("2c) An integer is inserted into the last index of the integer list in " + calculateTime() + " milliseconds.");

        // Reads the integer from the essential index and calculates the time
        startTime = System.currentTimeMillis();
        int valueAtBigIndex = myList.getAt(index);
        endTime = System.currentTimeMillis();

        System.out.println("2d) An integer, which is " + valueAtBigIndex + ", is read from the index " + index + " of the integer list in " + calculateTime() + " milliseconds.");

        // Reads the integer from index 9 and calculates the time
        startTime = System.currentTimeMillis();
        int valueAtIndex9 = myList.getAt(9);
        endTime = System.currentTimeMillis();

        System.out.println("2e) An integer, which is " + valueAtIndex9 + ", is read from the index 9 of the integer list in " + calculateTime() + " milliseconds.");
    }


    // Builds an integer list that stores integers hold in files
    public void buildList(LinkedList myList, String fileName) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));

        String line;
        int counter = 0;
        while (true) {
            if (((line = bufferedReader.readLine()) == null)) break;

            int value = Integer.parseInt(line);

            myList.insertLast(value);
            counter++;
        }

    }

    private long calculateTime(){
        return endTime - startTime;
    }


    // Method for finding the proper index according to the filename
    public int findIndex(String file) {
        if (file.contains("1Mint.txt")) {
            return 900000;
        } else if (file.contains("50Mint.txt")) {
            return 45000000;
        } else {
            return -1;
        }
    }
}
