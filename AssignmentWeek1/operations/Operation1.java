package operations;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;
import java.util.Optional;
import java.util.Scanner;

public class Operation1 {
    private final String filename;
    private int[] numberList;

    private LocalTime start;
    private LocalTime stop;

    //Initialize the required variables.
    public Operation1(String filename, int numberCount) {
        this.filename = filename;
        numberList = new int[numberCount];
    }
    // Does all operations and add the result to log variable.
    public void printStatus(int index1, int index2){

        // Creating array with specified size.
        if(!fillArray()){
            return;
        }
        System.out.println("1a) The integer array structure is built in "+getMilliseconds()+" milliseconds.");

        // Adding element at first index.
        insertAddFirst(9999);
        System.out.println("1b) An integer is inserted into the first index of the integer array in "+getMilliseconds()+" milliseconds.");

        // Adding element at last index.
        insertAddLast(8888);
        System.out.println("1c) An integer is inserted into the last index of the integer array in "+getMilliseconds()+" milliseconds.");

        // Reading element at index1.
        Optional<Integer> readData = getAtIndex(index1);
        if(readData.isEmpty()){
            return;
        }
        System.out.println("1d) An integer, which is “"+readData.get().toString()+"”, is read from the index "+index1+" of the integer \n" +
                "array in "+getMilliseconds()+" milliseconds.");

        // Reading element at index2.
        readData = getAtIndex(index2);
        if(readData.isEmpty()){
            return;
        }
        System.out.println("1e) An integer, which is “"+readData.get().toString()+"”, is read from the index "+index2+" of the integer \n" +
                "array in "+getMilliseconds()+" milliseconds.");

    }

    // Calculates between start and stop LocalTime and returns data in terms of millisecond.
    private long getMilliseconds(){
        return this.start.until(this.stop,ChronoUnit.MILLIS);
    }

    // Creates new array with length + 1, adds new element to first index and fills rest with value of old array.
    private void insertAddFirst(int number){
        this.start = LocalTime.now();
        int[] tempArray = new int[numberList.length + 1];
        tempArray[0] = number;
        for(int i = 0; i < numberList.length; i++){
            tempArray[i + 1] = numberList[i];
        }
        numberList = tempArray;
        this.stop = LocalTime.now();
    }

    // Adds element to last index.
    private void insertAddLast(int number){
        this.start = LocalTime.now();
        numberList[numberList.length - 1] = number;
        this.stop = LocalTime.now();
    }

    // Get element from specified index.
    private Optional<Integer> getAtIndex(int index){
        if(index < numberList.length && index >= 0){
            this.start = LocalTime.now();
            int data = numberList[index];
            this.stop = LocalTime.now();
            return  Optional.of(data);
        }
        return Optional.empty();
    }

    // Reads all numbers from file and fill it to numberList array.
    private boolean fillArray(){
        try{
            File file = new File(this.filename);
            Scanner reader = new Scanner(file);
            int counter = 0;
            this.start = LocalTime.now();
            while (reader.hasNextInt() && counter < numberList.length){
                numberList[counter++] = reader.nextInt();
            }
            this.stop = LocalTime.now();
            return  true;
        }catch (FileNotFoundException fne){
            System.out.println("[fillArray] " + fne.getMessage());
        }
        return false;
    }
}