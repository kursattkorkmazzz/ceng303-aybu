import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Operation3 {
	private int arr[];
	private int counter;
	private int arraysize;
	private String filename;
	private long start;
	private long stop;
	private long time;
	private int index1;
	private int index2;
	
	//Constructor for the DynamicArray with index1 and index2.
	public Operation3(String filename, int index1, int index2) {
		this.filename = filename;
		arr = new int[1];
		arraysize =1;
		counter = 0;
		this.index1 = index1;
		this.index2 = index2;
		
	}
	
	//Second constructor for just index1.
	public Operation3(String filename, int index1) {
		this.filename = filename;
		arr = new int[1];
		arraysize =1;
		counter = 0;
		this.index1 = index1;
		
	}
	
	public boolean readFromFile(){
		try {
			
			File file = new File(this.filename);
			Scanner reader = new Scanner(file);
			while(reader.hasNext()) {
			addItem(reader.nextInt());	
			}
			
			return true;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	// If we do not have enough size this method doubling size
	public void growSize() {
		int temp[] = null;
		temp = new int[arraysize * 2];
		
		for(int i=0; i<arraysize; i++) temp[i] = arr[i];
		
		arr = temp;
		arraysize *= 2;
	}
	
	//This method is used for adding item to dynamic array 
	public void addItem(int item) {
		if(counter == arraysize) growSize();
		
		arr[counter] = item;
		counter++;
	}

	//This method is used for adding item to first index
	public void insertFirst(int item) {
		if(counter == arraysize) growSize();
		
		for(int i = counter; 0<i; i--) arr[i] = arr[i-1];
		arr[0] = item;
		counter++;
	}
	
	//This method is used for adding item to last index
	public void insertLast(int item) {
			if(counter == arraysize) growSize();
		
			arr[counter] = item;
			counter++;
	}
	
	//This method is used for reading an item from index
	public int readIntFromIndex(int index) {
		return arr[index];
	}
	public void printStatus() {
		this.start = System.currentTimeMillis();
		readFromFile();
		this.stop = System.currentTimeMillis();
		this.time = this.stop - this.start;
		System.out.println("3a) The integer dynamic array is built in "+time+" milliseconds.");
		
		this.start = System.currentTimeMillis();
		insertFirst(355);
		this.stop = System.currentTimeMillis();
		this.time = this.stop - this.start;
		System.out.println("3b) An integer is inserted into the first index of the integer array in "+time+" milliseconds.");
		
		this.start = System.currentTimeMillis();
		insertLast(9910);
		this.stop = System.currentTimeMillis();
		this.time = this.stop - this.start;
		System.out.println("3c) An integer is inserted into the last index of the integer array in "+time+" milliseconds.");
		
		this.start = System.currentTimeMillis();
		int item = readIntFromIndex(index1);
		this.stop = System.currentTimeMillis();
		this.time = this.stop - this.start;
		System.out.println("3d) An integer, which is “"+item+"”, is read from the index "+index1+" of the integer \n" +
                "array in "+time+" milliseconds.");
		
		if(index2 != 0) {
			this.start = System.currentTimeMillis();
			int item2 = readIntFromIndex(index2);
			this.stop = System.currentTimeMillis();
			this.time = this.stop - this.start;
			System.out.println("3e) An integer, which is “"+item2+"”, is read from the index "+index2+" of the integer \n" +
	                "array in "+time+" milliseconds.");
		}
		
	}
	
	public static void main(String[] args) {
		Operation3 op3_1 = new Operation3("1Mint.txt", 900000,9);
		Operation3 op3_2 = new Operation3("50Mint.txt", 45000000);
		boolean check  = op3_1.readFromFile();
		op3_1.printStatus();
		System.out.println("*****************************************");
		boolean check2  = op3_2.readFromFile();
		op3_2.printStatus();
	}
	
}
