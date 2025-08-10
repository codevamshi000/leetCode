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
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null)
           return null;//not found
        if(root.val==val)
           return root;// found, return subtree root
  
//If the target val is smaller than the current node’s value,
//because it’s a BST all smaller values must be in the left subtree.

//less to high from left to right
        if(val<root.val) 
            return searchBST(root.left,val);
        else 
         return searchBST(root.right,val);
    }
}