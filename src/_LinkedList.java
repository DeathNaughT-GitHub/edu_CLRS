// Built-in LinkedList Class

import java.util.*;

class _LinkedList {
    static Scanner sc = new Scanner (System.in);

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        /* Adding */

        {
            /** add(element) - adds to the tail **/
            list.add(40);
            list.offer(40);

            /** addFirst(element) **/
            list.addFirst(30);
            list.offerFirst(30);

            /** add(inex, element) **/
            list.add(1, 50);

            System.out.println(list);
        }

        /* Iteration */

        {
            /** Simple Looping **/
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }

            /** Using Iterator **/
            Iterator<Integer> link = list.iterator();
            while (link.hasNext()) {
                System.out.println(link.next());
            }
        }

        /** Utilities **/

        {
            // getFirst(), peekFirst(), peek(), element()
            int first = list.getFirst();
            System.out.println(first);

            // getLast(), peekLast()
            int last = list.getLast();
            System.out.println(last);

            int firstOccurence = list.indexOf(30);
            System.out.println(firstOccurence);

            int lastOccurence = list.lastIndexOf(30);
            System.out.println(lastOccurence);

            // pop(), remove() and their variances - by default, head
            list.pop();

            // Set(index, val)
            list.set(0, 10);
            System.out.println(list);
        }

    }
}