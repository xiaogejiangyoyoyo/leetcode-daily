class Solution {
    private static int[][] shift={{1,0},{-1,0},{0,1},{0,-1}};
    private static boolean[][] visited;
    private int m;
    private int n;
    public boolean exist(char[][] board, String word) {
        if(word==null||word.length()==0)
            return true;
        if(board==null||board.length==0||board[0].length==0)
            return false;
        m=board.length;
        n=board[0].length;
        visited=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(dfs(board,word,0,i,j))
                    return true;
            }
        }
        return false;
    }
    
    private boolean dfs(char[][] board,String word,int start,int r,int c){
        if(start==word.length())
            return true;
        if(r<0||r>=m||c<0||c>=n||board[r][c]!=word.charAt(start)||visited[r][c])
            return false;
        visited[r][c]=true;
        for(int i=0;i<shift.length;i++){
            int nextR=r+shift[i][0];
            int nextC=c+shift[i][1];
            if(dfs(board,word,start+1,nextR,nextC))
                return true;
        }
        visited[r][c]=false;
        return false;
    }
}