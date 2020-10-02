import java.util.Arrays;

public class _rodCutting {

   static int t[][];

   static int rodCuttingProblem(int length[], int price[], int n, int rod) {
      for (int i = 1; i < n + 1; i++) {
         for (int j = 1; j < rod + 1; j++) {
            if (length[i - 1] <= j) {
               t[i][j] = Math.max(price[i - 1] + t[i][j - length[i - 1]], t[i - 1][j]);
            } else {
               t[i][j] = t[i - 1][j];
            }
         }
      }
      return t[n][rod];
   }

   public static void main(String[] args) {
      int rod = 8;
      int length[] = new int[rod];
      for (int i = 0; i < length.length; i++) {
         length[i] = i + 1;
      }
      int price[] = { 1, 5, 8, 9, 10, 17, 17, 20 };
      int n = length.length;
      t = new int[n + 1][rod + 1];
      System.out.println("Maximum value:");
      System.out.println(rodCuttingProblem(length, price, n, rod));
   }
}
