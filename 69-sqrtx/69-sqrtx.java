class Solution {
    public int mySqrt(int t) {
        long x = (long)t;
        long l = 1;
		long r = x;
		while(l<=r){
		    long mid = l+(r-l)/2;
		    long m = mid*mid;
		    if(m == x)
		        return (int)mid;
		    if(m > x)
		        r = mid-1;
		    else
		        l = mid+1;
		}
		return (int)r;
    }
}