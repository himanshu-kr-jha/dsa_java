public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    static int size;

    public static void addFirst(int data) {
        // create a new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // newnode's next = head
        newNode.next = head;
        // head = newnode;
        head = newNode;
    }

    public static void addLast(int data) {
        // create
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static void print() {
        if (head == null) {
            System.out.println("EMPTY linked list");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        if (temp == null) {
            System.out.print("null");
        }
        System.out.println();
    }

    public static void add_middle(int idx, int data) {
        Node temp = head;
        Node newNode = new Node(data);
        size++;
        int i = 0;
        if (idx == 0) {
            addFirst(data);
            return;
        }
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        // this gives the previous node before add new node in linked list

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static int removefirst() {
        if (size == 0) {
            System.out.println("Empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public static int removelast() {
        if (size == 0) {
            System.out.println("Empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // get prev
        int i = 0;
        Node prev = head;
        while (i < size - 2) {
            prev.next = head;
            i++;
        }
        int val = prev.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public static void reverse() {
        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static Node midNode(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow;
    }

    public static boolean isPalindrome() {
        if (head == null || head.next != null) {
            return true;
        }
        Node midNode = midNode(head);
        // reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
        }
        return true;
    }

    public boolean cycle() { // Floyd's CFA
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        // You can test your linked list operations here
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(1);
        ll.addLast(2);

        // ll.add_middle(2, 10);
        // ll.print();
        // System.out.println();
        // System.out.println(size);
        // System.out.println(ll.removefirst());
        // ll.print();
        // System.out.println(ll.removelast());
        // ll.reverse();
        // ll.print();
        // System.out.println(ll.isPalindrome());
        System.out.println(ll.cycle());
    }
}