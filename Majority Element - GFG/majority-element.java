// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        int res = -1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<size;i++){
            if(map.containsKey(a[i])){
                int count = map.get(a[i])+1;
                if(count>size/2) res = a[i];
                else map.put(a[i],count);
            }else map.put(a[i],1);
        }
        if(a.length == 1) return a[0];
        return res;
    }
}