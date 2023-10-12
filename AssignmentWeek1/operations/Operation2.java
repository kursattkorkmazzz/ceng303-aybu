package operations;
import classes.LinkedList;
import java.io.*;
import java.time.LocalTime;

public class Operation2 {
    private final String fileName;

    // Constructor for Operation2
    public Operation2(String fileName) {
        this.fileName = fileName;
    }

    LinkedList myList = new LinkedList();

    // Does all operations and prints the outputs
    public void PrintStatus() throws IOException {

        // Builds the list and calculates the time
        LocalTime startTime = LocalTime.now();
        buildList(myList, fileName);
        LocalTime endTime = LocalTime.now();
        long timeToBuildList = calculateElapsedTime(startTime, endTime);

        System.out.println("2a) The integer list structure is built in " + timeToBuildList + " milliseconds.");

        // Inserts an integer into the head and calculates the time
        startTime = LocalTime.now();
        myList.insertFirst(99);
        endTime = LocalTime.now();
        long timeToInsertHead = calculateElapsedTime(startTime, endTime);

        System.out.println("2b) An integer is inserted into the first index of the integer list in " + timeToInsertHead + " milliseconds.");

        // recognises the file
        int index = findIndex(fileName);

        // Inserts an integer into the essential index and calculates the time
        startTime = LocalTime.now();
        myList.insertAt(11, index);
        endTime = LocalTime.now();
        long timeToInsertBigIndex = calculateElapsedTime(startTime, endTime);

        System.out.println("2c) An integer is inserted into the last index of the integer list in " + timeToInsertBigIndex + " milliseconds.");

        // Reads the integer from the essential index and calculates the time
        startTime = LocalTime.now();
        int valueAtBigIndex = myList.getAt(index);
        endTime = LocalTime.now();
        long timeToReadBigIndex = calculateElapsedTime(startTime, endTime);
        System.out.println("2d) An integer, which is " + valueAtBigIndex + ", is read from the index " + index + " of the integer list in " + timeToReadBigIndex + " milliseconds.");

        // Reads the integer from index 9 and calculates the time
        startTime = LocalTime.now();
        int valueAtIndex9 = myList.getAt(9);
        endTime = LocalTime.now();
        long readIndex9 = calculateElapsedTime(startTime, endTime);

        System.out.println("2e) An integer, which is " + valueAtIndex9 + ", is read from the index 9 of the integer list in " + readIndex9 + " milliseconds.");
    }


    // Builds an integer list that stores integers hold in files
    public void buildList(LinkedList myList, String fileName) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line;
        while (true) {
            if (!((line = bufferedReader.readLine()) != null)) break;
            int value = Integer.parseInt(line);
            myList.insertLast(value);
        }
    }

    // Method for calculating the elapsed time when needed
    public static long calculateElapsedTime(LocalTime startTime, LocalTime endTime) {
        return java.time.Duration.between(startTime, endTime).toMillis();
    }


    // Method for finding the proper index according to the filename
    public int findIndex(String file) {
        if (file.equals("1Mint.txt")) {
            return 900000;
        } else if (file.equals("50Mint.txt")) {
            return 45000000;
        } else {
            return -1;
        }
    }
}