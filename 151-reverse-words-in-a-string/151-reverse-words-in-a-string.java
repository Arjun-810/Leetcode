class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        s= "";
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
            s+=arr[i]+" ";
        }
        return s.trim();
    }
}