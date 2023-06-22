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
            this.next = null;
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
        } else {
            node.next = head;
            head = node;

        }
        size++;
        System.out.println("Value inserted: " + node.value);
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
//    public void insert(int val, int index) {
//        if (index == 1) {
//            insertFirst(val);
//            return;
//        }
//        if (index == size) {
//            insertLast(val);
//            return;
//        }
//
//        Node temp = head;
//        for (int i = 2; i < index; i++) {
//            temp = temp.next;
//        }
//
//        Node node = new Node(val, temp.next);
//        temp.next = node;
//
//        size++;
//    }

//    Here the 2 parameter inserted is working as 'temp.next = next'
//    No need to create another temp
//    for storing the previous 'head.next' value
    public void insert(int val,int index){
            if (index == 1){
                insertFirst(val);
                return;
            }
            if (index == size){
                insertLast(val);
                return;
            }
            Node temp = head;
        for (int i = 1; i <index ; i++) {
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next= node;
    }

//    Insert node by creating a temp. And store the head.next in temp.
//    The temp will be assigned to the created node.next. Then swap with node.next and temp.
    public void insertTemp(int val,int index){
        if (index == 1){
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

            Node curr = head;
            for (int i = 1; i <index ; i++) {
                curr = curr.next;
            }
            Node node=new Node(val);
            Node temp = curr.next;
            curr.next = node ;
            node.next = temp;
            size++;

    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println("SIZE:" + size);

    }

}
