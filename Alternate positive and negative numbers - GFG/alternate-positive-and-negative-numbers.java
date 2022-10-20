//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java




class Solution {
    void rearrange(int arr[], int n) {
        // code here
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int x: arr){
            if(x >= 0)
                pos.add(x);
            else
                neg.add(x);
        }
        int i=0,j=0,x = 0;
        int p_n = pos.size();
        int n_n = neg.size();
        while(i<p_n && j< n_n){
            arr[x] = pos.get(i);
            i++;
            x++;
            arr[x] = neg.get(j);
            j++;
            x++;
        }
        while(i<p_n){
            arr[x] = pos.get(i);
            x++;
            i++;
        }
        while(j<n_n){
            arr[x] = neg.get(j);
            x++;
            j++;
        }
    }
}