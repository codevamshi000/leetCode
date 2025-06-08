/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */                                                                  
class Solution {
    public boolean isPalindrome(ListNode head) {
      List<Integer>list=new ArrayList<>();
      while(head!=null){
        list.add(head.val);//add all values of  heads into it 
        head=head.next;
      }
         // Step 2: Use two pointers to check for palindrome
      int i=0;
      int j=list.size()-1;
      while(i<j){
        if(!list.get(i).equals(list.get(j)))//checking values of first and last 
        //and moving it front and back ++ --
     return false;
        i++;//forward 
        j--;//backward
      }
      return true;
    }
}