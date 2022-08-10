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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] res = new ListNode[k];
        for(int i=0;i<k;i++)
            res[i] = null;
        
        int c = 0;
        ListNode temp = head;
        while(temp!=null){
            c++;
            temp = temp.next;
        }
        int all_count = c/k;
        int ext = c%k;
        int[] count = new int[k];
        for(int i=0;i<k;i++){
            count[i] = all_count;
            if(ext>0){
                count[i] += 1;
                ext--;
            }
        }
        temp = head;
        ListNode prev = head;
        for(int i=0;i< count.length;i++){
            if(count[i] == 0) break;
            res[i] = head;
            while(count[i]>0){
                prev = head;
                head = head.next;
                count[i]--;
            }
            prev.next = null;
        }
        
        return res;
    }
}