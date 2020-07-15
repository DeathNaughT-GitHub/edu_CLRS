import java.util.Scanner;

class _insertionSort {

    static Scanner sc = new Scanner(System. in);

    public static void main(String[]args)throws java.lang.Exception {

        int size = sc.nextInt();
        int arr[] = readArray(size);

        int result[] = insertionSort(arr);

        System
            .out
            .println("Input Array:");
        display(arr);

        System
            .out
            .println("Output Array:");
        display(result);

        sc.close();
    }

    private static int[]insertionSort(int A[]) {
        int arr[] = new int[A.length];

        arr[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            int element = A[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > element) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = element;
        }

        return arr;
    }

    private static void display(int[]arr) {
        for (int i = 0; i < arr.length; i++) {
            System
                .out
                .print(arr[i] + " ");
        }

        System
            .out
            .println();
    }

    private static int[]readArray(int size) {
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
