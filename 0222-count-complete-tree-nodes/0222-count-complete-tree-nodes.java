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
    public int countNodes(TreeNode root) {
       if(root == null) return 0;

       int leftDepth=getLeftDepth(root);//function 
       int rightDepth=getRightDepth(root);//function

   // If left depth == right depth → perfect binary tree
       if(leftDepth == rightDepth){
        return (1 << leftDepth)-1;
       } 
   // // Otherwise, count recursively    
       return 1+countNodes(root.left)+countNodes(root.right);
    }

    private int getLeftDepth(TreeNode node){//we use node in param bcoz it goes to every left node
        int depth=0;
        while(node!=null){
            depth++;
            node=node.left;
        }
        return depth;
    }
    private int getRightDepth(TreeNode node){
        int depth=0;
        while(node!=null){
            depth++;
            node=node.right;
        }
        return depth;
    }
}