// import javax.swing.tree.TreeNode;

public class Validate_BST {
    static class Node {
        int val;
        Node left, right;
 
        // constructor
        Node(int val)
        {
            this.val = val;
            left = null;
            right = null;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(2);
        root.left.left = new Node(1);
        root.right = new Node(4);
        root.right.left = new Node(6);
        root.right.right = new Node(8);
        System.out.println(isValidBST(root));
    }
    public static boolean isValidBST(Node root) {
        
        return isValid(root, null, null);
    }

    static boolean isValid(Node root, Integer low, Integer high){
        if (root == null){
            return true;
        }

        if (low != null && root.val <= low){
            return false;
        }
        if (high != null && root.val >= high){
            return false;
        }
        boolean lt = isValid(root.left, low, root.val);
        if(!lt){
            return false;
        }
        boolean rt = isValid(root.right, root.val, high);
        if(!rt){
            return false;
        }
        return true;
    }
}
