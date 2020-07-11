import java.util.*;
public class Array {
    int size;
    int arr[];

    Array() {
        this.size = 0;
        arr = new int[size];
    }

    Array(int size) {
        Scanner sc = new Scanner (System.in);
        this.size = size;
        arr = new int[size];    
        sc.close();
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}