package Tree;

public class Main {
    public static void main(String[] args) throws Exception {
//        BinarySearchTree st = new BinarySearchTree();
//        BinarySearchTrees st = new BinarySearchTrees();
//        st.insertIntoTree(100);
//        st.insertIntoTree(10);
//        st.insertIntoTree(30);
//        st.insertIntoTree(20);
//        st.insertIntoTree(40);
//        st.insertIntoTree(60);
//        st.insertIntoTree(50);
//
//        st.searchTree(22);
//
//        st.printLevelOrder();

        BinarySearchTree Bst = new BinarySearchTree();
        Bst.insert(12);
        Bst.insert(52);
        Bst.insert(15);
        Bst.insert(14);
        Bst.insert(1);

        System.out.println("In Order");
        Bst.inOrder();
        System.out.println("Pre Order");
        Bst.preOrder();

//        Bst.search(15);

//        if (Bst.search(16) != null){
//            System.out.println("Key found");
//        } else {
//            System.out.println("Key not found");
//        }

//        boolean isBST = Bst.isValidTree(Bst.root, Integer.MIN_VALUE,Integer.MAX_VALUE);
//        System.out.println("Is the binary tree a valid BST? " + isBST);

        Bst.delete(15);
        System.out.println("In Order After delete");
        Bst.inOrder();

    }

}