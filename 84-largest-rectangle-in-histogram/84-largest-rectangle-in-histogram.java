class Solution {
    public int largestRectangleArea(int[] heights) {
      int area=0;
        
        Stack<Pair<Integer,Integer>> stack=new Stack<>();
        
        int top=-1;
        
        for(int i=0;i<heights.length;i++){
            
            int start=i;
            
            while(!stack.isEmpty() && stack.peek().getValue()>heights[i]){
                
               Pair p=stack.pop();
                int index=(int)p.getKey();
                int height=(int)p.getValue();
               area=Math.max(area,height*(i-index));
               start=index;
                
            }
            Pair p=new Pair(start,heights[i]);
            stack.push(p);
            
        }
        
        while(stack.size()>0){
            
                Pair p=stack.pop();
                int index=(int)p.getKey();
                int height=(int)p.getValue();
            
                area=Math.max(area,height*(heights.length-index));
        }
        
        return area;
    }
}