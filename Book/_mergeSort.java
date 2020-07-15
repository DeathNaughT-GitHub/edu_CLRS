import java.util.Scanner;

class _mergeSort {

  static Scanner sc = new Scanner (System.in);

  public static void main(String args[]) {

    int size = sc.nextInt();
    int arr[] = readArray(size);

    divide(arr, 0, size - 1);

    display(arr);

    sc.close();
  }

  public static void divide(int arr[], int start, int end) {
    if (start < end) {
      int mid = (int) Math.floor((end + start) / 2);
      divide(arr, start, mid);
      divide(arr, mid + 1, end);
      merge(arr, start, mid, end);
    }
  }

  public static void merge(int arr[], int start, int mid, int end) {
    int len1 = mid - start + 1;
    int len2 = end - mid;

    int L[] = new int[len1];
    int R[] = new int[len2];

    for (int i = 0; i < len1; i++) L[i] = arr[i + start];
    for (int j = 0; j < len2; j++) R[j] = arr[j + mid + 1];

    int i = 0, j = 0, k = start;

    while (i < len1 && j < len2) {
      if (L[i] < R[j]) {
        arr[k] = L[i];
        i++;
      } else {
        arr[k] = R[j];
        j++;
      }
      k++;
    }

    while (i < len1) arr[k++] = L[i++];
    while (j < len2) arr[k++] = R[j++];
  }

  private static void display(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

    System.out.println();
  }

  private static int[] readArray(int size) {
    int arr[] = new int[size];

    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
  }
}
