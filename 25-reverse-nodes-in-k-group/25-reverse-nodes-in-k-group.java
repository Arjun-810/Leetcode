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
    public ListNode reverseKGroup(ListNode head, int k) {
            int count=0,c=0,in=0;
        ListNode p=head;
        while(p!=null){
            count++;
            p=p.next;
        }
        p=head;
        while(c<count-count%k){
            ArrayList<Integer> tList=new ArrayList<>();
            int val=0;
            while(val<k){
                tList.add(p.val);
                p=p.next;
                val++;
            }
            c+=k;
            val=0;
            ListNode q=head;
            while(val<in){
                q=q.next;
                val++;
            }
            val=1;
            while(in<c){
                q.val=tList.get(tList.size()-val);
                q=q.next;
                in++;
                val++;
            }
        }
        return head;
    }
}