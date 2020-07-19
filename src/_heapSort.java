import java.util.Scanner;

class _heapSort {
    static Scanner sc = new Scanner(System. in);
    static int heapSize;

    public static void main(String args[]) {

        int size = sc.nextInt();
        int arr[] = readArray(size);

        System.out.println("Input Array");
        printArray(arr);

        heapSort(arr);

        System.out.println("Output Array");
        printArray(arr);

    }

    private static void maxHeapify(int arr[], int index) {
        int l = index * 2;
        int r = 1 + l;
        int largest = index;

        if (l < heapSize && arr[l] > arr[index]) 
            largest = l;
            
        else if (r < heapSize && arr[r] > arr[index]) 
            largest = r;
        
        if (largest != index) {
            int temp = arr[index];
            arr[index] = arr[largest];
            arr[largest] = temp;
            maxHeapify(arr, largest);
        }

    }

    private static void buildMaxHeap(int arr[]) {

        heapSize = arr.length;
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            maxHeapify(arr, i);
        }

    }

    private static void heapSort(int arr[]) {

        buildMaxHeap(arr);

        for (int i = arr.length - 1; i >= 1; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            heapSize--;
            maxHeapify(arr, 0);
        }

    }

    private static int[] readArray(int size) {
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        return arr;

    }

    private static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}