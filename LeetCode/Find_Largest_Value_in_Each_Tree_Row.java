import java.util.*;

// import org.w3c.dom.Node;

public class Find_Largest_Value_in_Each_Tree_Row {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.left.left.right = new TreeNode(2);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);
        
    }
    public static List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int max = root.val;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode node = queue.poll();
                if (node.val > max) max = node.val;
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);

            }
            result.add(max);
            max = Integer.MIN_VALUE;
        }
        return result;
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
