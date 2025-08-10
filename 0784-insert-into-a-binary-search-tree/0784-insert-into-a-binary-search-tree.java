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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null)
// empty spot found — create the new node and return it to attach to parent        
          return new TreeNode(val);
        if(val < root.val)
// insert into left subtree; assign back to ensure linking
          root.left=insertIntoBST(root.left,val);
        else 
          root.right=insertIntoBST(root.right,val);
     
     return root;// return unchanged root up the call chain
    }
}