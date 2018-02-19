class Solution {
    public int findCircleNum(int[][] M) {
        int n=M.length;
        int ret=0;
        boolean[] hasFind=new boolean[n];
        for(int i=0;i<n;i++){
            if(!hasFind[i]){
                dfs(M,i,hasFind);
                ret++;
            }
        }
        return ret;
    }
    
    private void dfs(int[][] M,int i,boolean[] hasFind){
        hasFind[i]=true;
        int n=M.length;
        for(int k=0;k<n;k++){
            if(M[i][k]==1&&!hasFind[k])
                dfs(M,k,hasFind);
        }
    }
}