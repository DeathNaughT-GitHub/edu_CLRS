import java.util.Scanner;
class _insertionSort {
    public static void main(String[]args)throws java.lang.Exception {
        Scanner sc = new Scanner(System. in);
        int T = sc.nextInt();
        while (T-- > 0) {
            Data ins = new Data();

            ins.size = sc.nextInt();
            ins.arr = new int[ins.size];

            ins.arr[0] = sc.nextInt();
            for (int i = 1; i < ins.size; i++) {
                int element = sc.nextInt();
                int j = i - 1;
                while (j >= 0 && ins.arr[j] > element) {
                    ins.arr[j + 1] = ins.arr[j];
                    j--;
                }
                ins.arr[j + 1] = element;
            }

            display(ins.arr);
        }

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

class Data {
    int size;
    int arr[];
}