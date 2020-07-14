package Book;

import java.util.Scanner;
class _insertionSort {
    public static void main(String[]args)throws java.lang.Exception {
        Scanner sc = new Scanner(System. in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        arr[0] = sc.nextInt();
        for (int i = 1; i < size; i++) {
            int element = sc.nextInt();
            int j = i - 1;
            while (j >= 0 && arr[j] > element) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = element;
        }

        display(arr);

        sc.close();
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
}