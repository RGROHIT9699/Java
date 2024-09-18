import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzzgLevelOrder {
    public class TreeNode {
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

    class Solution {
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>> ll = new ArrayList<>();
            Queue<TreeNode> q = new LinkedList<>();
            if (root != null) {
                q.add(root);
            }
            boolean temp = true;
            while (!q.isEmpty()) {
                int levelSize = q.size();
                List<Integer> levelList = new ArrayList<>();
                for (int i=0;i<levelSize;i++) {
                    TreeNode node = q.poll();
                    if(temp){
                        levelList.add(node.val);
                    }
                    else{
                        levelList.add(0,node.val);
                    }

                    if (node.left != null) {
                        q.add(node.left);
                    }
                    if (node.right != null) {
                        q.add(node.right);
                    }
                }
                ll.add(levelList);
                temp = !temp;
            }

            return ll;        
        }
    }
}