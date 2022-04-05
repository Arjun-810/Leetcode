class Solution {
    public int maxArea(int[] height) {
        int area = 0,temp,i=0,j=height.length-1;
        while(i<j){
            if (height[i]>height[j]){
                temp = height[j]*(j-i);
                j--;
                area = Math.max(area,temp);
            }else {
                temp = height[i]*(j-i);
                i++;
                area = Math.max(area,temp);
            }
        }
        return area;
    }
}