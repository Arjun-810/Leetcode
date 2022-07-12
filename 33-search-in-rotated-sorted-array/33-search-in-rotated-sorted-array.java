class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int heigh = nums.length-1;
        while(low<=heigh){  
            int mid = (low+heigh)/2;
            if(nums[mid] == target) return mid;
            if(nums[low] <=nums[mid]){
                if(nums[low] <= target && nums[mid] >= target) heigh = mid-1;
                else low = mid+1;
            }
            else{
                if(nums[mid] <= target && nums[heigh] >= target ) low = mid+1;
                else heigh = mid-1;
            }
        }
        return -1;
        
    }
}