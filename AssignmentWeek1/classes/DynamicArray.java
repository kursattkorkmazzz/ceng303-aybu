package classes;
public class DynamicArray {
private int arr[];
private int counter;
private int arraysize;

//Constructor for the DynamicArray
public DynamicArray() {
	
	arr = new int[1];
	arraysize =1;
	counter = 0;
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
}
