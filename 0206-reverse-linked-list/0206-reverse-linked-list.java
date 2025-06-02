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
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }

        ListNode curr=head;
        ListNode prev=null;

        while(curr != null){
           ListNode temp=curr.next;//store next node
            curr.next=prev;//reverse node
            prev=curr;//prev curr
            curr=temp;//move curr forward
        }
        return prev; //prev will be a new head
    }
}