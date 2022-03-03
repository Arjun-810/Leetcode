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
    public ListNode detectCycle(ListNode head) {
    if(head == null) return null;
    ListNode slow = head;
    ListNode fast = head;
    int loop = -1;
        while(fast != null && fast.next != null){
            
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                loop = 1;
                break;
            }
        }
        if(loop != -1){
            slow = head;
            while(slow!= fast){
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
        return null;
    }
}