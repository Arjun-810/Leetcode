class Solution {
    public void SubSum(int idx, int[] candidates, int target,List<Integer> arr,List<List<Integer>> list){
        if(idx == candidates.length){
            if(target == 0) list.add(new ArrayList(arr));
            return;
        }
        if(candidates[idx] <= target){
            arr.add(candidates[idx]);
            SubSum(idx,candidates,target-candidates[idx],arr,list);    
            arr.remove(arr.size()-1);
        }
        SubSum(idx+1,candidates,target,arr,list);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> arr = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        SubSum(0,candidates,target,arr,list);
        return list;
    }
}