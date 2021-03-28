import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class _bucketSort {

    static Scanner sc = new Scanner (System.in);
    static int maxVal = Integer.MIN_VALUE;

    public static void main(String[] args) {
        int size = sc.nextInt();
        int arr[] = readArray(size);

        bucketSort(arr);
        printArray(arr);

    }

    private static void bucketSort(int[] arr) {
        int len = (int)Math.sqrt(arr.length);
        List<Integer>[] buckets = new List[len];

        for (int i = 0; i < len; i++) {
            buckets[i] = new ArrayList<Integer>();
        }

        for (int i:arr) {
            buckets[getIndex(i, len)].add(i);
        }

        for (List bucket: buckets) {
            Collections.sort(bucket);
        }

        int index = 0;
        for (int i = 0; i < buckets.length; i++) {
            for (int val: buckets[i]) {
                arr[index++] = val;
            }
        }
    }

    private static int getIndex(int i, int len) {
        return (int)((double)i / maxVal * (len - 1));
    }

    private static int[]readArray(int size) {
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            maxVal = Math.max(maxVal, arr[i]);
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