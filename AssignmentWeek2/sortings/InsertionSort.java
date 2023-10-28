public class InsertionSort {
    
    public void insertionSort(int arr[]) {
        int size = arr.length;

        for(int i=1; i<size; i++) {
            int temp = arr[i];
            int index = i - 1; 

            while(index >= 0 && arr[index] >= temp) {
                arr[index+1] = arr[index];
                index--; 
            }
            arr[index+1] = temp;
        } 
    }
    public void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    } 
  

}
