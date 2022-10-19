//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(s[i + 1]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            int[] ans = obj.topK(nums, k);
            for (int i = 0; i < ans.length; i++) System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public int[] topK(int[] nums, int k) {
        // Code here
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x: nums)
            map.put(x,map.getOrDefault(x,0)+1);
            
        PriorityQueue<Integer> queue = new PriorityQueue<>((s1,s2) -> {
           int s1_count = map.get(s1);
           int s2_count = map.get(s2);
           
           if(s1_count == s2_count)
                return s1-s2;
            
            return s1_count - s2_count;
        });
        
        for(int x: map.keySet()){
            queue.offer(x);
            
            if(queue.size() > k)
                queue.poll();
        }
        
        int[] res = new int[k];
        for(int i=k-1;i>=0;i--)
            res[i] = queue.poll();
        return res;
    }
}