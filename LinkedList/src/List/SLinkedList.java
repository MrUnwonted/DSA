package List;

public class SLinkedList {

    class Node{
        int data;
        Node next;

        Node (int data){
            this.data = data;
        }
    }

    public Node head = null;
    public Node tail = null;

    public int size = 0;


    public void addNode(int data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
        }else {
            tail.next = newNode;
        }
        size ++;
        tail = newNode;
    }

    public void display(){

        if (head == null){
            System.out.println("Empty");
            return ;
        }
        Node curr = head;
        while (curr!=null){
            System.out.println(curr.data);
            curr = curr.next;
        }
        System.out.println(size);
    }

    public static void main(String[] args) {
        SLinkedList list = new SLinkedList();

        list.display();
        int arr[] = {1,2,3};

        for ( int i : arr) {
            list.addNode(i);
        }

//        list.addNode(10);
//        list.addNode(20);
//        list.addNode(30);

        list.display();
    }

}
