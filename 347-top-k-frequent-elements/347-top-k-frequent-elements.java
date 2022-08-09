class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int a: nums)
            map.put(a,(map.getOrDefault(a,0)+1));
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        
        for(int a: map.keySet())
            pq.add(a);
        int[] res = new int[k];
        for(int i=0;i<k;i++)
            res[i] = pq.poll();
        return res;
    }
}