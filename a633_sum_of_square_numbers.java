class Solution {
    public boolean judgeSquareSum(int c) {
        int left=0,right=(int)Math.sqrt(c);
        while(left<=right){
            int powSum=left*left+right*right;
            if(powSum==c)
                return true;
            else if(powSum>c)
                right--;
            else
                left++;
        }
        return false;
    }
}