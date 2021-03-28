import java.util.Scanner;

class _radixSort {

    static Scanner sc = new Scanner (System.in);
    static int maxDigits = 0;

    public static void main(String[] args) {
        
        int size = sc.nextInt();
        int arr[] = readArray(size);

        radixSort(arr);
        printArray(arr);

    }

    private static void radixSort(int arr[]) {

        for (int i = 0; i <= maxDigits; i++) {
            countSort(arr, (int)Math.pow(10, i));
        }

    }

    private static void countSort(int[] arr, int n) {

        int count[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            count[(arr[i] / n) % 10]++;
        }

        /** Storing the indices of various entries in order **/
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        int out[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            out[count[(arr[i] / n) % 10] - 1] = arr[i];
            count[(arr[i] / n) % 10]--;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = out[i];
        }

    }

    private static int[]readArray(int size) {
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            maxDigits = Math.max(maxDigits, (int)Math.floor(Math.log10(arr[i]) + 1));
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