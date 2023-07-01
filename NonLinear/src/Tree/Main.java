package Tree;

public class Main {
    public static void main(String[] args) {
//        BinarySearchTree st = new BinarySearchTree();
        BinarySearchTree st = new BinarySearchTree();
        st.insertIntoTree(100);
        st.insertIntoTree(10);
        st.insertIntoTree(30);
        st.insertIntoTree(20);
        st.insertIntoTree(40);
        st.insertIntoTree(60);
        st.insertIntoTree(50);

        st.searchTree(22);
//
//        st.printLevelOrder();
    }

}