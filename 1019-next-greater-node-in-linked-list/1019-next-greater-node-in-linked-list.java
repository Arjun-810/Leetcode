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
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            arr.add(temp.val);
            temp = temp.next;
        }
        Stack<Integer> stack = new Stack<>();
        int n = arr.size();
        stack.push(arr.get(n-1));
        int[] res = new int[arr.size()];
        for(int i=n-2;i>=0;i--){
            while(!stack.isEmpty()){
                if(stack.peek() > arr.get(i)){
                    res[i] = stack.peek();
                    break;   
                }
                else stack.pop();
            }
            stack.push(arr.get(i));
        }
        return res;
    }
}