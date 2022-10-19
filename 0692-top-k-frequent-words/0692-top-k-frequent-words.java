class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        for(String x: words)
            map.put(x,map.getOrDefault(x,0)+1);
        
        PriorityQueue<String> queue = new PriorityQueue<>((s1,s2) -> {
            int s1_count = map.get(s1);
            int s2_count = map.get(s2);
            
            if(s1_count == s2_count)
                return s2.compareTo(s1);
            
            return s1_count - s2_count;
        });
        
        for(String x : map.keySet()){
            queue.offer(x);
            if(queue.size() > k) queue.poll();
        }
        
        LinkedList<String> res = new LinkedList<>();
        while(!queue.isEmpty()){
            res.addFirst(queue.poll());
        }
        
        return res;
    }
}