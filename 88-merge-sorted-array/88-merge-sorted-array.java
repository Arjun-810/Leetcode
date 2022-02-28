class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0;
        List<Integer> li = new ArrayList<>();
        while (m+n>i+j && m>i && n>j){
            if (nums1[i]<nums2[j]){
                li.add(nums1[i]);
                i++;
            }else {
                li.add(nums2[j]);
                j++;
            }
        }
        while (m>i){
            li.add(nums1[i]);
            i++;
        }
        while (n>j){
            li.add(nums2[j]);
            j++;
        }
        int p=0;
        for (int l: li) {
            nums1[p] = l;
            p++;
        }
    }
}