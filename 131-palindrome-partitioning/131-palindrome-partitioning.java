class Solution {
    public boolean isPalandrome(String s,int start,int end){
        while(start <= end){
            if(s.charAt(start++) != s.charAt(end--)) return false;
        }
        return true;
    }
    public void findPartition(int idx,String s,List<List<String>> res,List<String> store){
        if(idx == s.length()){
            res.add(new ArrayList<>(store));
            return;
        }
        for(int i=idx;i<s.length();i++){
            if(isPalandrome(s,idx,i)){
                store.add(s.substring(idx,i+1));
                findPartition(i+1,s,res,store);
                store.remove(store.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> store = new ArrayList<>();
        findPartition(0,s,res,store);
        return res;
    }
}