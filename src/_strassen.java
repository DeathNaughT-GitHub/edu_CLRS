import java.util.Scanner;

class _strassen {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    int n = sc.nextInt();
    int A[][] = readMatrix(n, n);
    int B[][] = readMatrix(n, n);
    int C[][] = Strassen(A, B);

    displayMatrix(C);

  }

  private static int[][] Strassen(int A[][], int B[][]) {

    int size = A.length;
    int C[][] = new int[size][size];

    if (size == 1) {
      C[0][0] = A[0][0] * B[0][0];
      return C;
    } 
    
    else {

      /** Create empty sub matrices **/

      int A11[][] = new int[size / 2][size / 2];
      int A12[][] = new int[size / 2][size / 2];
      int A21[][] = new int[size / 2][size / 2];
      int A22[][] = new int[size / 2][size / 2];
      int B11[][] = new int[size / 2][size / 2];
      int B12[][] = new int[size / 2][size / 2];
      int B21[][] = new int[size / 2][size / 2];
      int B22[][] = new int[size / 2][size / 2];

      /** Assign the sub matrices **/

      A11 = assign(A, A11, 0, 0);
      A12 = assign(A, A12, 0, size / 2);
      A21 = assign(A, A21, size / 2, 0);
      A22 = assign(A, A22, size / 2, size / 2);
      B11 = assign(B, B11, 0, 0);
      B12 = assign(B, B12, 0, size / 2);
      B21 = assign(B, B21, size / 2, 0);
      B22 = assign(B, B22, size / 2, size / 2);

      /** Additions and Subtractions **/

      int S1[][] = subtract(B12, B22);
      int S2[][] = add(A11, A12);
      int S3[][] = add(A21, A22);
      int S4[][] = subtract(B21, B11);
      int S5[][] = add(A11, A22);
      int S6[][] = add(B11, B22);
      int S7[][] = subtract(A12, A22);
      int S8[][] = add(B21, B22);
      int S9[][] = subtract(A11, A21);
      int S10[][] = add(B11, B12);

      /** Multiplications **/

      int P1[][] = Strassen(A11, S1);
      int P2[][] = Strassen(S2, B22);
      int P3[][] = Strassen(S3, B11);
      int P4[][] = Strassen(A22, S4);
      int P5[][] = Strassen(S5, S6);
      int P6[][] = Strassen(S7, S8);
      int P7[][] = Strassen(S9, S10);

      /** Deployment **/

      int C11[][] = add(P5, add(P4, subtract(P6, P2)));
      int C12[][] = add(P1, P2);
      int C21[][] = add(P3, P4);
      int C22[][] = add(subtract(P5, P3), subtract(P1, P7));

      /** Merge and Return **/

      return merge(C11, C12, C21, C22);

    }

  }

  private static int[][] assign(int A[][], int sub[][], int i, int j) {

    for (int i1 = 0, i2 = i; i1 < sub.length; i1++, i2++) {

      for (int j1 = 0, j2 = j; j1 < sub.length; j1++, j2++) {
        sub[i1][j1] = A[i2][j2];
      }

    }

    return sub;

  }

  private static int[][] add(int A[][], int B[][]) {

    int C[][] = new int[A.length][A.length];

    for (int i = 0; i < A.length; i++) {
      for (int j = 0; j < A.length; j++) {
        C[i][j] = A[i][j] + B[i][j];
      }
    }

    return C;

  }

  private static int[][] subtract(int A[][], int B[][]) {

    int C[][] = new int[A.length][A.length];

    for (int i = 0; i < A.length; i++) {
      for (int j = 0; j < A.length; j++) {
        C[i][j] = A[i][j] - B[i][j];
      }
    }

    return C;

  }

  private static int[][] merge(int A11[][], int A12[][], int A21[][], int A22[][]) {

    int A[][] = new int[A11.length * 2][A11.length * 2];

    for (int i = 0; i < A11.length; i++) {
      for (int j = 0; j < A11.length; j++) {
        A[i][j] = A11[i][j];
      }
    }

    for (int i1 = 0, i2 = 0; i1 < A12.length; i1++, i2++) {
      for (int j1 = 0, j2 = A11.length; j1 < A11.length; j1++, j2++) {
        A[i2][j2] = A12[i1][j1];
      }
    }

    for (int i1 = 0, i2 = A11.length; i1 < A11.length; i1++, i2++) {
      for (int j1 = 0, j2 = 0; j1 < A11.length; j1++, j2++) {
        A[i2][j2] = A21[i1][j1];
      }
    }

    for (int i1 = 0, i2 = A11.length; i1 < A11.length; i1++, i2++) {
      for (int j1 = 0, j2 = A11.length; j1 < A11.length; j1++, j2++) {
        A[i2][j2] = A22[i1][j1];
      }
    }

    return A;

  }

  private static int[][] readMatrix(int n, int p) {

    int mat[][] = new int[n][p];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < p; j++) {
        mat[i][j] = sc.nextInt();
      }
    }

    return mat;

  }

  private static void displayMatrix(int mat[][]) {

    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[0].length; j++) {
        System.out.print(mat[i][j] + " ");
      }

      System.out.println();
    }
  }

}
