class Solution {
    
    public int find(ArrayList<Integer> nums){
        int[] arr = new int[nums.size()];
        int max = nums.get(0);
        arr[0] = nums.get(0);
        arr[1] = nums.get(1);
        for(int i=2;i<arr.length;i++){
            arr[i] = max+nums.get(i);
            max = Math.max(max,arr[i-1]);
        }
        return Math.max(arr[nums.size()-1],arr[nums.size()-2]);
    }
    
    public int rob(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        if(nums.length == 2)
            return Math.max(nums[0],nums[1]);
        
        ArrayList<Integer> temp1 = new ArrayList<>();
        ArrayList<Integer> temp2 = new ArrayList<>();        
        
        for(int i=0;i<nums.length;i++){
            if(i!=0)
                temp1.add(nums[i]);
            if(i!=nums.length-1)
                temp2.add(nums[i]);
        }
        return Math.max(find(temp1),find(temp2));
    }
}