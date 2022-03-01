class Solution {
    public int find(int[] nums,int start,int end,int target) {
        if (start<=end){
            int mid = start+(end-start)/2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid]>target)
                return find(nums,start,mid-1,target);
            else return find(nums,mid+1,end,target);
        }
        return -1;
    }
    public int[] searchRange(int[] nums, int target) {
        int pos = find(nums,0,nums.length-1,target);
        int start  = pos,end = pos;
        if (pos == -1)
            return new int[]{-1, -1};
        else {
            while (start>0 && nums[start]==nums[start-1])
                start = start-1;
            while (end< nums.length-1 && nums[end]==nums[end+1])
                end = end+1;
            return new int[]{start, end};
        }
    }
}