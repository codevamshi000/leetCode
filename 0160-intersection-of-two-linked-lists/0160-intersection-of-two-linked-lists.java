/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a=headA;
        ListNode b=headB;

        while(a!=b){
            a=(a==null)?headB:a.next;
//If a reaches the end of list A (a == null), then jump to the beginning of list B (a = headB).
 //Otherwise, just move to the next node (a = a.next).
             b=(b==null)?headA:b.next;
        }
        return a;
    }
}