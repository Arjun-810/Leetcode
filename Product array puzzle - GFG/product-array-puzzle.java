//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for (int i=0; i<n ; i++ ) {
        		array[i] = sc.nextInt();
        	}
            Solution ob = new Solution();
            long[] ans = new long[n];
            ans = ob.productExceptSelf(array, n); 

           	for (int i = 0; i < n; i++) { 
				System.out.print(ans[i]+" ");
			} 
            System.out.println();
            t--;
        }
    } 
} 
  


// } Driver Code Ends


//User function Template for Java


class Solution 
{ 
	public static long[] productExceptSelf(int arr[], int n) 
	{ 
        // code here
        long pro = 1;
        int zero = 0;
        for(int x: arr){
            if(x == 0)
                zero++;
            else
                pro*=x;
        }
        long res[] = new long[n];
        for(int i=0;i<n;i++){
            if(arr[i] == 0){
                if(zero == 1)
                    res[i] = pro;
                else 
                    res[i] = 0;
            }
            else if(zero > 0)
                res[i] = 0;
            else
                res[i] = pro/arr[i];
        }
        return res;
	} 
} 
