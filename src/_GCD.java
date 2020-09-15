//TO RUN THIS CODE VISIT - https://repl.it/@uditswaroopa09/GCD

import java.util.Scanner;

class Main {

  static int GCD(int a, int b){
    if(b== 0)
      return a;
    else
      return GCD(b,a % b);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("FINDING GCD A & B");
    System.out.print("Enter A: ");
    var a = sc.nextInt();
    System.out.print("Enter B: ");
    var b = sc.nextInt();
    System.out.print("GCD of " + a + " , " + b + " is " + GCD(a,b));
    sc.close();
  }
}

/*
OUTPUT
FINDING GCD A & B
Enter A: 56
Enter B: 13
GCD of 56 , 13 is 1
*/
