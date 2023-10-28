public class MergeSort {
    public void merge(int arr[], int start, int mid, int last) {
        
        int size1 = mid-start+1;
        int size2= last - mid;

        int temparr1[] = new int[size1];
        int temparr2[] = new int[size2];

       
        for(int i=0; i<size1; i++)
            temparr1[i] = arr[start+i];
        for(int j=0; j<size2; j++) 
            temparr2[j] = arr[mid+j+1];

        int index1 = 0, index2 = 0;
        int k =start;

        while(index1<size1 && index2<size2) {
            if(temparr1[index1] <= temparr2[index2]) {
                arr[k] = temparr1[index1];
                index1++;
            }
            else {
                arr[k] = temparr2[index2];
                index2++;
            }
            k++;
        }
        while(index1 < size1) {
            arr[k] = temparr1[index1];
            index1++;
            k++;
        }
        while(index2 < size2) {
            arr[k] = temparr2[index2];
            index2++;
            k++;
        }
    }

    public void mergeSort(int arr[], int start, int last) {
        if(start < last) {
            int mid = (start + last) / 2;

            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, last);

            merge(arr, start, mid, last);
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
