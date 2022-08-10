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
    public int numComponents(ListNode head, int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
            map.put(nums[i], i);
        ListNode root = head;
        int max = Integer.MIN_VALUE, c = 0;
        boolean prevCon = false;
        while(root != null){
            if(map.containsKey(root.val)){
                if(!prevCon){
                    c++;
                    prevCon = true;
                }
            }
            else prevCon = false;
            root = root.next;
        }
        return c;
    }
}