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
    public ListNode mergeTwoLists(ListNode first, ListNode second) {
        if(first == null && second == null) return null;
        if(first == null && second != null) return second;
        if(first != null && second == null) return first;
        ListNode prev = first;
        ListNode a = first;
        if(second.val < first.val) return mergeTwoLists(second,first);
        while(first != null && second != null){
            if(first.val > second.val){
                ListNode temp = new ListNode(second.val);
                second = second.next;
                prev.next = temp;
                temp.next = first;
                prev = temp;
            }
            else{
                prev = first;
                first = first.next;
            }
        }
        if(second != null)
            prev.next = second;
        return a;
    }
}