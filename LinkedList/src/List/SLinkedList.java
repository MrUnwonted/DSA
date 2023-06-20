package List;

public class SLinkedList {


    private Node head;
    private Node tail;
    private int size;

    public SLinkedList() {
        this.size = 0;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

//    public void insertFirst(int val){
//        Node node = new Node(val);
//        if (head == null){
//            head = node;
//            size ++;
//            System.out.println("Value inserted" + node.value);
//            return;
//        }
//        Node temp = head;
//        temp.next=node;
//        System.out.println("Value inserted" + node.value);
//
//        size ++;
//
//    }

//    Assigning values to head. But head will be replaced using tail. Tail acts as temp storage here
    public void insertFirst(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node; // Update tail to the new node
            size++;
            System.out.println("Value inserted: " + node.value);
        } else {
            node.next = head;
            head = node;
            size++;
            System.out.println("Value inserted: " + node.value);
        }
    }

//    Assigning values at the tail end
    public void insertLast(int val){
        if (tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

}
