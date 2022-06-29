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
        if(first == null) return second;
        if(second == null) return first;
        
        if(first.val > second.val){
            ListNode temp = first;
            first = second;
            second = temp;
        }
        ListNode res = first;
        
        while(first!= null && second != null){
            ListNode temp = null;
            while( first != null && first.val <= second.val){
                temp = first;
                first = first.next;
            }
            temp.next = second;
            temp = first;
            first = second;
            second = temp;
        }
        return res;
    }
}