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
    public ListNode sortList(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer> arr = new ArrayList<>();
        int len  = 0;
        while(temp!= null){
            arr.add(temp.val);
            len++;
            temp = temp.next;
        }
        Collections.sort(arr);
        temp = head;
        for(int i=0;i<len;i++){
            temp.val = arr.get(i);
            temp = temp.next;
        }
        return head;
    }
}