/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
    
      if(head==null||head.next==null){ //in both single and single next node it has null 
        return false;   // so return false
      }
      ListNode slow=head; //slow & fast start from head
      ListNode fast=head;

      while(fast.next!=null && fast.next.next!=null){ 

         fast=fast.next.next;
         slow=slow.next;

        if(fast==slow){
            return true;
        }
        
      }
      return false;
    }
}