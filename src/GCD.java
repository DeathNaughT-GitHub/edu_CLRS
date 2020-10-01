/* Java program to find GCD of two numbers
using recursion*/


import java.util.Scanner;
class GCD
{
    // Recursive function to return gcd of a and b
    static int gcd(int a, int b)
    {
      if (b == 0)
        return a;
      return gcd(b, a % b); 
    }
     
    // Driver code
    public static void main(String[] args) 
    {Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a = sc.nextInt();
        System.out.print("Enter second number:");
        int b = sc.nextInt();
        System.out.println("GCD of " + a +" and " + b + " is " + gcd(a, b));
    sc.close();
    }
}