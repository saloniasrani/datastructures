import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        helper(0,levels,root);
        return levels;
    }
    
    public void helper(int level, List<List<Integer>> levels,TreeNode root){
        if(root==null)
            return ;
        
        if(levels.size() == level){
            List<Integer> list = new ArrayList<>();
            levels.add(list);
        }
        
        levels.get(level).add(root.val);
        
        if(root.left!=null){
             helper(level+1, levels, root.left);
        }
        
        if(root.right!= null){
             helper(level+1, levels, root.right);
        }
        
    }
}