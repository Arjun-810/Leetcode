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
    public ListNode rotateRight(ListNode head, int k) {
         if(head==null || head.next==null){
            return head;
        }
        ListNode storehead = head;
        int len=1;
        while(head.next!=null){
            head = head.next;
            len++;
        }
        if(k>len){
            k = k%len;
        }
        while(k>0){
            ListNode prev = null;
            ListNode curr = storehead;
            while(curr.next!=null){    
                prev = curr;
                curr = curr.next;
            }   
            prev.next = null;
            curr.next = storehead;
            storehead = curr;
            
            k--;
        }
        return storehead;
    }
}