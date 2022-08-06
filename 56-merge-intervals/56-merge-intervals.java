class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <=1) return intervals;
              Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
     ArrayList<int[]> arr = new ArrayList<>();
        int start = -1,end = -1;
        for(int i=0;i<intervals.length;i++){
            if(start ==-1){
                start = intervals[i][0];
                end = intervals[i][1];
            }
            else if(end-intervals[i][0]>=0){ 
                end = Math.max(intervals[i][1],end);
            }
            else{
                int[] temp = {start,end};
                arr.add(temp);
                start = intervals[i][0];
                end = intervals[i][1];
            }          
        }
        int[] temp = {start,end};
        arr.add(temp);
        
        return arr.toArray(new int[arr.size()][]);
    }
}