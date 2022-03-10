
/**
 * Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is 
defined between two nodes p and q as the lowest node in T that has both p and q as descendants 
(where we allow a node to be a descendant of itself).”
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode left=null;
        TreeNode right=null;
        
        //base case
        if(root.val==p.val || root.val == q.val){
            return root ; 
        }
                
        if(root.left!= null){
            left = lowestCommonAncestor(root.left,p,q);
        }
        if(root.right != null){
            right = lowestCommonAncestor(root.right,p,q);
        }
        
        if(left != null && right != null ) return root;
        if(left!=null)
            return left;
        if(right!=null)
            return right;
        
        return null; 
    }
}