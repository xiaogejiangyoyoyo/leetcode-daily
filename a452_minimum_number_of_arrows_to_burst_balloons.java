class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points.length==0)
            return 0;
        Arrays.sort(points,(a,b)->(a[1]-b[1]));
        int curPos=points[0][1];
        int ret=1;
        for(int i=1;i<points.length;i++){
            if(points[i][0]<=curPos)
                continue;
            curPos=points[i][1];
            ret++;
        }
        return ret;
    }
}