/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Set<ListNode> set = new HashSet<>();
        // while(headA != null){
        //     set.add(headA);
        //     headA = headA.next;
        // }
        // while(headB!= null){
        //     if(set.contains(headB)) return headB;
        //     headB = headB.next;
        // }
        // return null;
        int c1 = 0,c2 = 0;
        ListNode temp = headA;
        while(temp != null){
            c1++;
            temp = temp.next;
        }
        temp = headB;
        while(temp != null){
            c2++;
            temp = temp.next;
        }
        ListNode bigHead = null;
        ListNode smallHead = null;
        int diff = 0;
        if(c1<c2){
            diff = c2-c1;
            bigHead = headB;
            smallHead = headA;
        }else{
            diff = c1-c2;
            bigHead = headA;
            smallHead = headB;
        }
        for(int i=0;i<diff;i++)
            bigHead = bigHead.next;
        while(bigHead != null && smallHead != null){
            if(bigHead == smallHead)
                return bigHead;
            smallHead = smallHead.next;
            bigHead = bigHead.next;
        }
        return null;
    }
}