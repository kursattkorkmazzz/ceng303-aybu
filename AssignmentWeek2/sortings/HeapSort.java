public class HeapSort {
    
    public void heapify(int arr[], int size, int index_root){

        int largest = index_root;

        int left = 2*index_root+1;
        int right = 2*index_root+2;

        if(left<size && arr[left] > arr[largest]) largest = left;

        if(right < size && arr[right] > arr[largest]) largest = right;

        if(largest != index_root) {
            int swap = arr[index_root];
            arr[index_root] = arr[largest];
            arr[largest] = swap;
            
            heapify(arr, size, largest);
        }
    }

    public void heapSort(int arr[]) {

        int size =arr.length;

        for(int i = size/2 -1; i>=0; i--) heapify(arr, size, i);

        for(int i = size-1; i>=0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
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
