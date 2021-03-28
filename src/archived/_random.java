import java.util.Random;
import java.util.Scanner;

class _random {
    static Scanner sc = new Scanner(System. in);

    public static void main(String args[]) {
        int size = sc.nextInt();
        int arr[] = readArray(size);

        randomizeArray(arr);

        display(arr);
    }

    private static void randomizeArray(int arr[]) {
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length - 1);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

    private static int[] readArray(int size) {
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        return arr;

    }

    private static void display(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
