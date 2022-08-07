class Solution {
    public int longestConsecutive(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int a: arr) set.add(a);
        if(arr.length <= 1) return arr.length;
        int count = 1;
        for(int a: arr){
            if(!set.contains(a-1)){
                int curr_count = 1;
                int x = a;
                while(set.contains(x+1)){
                    curr_count++;
                    x += 1;
                }
                count = Math.max(count,curr_count );
            }
        }
        return count;
    }
}