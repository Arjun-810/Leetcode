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
    public int size(ListNode head){
        int len =0;
        ListNode temp = head;
        while(temp!=null){
            len++;
            temp = temp.next;
        }
        return len;
    }
    public int getDecimalValue(ListNode head) {
        int len = size(head);
        int res = 0;
        ListNode temp = head;
        int i = 1;
        while(temp!=null){
            res += Math.pow(2,len-i)*temp.val;
            temp = temp.next;
            i++;
        }
        return res;
    }
}