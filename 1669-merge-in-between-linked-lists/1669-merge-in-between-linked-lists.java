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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp = list1,anode = null,bnode = null;
        int idx = 0;
        while(temp != null){
            if(a-1== idx) anode = temp;
            else if(b+1 == idx){
                bnode = temp;
                break;
            }
            idx++;
            temp = temp.next;
        }
        
            anode.next = list2;
            while(list2.next != null) list2 = list2.next;
            list2.next = bnode;
            return list1;
    }
}