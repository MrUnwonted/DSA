package Tree;

public class BinarySearchTree {

    public TreeNode root;

    public class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }
     
    public TreeNode insert(TreeNode root, int data){
        if (root == null){
            root = new TreeNode(data);
            System.out.println("Inserted");
            return root;
        }
        if (data < root.data){
            root.left = insert(root.left, data); 
        } else if (data > root.data) {
            root.right = insert(root.right,data);
        }
        return root;

    }

    public void inOrder(){
        inOrder(root);
    }

    public void inOrder(TreeNode root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data + " ");
        inOrder(root.right);
    }

    public void preOrder(){
        preOrder(root);
    }

    private void preOrder(TreeNode root) {
        if (root == null){
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    public TreeNode search(int data)  {
        return search(root,data);
    }

    private TreeNode search(TreeNode root, int data) {
        if (root.data == data || root == null) {
//            System.out.println("Data Found");
            return root;
        }

        if (data< root.data){
         return search(root.left,data);
        }

        return search(root.right,data);

    }

    public boolean isValidTree(TreeNode root, long min, long max){
        if (root == null){
            return true;
        }

        if (root.data<min || root.data>max){
            return false;
        }

        return isValidTree(root.left,min,root.data-1) && isValidTree(root.right,root.data+1,max);
    }

    public void insert(int data){
        root = insert(root, data);
    }

    public void delete(int data){
        root = deleteNode(root,data);
    }

    private TreeNode deleteNode(TreeNode root, int data) {
        if (root == null) {
            return null;
        }

        if (root.data == data){
            if (root.left == null || root.right == null){
                return null;
            }
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null){
                return root.left;}

            TreeNode temp = root.right;
            while (temp.left != null){
                temp = temp.left;
            }
            root.data = temp.data;
            root.right = deleteNode(root.right,temp.data);
            return root;
        } else if (data< root.data) {
            root.left = deleteNode(root.left,data);
            return root;
        }else {
         root.right = deleteNode(root.right,data);
         return root;
        }
    }

}
