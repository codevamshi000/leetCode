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
    public List<Double> averageOfLevels(TreeNode root) {
  //Create list to hold AVGs to store in decimal we use Double     
        List<Double>averages=new ArrayList<>();
        if(root==null) return averages;

//"Use a queue for BFS(level-order traversal); start by adding the root."
        Queue<TreeNode>queue=new LinkedList<>();
        queue.offer(root);

//looping 
        while(!queue.isEmpty()){
  //At the start of a level, levelSize is the number of nodes on that level.          
          int levelSize=queue.size(); 
          double sum=0;

//Loop through all nodes that belong to this level.
          for(int i=0;i<levelSize;i++){
//"Remove the front node; poll() is safe since levelSize ensures enough elements."            
            TreeNode current=queue.poll();
            sum += current.val;//add this node’s value to the level sum.

//enqueue left & right child for the next level (if present).
            if(current.left !=null) queue.add(current.left);
            if(current.right !=null) queue.add(current.right);
          }
          averages.add(sum/levelSize);//take the avg of them
    }
    return averages;
    } 
}