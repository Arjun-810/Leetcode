class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
         Map<Integer,Integer> map = new HashMap<>();
        for (int n:nums1)
            map.put(n,map.getOrDefault(n,0)+1);
        List<Integer> res = new ArrayList<>();
        for (int n:nums2) {
            map.put(n, map.getOrDefault(n, 0) - 1);
            if (map.get(n) >= 0)
                res.add(n);
        }
        int ans[] = new int[res.size()];
        int i = 0;
        for(int n : res) {
            ans[i++] = n;
        }
        return ans;
    }
}