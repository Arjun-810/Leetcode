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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode cur = res;
        boolean pass = false;
        while(l1 != null || l2 != null || pass){
            if(l1 != null){
                cur.val += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                cur.val += l2.val;
                l2 = l2.next;
            }
            if(pass){
                ++cur.val;
                pass = false;
            }
            if(cur.val >= 10){
                cur.val -= 10;
                pass = true;
            }
            if(l1 != null || l2 != null || pass){
                cur.next = new ListNode();
                cur = cur.next;
            }
        }
        return res;
    }
}