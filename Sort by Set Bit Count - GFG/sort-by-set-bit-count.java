// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Integer arr[] = new Integer[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            
            Compute obj = new Compute();
            obj.sortBySetBitCount(arr, n);
            StringBuilder output = new StringBuilder();
            for(int i = 0; i < n; i++)
            output.append(arr[i] + " ");
            System.out.println(output);
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Compute  
{ 
    static void sortBySetBitCount(Integer arr[], int n)
    { 
        // Your code goes here
               // Your code goes here
        Map<Integer,ArrayList<Integer>> map = new TreeMap<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            String str = Integer.toBinaryString(arr[i]);
            int c = 0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j) == '1') c++;
            }
            ArrayList<Integer> al = new ArrayList<>();
            if(map.containsKey(c)){
                al = map.get(c);
            }
            al.add(arr[i]);
            map.put(c,al);
        }
        int idx=0;
        ArrayList<Integer> al = new ArrayList<>();
        for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
            al = entry.getValue();
            for(int i=0;i<al.size();i++){
                arr[idx] = al.get(i);
                idx++;
            }
        }
    } 
}
