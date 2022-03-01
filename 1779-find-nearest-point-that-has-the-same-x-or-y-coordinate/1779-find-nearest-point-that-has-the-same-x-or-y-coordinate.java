class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
int m_dist = Integer.MAX_VALUE,p = -1,value = Integer.MAX_VALUE;
        for (int i=0;i<points.length;i++) {
            if (points[i][0] == x || points[i][1] == y){
                value = Math.abs(points[i][0] - x) + Math.abs(points[i][1] - y);
                if (m_dist > value) {
                    m_dist = value;
                    p = i;
                }
            }
        }
        return p;
    }
}