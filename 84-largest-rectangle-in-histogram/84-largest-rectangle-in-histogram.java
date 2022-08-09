class Solution {
    public int largestRectangleArea(int[] heights) {
        int ans = Integer.MIN_VALUE;
        int[] left_smallest = new int[heights.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<heights.length;i++){
            while(!stack.isEmpty() && heights[i] <= heights[stack.peek()])
                stack.pop();
            if(stack.isEmpty()) left_smallest[i] = 0;
            else left_smallest[i] = stack.peek()+1;
            stack.push(i);
        }
        stack.clear();
        int[] right_smallest = new int[heights.length];
        for(int i=heights.length-1;i>=0;i--){
            while(!stack.isEmpty() && heights[i] <= heights[stack.peek()])
                stack.pop();
            if(stack.isEmpty()) right_smallest[i] = heights.length-1;
            else right_smallest[i] = stack.peek()-1;
            stack.push(i);
        }
        
        for(int i=0;i<heights.length;i++){
            ans = Math.max(ans,heights[i]*(right_smallest[i]-left_smallest[i]+1));    
        }
        return ans;
    }
}