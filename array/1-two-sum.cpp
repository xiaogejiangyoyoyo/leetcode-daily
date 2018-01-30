class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int,int> um;
        int n=nums.size();
        vector<int> result(2);
        for(int i=0;i<n;++i){
            if(um.find(target-nums[i])!=um.end()){
                result[0]=um[target-nums[i]];
                result[1]=i;
                break;
            }else{
                um[nums[i]]=i;
            }
        }
        um.clear();
        return result;
    }
};