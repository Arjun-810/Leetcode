class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
                Set<Integer> set1 = new HashSet<>();
        for (int a:nums1)
            set1.add(a);
        Set<Integer> res = new HashSet<>();
        for (int b:nums2)
            if (set1.contains(b))
                res.add(b);
        int[] arr = new int[res.size()];
        int i=0;
        for (int a: res) {
            arr[i] = a;
            i++;
        }
        return arr;
        
    }
}