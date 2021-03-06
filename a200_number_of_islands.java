class Solution {
    private int m,n;
    private int[][] direction={{0,1},{0,-1},{1,0},{-1,0}};
    public int numIslands(char[][] grid) {
        if(grid==null||grid.length==0)
            return 0;
        m=grid.length;
        n=grid[0].length;
        int ret=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    ret++;
                }
            }
        }
        return ret;
    }
    
    private void dfs(char[][] grid,int i,int j){
        if(i<0||i>=m||j<0||j>=n||grid[i][j]=='0')
            return;
        grid[i][j]='0';
        for(int k=0;k<direction.length;k++)
            dfs(grid,i+direction[k][0],j+direction[k][1]);
    }
}