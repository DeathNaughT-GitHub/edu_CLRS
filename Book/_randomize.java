import java.util.*;

class _randomize {

  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    int size = sc.nextInt();

    int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    permuteBySorting(arr);
    display(arr);



  }

  private static void permuteBySorting(int arr[]) {

    

  }

  private static void display(int[] arr) {

    for (int i = 0; i < arr.length; i++) {

      System.out.print(arr[i] + " ");

    }

    System.out.println();

  }
  
}
