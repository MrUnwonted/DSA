package List;

public class Main {
    public static void main(String[] args) {
            //Debug for details
//        SLinkedList sl = new SLinkedList();
//            sl.insertFirst(1);
//            sl.insertFirst(3);
//            sl.insertFirst(2);
//            sl.insertFirst(5);
//
//            sl.display();

            SLinkedList sL = new SLinkedList();
            sL.insertLast(7);
            sL.insertLast(3);
            sL.insertLast(2);
            sL.insertLast(5);

//            sL.insert(33,1);
//            sL.insert(30,4);
            sL.insertTemp(22,2);
            sL.display();


    }
}
