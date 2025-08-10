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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
  //Create two lists to store the leaf values of root1 and root2.      
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();
        collectLeaves(root1, leaves1);//function(RECURSION)
        collectLeaves(root2, leaves2);
        return leaves1.equals(leaves2); // compares size + each element in order
    }
    
    //recursion method 
    private void collectLeaves(TreeNode node, List<Integer> list) {//in this function we need nodes and list
        if (node == null) return;
        if (node.left == null && node.right == null) {
            list.add(node.val);
            return;
        }
        collectLeaves(node.left, list);   // visit left subtree first (left-to-right order)
        collectLeaves(node.right, list);  // then visit right subtree
    }
}