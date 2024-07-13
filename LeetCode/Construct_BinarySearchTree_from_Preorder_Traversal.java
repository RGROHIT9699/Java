import java.util.Scanner;

public class Construct_BinarySearchTree_from_Preorder_Traversal {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int n = qw.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = qw.nextInt();
        TreeNode root = new TreeNode(arr[0]);
        for(int i=1;i<n;i++) makingTree(root, arr[i]);
        // System.out.println(root);
        printTree(root);
        qw.close();       
        
    }
    public static void printTree(TreeNode node) {
        if (node != null) {
            printTree(node.left);
            System.out.print(node.val + " ");
            printTree(node.right);
        }
    }
    public static void makingTree(TreeNode root,int i){
        if(i<root.val){
            if(root.left==null){
                root.left = new TreeNode(i);
            }
            else {
                makingTree(root.left,i);
            }
        }
        else{
            if(root.right==null){
                root.right = new TreeNode(i);
            }
            else {
                makingTree(root.right,i);
            }
        }
        
    }
    
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}