import java.util.Scanner;
import java.util.Stack;

class _stack {
    static Scanner sc = new Scanner (System.in);
    static int[] stack;
    static int top;
    static int capacity;

    public static void main(String[] args) {
        capacity = sc.nextInt();
        stack = new int[capacity];
        top = 0;

        CustomStack();
        BuiltInStack();
    }

    private static void CustomStack() {
        progress: while (true) {
            // 1 for push   2 for pop   3 for peek  4 for exit

            int key = sc.nextInt();
            switch (key) {
                case 1:
                    int val = sc.nextInt();
                    push(val);
                    break;

                case 2:
                    pop();
                    break;

                case 3:
                    peek();
                    break;

                case 4:
                    break progress;
            
                default:
                    break;
            }
        }
    }

    private static void push(int val) {
        stack[top++] = val;
    }

    private static int pop() {
        return stack[top--];
    }

    private static void peek() {
        for (int i = 0; i < top; i++) {
            System.out.print("[" + stack[i]+ "] ");
        }

        System.out.println();
    }

    private static void BuiltInStack() {
        Stack<Integer> foo = new Stack<>();
        progress: while (true) {
            // 1 for push   2 for pop   3 for peek  4 for exit

            int key = sc.nextInt();
            switch (key) {
                case 1:
                    int val = sc.nextInt();
                    foo.push(val);
                    break;

                case 2:
                    foo.pop();
                    break;

                case 3:
                    for (int item: foo) {
                        System.out.print("[" + item + "] ");
                    }

                    System.out.println();
                    break;
                    
                case 4:
                    break progress;
            
                default:
                    break;
            }
        }
    }

}