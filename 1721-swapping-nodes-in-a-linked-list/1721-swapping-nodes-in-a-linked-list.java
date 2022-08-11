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
    public ListNode swapNodes(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        
        int len = 0;
        ListNode _head = head;
        while(_head != null){
            len++;
            _head = _head.next;
        }
        
        len = len-k+1;
        if(k == len) return head;
        
        ListNode first = head;
        ListNode second = head;
        
        _head = head;
        while(_head != null){
            if(k == 1) first = _head;
            if(len == 1) second = _head;
            k--;
            len--;
            _head = _head.next;
        }
        
        
            System.out.println(first.val +" "+second.val);
        
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
        
        return head;
    }
}