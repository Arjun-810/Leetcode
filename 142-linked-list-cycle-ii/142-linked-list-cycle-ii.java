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
    public ListNode detectCycle(ListNode slow) {
        if(slow == null) return null;
        ListNode fast = slow;
        ListNode entry = slow;
         while(fast.next != null&&fast.next.next != null) {
        slow = slow.next;
        fast = fast.next.next;
            
        if(slow == fast) {
            while(slow != entry) {
                slow = slow.next;
                entry = entry.next;
            }
            return slow;
        }
    }
    return null;
    }
}