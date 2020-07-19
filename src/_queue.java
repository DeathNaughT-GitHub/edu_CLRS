import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

class _queue {
    static Scanner sc = new Scanner (System.in);

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        progress: while (true) {
            // 1 for push   2 for pop   3 for peek  4 for exit

            int key = sc.nextInt();
            switch (key) {
                case 1:
                    int val = sc.nextInt();
                    queue.add(val);
                    break;

                case 2:
                    queue.remove(); // throws NullPointer
                    break;

                case 3:
                    for (int item: queue) {
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