import java.util.Scanner;

class _quickSort {

    static Scanner sc = new Scanner(System. in);

    public static void main(String[]args) {
        int size = sc.nextInt();
        int arr[] = readArray(size);

        quickSort(arr, 0, size - 1);
        printArray(arr);

        sc.close();
    }

    private static void quickSort(int arr[], int p, int r) {
        if (p < r) {
            int q = partition(arr, p, r);
            quickSort(arr, p, q - 1);
            quickSort(arr, q + 1, r);
        }
    }

    public static int partition(int arr[], int p, int r) {
        int x = arr[r];
        int i = p - 1;

        for (int j = p; j <= r - 1; j++) {
            if (arr[j] <= x) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        int temp = arr[i + 1];
        arr[i + 1] = arr[r];
        arr[r] = temp;

        return i + 1;

    }

    private static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    private static int[]readArray(int size) {
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        return arr;
    }

}