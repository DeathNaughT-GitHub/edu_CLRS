import java.util.Scanner;

class _customLinkedList {
    static Scanner sc = new Scanner (System.in);

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(1, 35);
        list.add(3, 45);

        list.pop();
        list.pop(1);
        list.pop(2);

        list.print();

    }
}

class LinkedList {
    static Node head;
    int size = 0;

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node itr = head;

            while (itr.next != null) {
                itr = itr.next;
            }
            
            itr.next = newNode;
        }
        size++;
    }

    public void add(int index, int data) {
        Node newNode = new Node(data);
        if (index >= size || index < 0) {
            System.out.println("Out of bounds");
        } 
        
        else {
            int i = 0;
            size++;
            Node itr = head;

            if (index == 0) {
                newNode.next = head;
                head = newNode;
                return;
            }

            while (itr.next != null) {
                if (i + 1 == index) {
                    newNode.next = itr.next;
                    itr.next = newNode;
                    break;
                } 
                
                else {
                    itr = itr.next;
                    i++;
                }
            }
        }
    }

    public void pop(int index) {
        if (index >= size || index < 0) {
            System.out.println("Out of bounds");
        } 
        
        else {
            int i = 0;
            size--;
            Node itr = head;

            if (index == 0) {
                head = head.next;
                return;
            }

            while (itr.next != null) {
                if (i + 1 == index) {
                    itr.next = itr.next.next;
                    break;
                } else {
                    itr = itr.next;
                    i++;
                }
            }
        }
    }

    public void pop() {
        if (head != null) {
            Node itr = head;

            while (itr.next.next != null) {
                itr = itr.next;
            }

            itr.next = null;
            size--;
        }
    }

    public void print() {
        Node itr = head;

        while (itr != null) {
            System.out.print("[" + itr.val + "] ");
            itr = itr.next;
        }

        System.out.println();
    }

}