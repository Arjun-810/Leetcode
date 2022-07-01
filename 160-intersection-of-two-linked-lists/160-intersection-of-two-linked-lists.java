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
        ListNode match = null;
        while(headA != null){
            ListNode temp = headB;
            while(temp != null){
                if(headA == temp) return headA;
                temp = temp.next;
            }
            headA = headA.next;
        }
        return match;
    }
}