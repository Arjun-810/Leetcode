class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <=1) return intervals;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> arr = new ArrayList<>();
        int start = intervals[0][0],end = intervals[0][1];;
        for(int i=1;i<intervals.length;i++){
            if(end-intervals[i][0]>=0){ 
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