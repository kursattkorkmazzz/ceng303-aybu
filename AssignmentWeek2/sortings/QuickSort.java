public class QuickSort {
    public int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low -1;

        for(int j=low; j<high; j++) {
            if(arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp; 
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;

    }
    public void quickSort(int arr[], int low, int high) {
        if(low < high) {
            int index_partition = partition(arr, low, high);

            quickSort(arr, low, index_partition-1);
            quickSort(arr, index_partition+1, high);
        }
    }

    public void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
