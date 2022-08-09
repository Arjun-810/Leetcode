class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        Arrays.fill(res,-1);
        for(int i=0;i<nums1.length;i++){
            boolean find = false;
            for(int a: nums2){
                if(a == nums1[i]) find = true;
                if(find){
                    if(a > nums1[i]){
                        res[i] = a;
                        break;
                    }
                }
            }
        }
        return res;
    }
}