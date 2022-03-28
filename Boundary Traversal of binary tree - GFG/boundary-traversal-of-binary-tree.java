// { Driver Code Starts
import java.io.*;
import java.util.*;

class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}

class GFG
{
    static Node buildTree(String str)
    {
        // Corner Case
        if(str.length() == 0 || str.equals('N'))
            return null;
        String[] s = str.split(" ");
        
        Node root = new Node(Integer.parseInt(s[0]));
        Queue <Node> q = new LinkedList<Node>();
        q.add(root);
        
        // Starting from the second element
        int i = 1;
        while(!q.isEmpty() && i < s.length)
        {
              // Get and remove the front of the queue
              Node currNode = q.remove();
        
              // Get the current node's value from the string
              String currVal = s[i];
        
              // If the left child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the left child for the current node
                  currNode.left = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.left);
              }
        
              // For the right child
              i++;
              if(i >= s.length)
                  break;
              currVal = s[i];
        
              // If the right child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the right child for the current node
                  currNode.right = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.right);
              }
              
              i++;
        }
    
        return root;
    }
    
    public static void main(String args[]) throws IOException {
    
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t>0)
        {
            String s = br.readLine();
            Node root = buildTree(s);
            
            Solution T = new Solution();
            
            ArrayList <Integer> res = T.boundary(root);
            for (Integer num : res) System.out.print (num + " ");
            System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends


//User function Template for Java

// class Node  
// { 
//     int data; 
//     Node left, right; 
   
//     public Node(int d)  
//     { 
//         data = d; 
//         left = right = null; 
//     } 
// }

class Solution
{
    ArrayList<Integer> boundaryLeaf(Node node, ArrayList<Integer>arr){
        if(node == null) return arr;
        boundaryLeaf(node.left,arr);
        if(node.left== null && node.right==null){
            arr.add(node.data);
        }
        boundaryLeaf(node.right,arr);
        return arr;
    }
    ArrayList<Integer> boundaryRight(Node node,ArrayList<Integer> arr){
        if(node == null) return arr;
        if(node.right != null){
            boundaryRight(node.right,arr);
            arr.add(node.data);
        }else if(node.left!= null){
            boundaryRight(node.left,arr);
            arr.add(node.data);
        }
        return arr;
    }
    ArrayList<Integer> boundaryLeft(Node node,ArrayList<Integer> arr){
        if(node == null) return arr;
        if(node.left != null){
            arr.add(node.data);
            boundaryLeft(node.left,arr);
        }else if(node.right != null){
            arr.add(node.data);
            boundaryLeft(node.right,arr);
        }
        return arr;
    }
	ArrayList <Integer> boundary(Node node)
	{
	    ArrayList<Integer> arr = new ArrayList<>();
	    if(node == null) return arr;
	    arr.add(node.data);
	    boundaryLeft(node.left,arr);
	    boundaryLeaf(node.left,arr);
	    boundaryLeaf(node.right,arr);
	    boundaryRight(node.right,arr);
	    return arr;
	}
}
