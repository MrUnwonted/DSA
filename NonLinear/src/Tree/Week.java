package Tree;
import java.util.function.*;

public class Week {

    private int data;
    public class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
            this.left  = this.right = null;
        }
    }
    TreeNode root;

    public Week() {
        root = null;
    }

    public TreeNode insert(TreeNode root,int data){
        if (root == null){
            root = new TreeNode(data);
            return root;
        }
        if (data < root.data){
            root.left = insert(root.left,data);
        } else if (data > root.data) {
            root.right = insert(root.right,data);
        }
        return root;
    }
    public void insertInto(int data){
       root = insert( root, data);
    }

    public void printTree(){
        inOrder(root);
    }
    public void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        preOrder(root.left);
        System.out.print(root.data + " ");
        preOrder(root.right);
    }

    public static void main(String[] args) {
        Week s = new Week();
        s.insertInto(10);
        s.insertInto(11);
        s.insertInto(12);
        s.insertInto(14);
        s.insertInto(1);

        s.printTree();
    }
}

