class Solution {
    public static boolean find(String A, List<String> B ,HashMap<String,Boolean> map){
        if(A.equals("") || B.contains(A)) return true;
        if(map.containsKey(A)) return map.get(A);
        for(int i=1;i<A.length();i++){
            
            String sr = A.substring(0,i);
            String sl = A.substring(i);
            
            if(find(sl, B, map) && find(sr, B, map)){
                map.put(A, true);
                return true;
            }
        }
            map.put(A,false);
            return false;
        
    }
    public boolean wordBreak(String target, List<String> arr) {
        HashMap<String,Boolean> map = new HashMap<>();
        return find(target, arr, map);
    }
}