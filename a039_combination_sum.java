class Solution {
    private List<List<Integer>> ret;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ret=new ArrayList<>();
        doCombination(candidates,target,0,new ArrayList<>());
        return ret;
    }
    
    private void doCombination(int[] candidates,int target,int start,List<Integer> list){
        if(target==0){
            ret.add(new ArrayList<>(list));
            return;
        }
        for(int i=start;i<candidates.length;i++){
            if(candidates[i]<=target){
                list.add(candidates[i]);
                doCombination(candidates,target-candidates[i],i,list);
                list.remove(list.size()-1);
            }
        }
    }
}