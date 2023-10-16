import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Operation3 {
	private String filename;
	private long start;
	private long stop;
	private long time;
	private int index1;
	private int index2;
	DynamicArray dy = new DynamicArray();
	//Constructor for the DynamicArray with index1 and index2.
	public Operation3(String filename, int index1, int index2) {
		this.filename = filename;
		this.index1 = index1;
		this.index2 = index2;
		readFromFile();
	}
	
	//Second constructor for just index1.
	public Operation3(String filename, int index1) {
		this.filename = filename;
		this.index1 = index1;
		
	}
	
	public boolean readFromFile(){
		try {
			
			File file = new File(this.filename);
			Scanner reader = new Scanner(file);
			while(reader.hasNext()) {
			dy.addItem(reader.nextInt());	
			}
			
			return true;
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		
		return false;
	}
	
	public void printStatus() {
		this.start = System.currentTimeMillis();
		readFromFile();
		this.stop = System.currentTimeMillis();
		this.time = this.stop - this.start;
		System.out.println("3a) The integer dynamic array is built in "+time+" milliseconds.");
		
		this.start = System.currentTimeMillis();
		dy.insertFirst(355);
		this.stop = System.currentTimeMillis();
		this.time = this.stop - this.start;
		System.out.println("3b) An integer is inserted into the first index of the integer array in "+time+" milliseconds.");
		
		this.start = System.currentTimeMillis();
		dy.insertLast(9910);
		this.stop = System.currentTimeMillis();
		this.time = this.stop - this.start;
		System.out.println("3c) An integer is inserted into the last index of the integer array in "+time+" milliseconds.");
		
		this.start = System.currentTimeMillis();
		int item = dy.readIntFromIndex(index1);
		this.stop = System.currentTimeMillis();
		this.time = this.stop - this.start;
		System.out.println("3d) An integer, which is “"+item+"”, is read from the index "+index1+" of the integer \n" +
                "array in "+time+" milliseconds.");
		
		if(index2 != 0) {
			this.start = System.currentTimeMillis();
			int item2 = dy.readIntFromIndex(index2);
			this.stop = System.currentTimeMillis();
			this.time = this.stop - this.start;
			System.out.println("3e) An integer, which is “"+item2+"”, is read from the index "+index2+" of the integer \n" +
	                "array in "+time+" milliseconds.");
		}	
		
		for(int i=0; i<1000; i++) {
			System.out.println(dy.readIntFromIndex(i));
		}
	}

}