import java.util.Scanner;

class _countingSort {

    static Scanner sc = new Scanner(System. in);
    static int maxVal = 0;

    public static void main(String[]args) {

        int size = sc.nextInt();
        int arr[] = readArray(size);

        countSort(arr);
        printArray(arr);

    }

    private static void countSort(int[]arr) {

        int countArray[] = getCountArray(arr);
        int index = 0;

        for (int i = 0; i <= maxVal; i++) {
            if (countArray[i] != 0) {
                while (countArray[i] > 0) {
                    arr[index++] = i;
                    countArray[i]--;
                }
            }
        }
    }

    private static int[] getCountArray(int[]arr) {
        int countArray[] = new int[maxVal + 1];

        for (int i = 0; i < arr.length; i++) 
            countArray[arr[i]]++;
        
        return countArray;

    }

    private static int[] readArray(int size) {
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            maxVal = Math.max(arr[i], maxVal);
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