package 剑指offer;

//传统公式求解时间复杂度O(n)
public class a11_数值的整数次方 {
    public double Power(double base, int exponent) {
        double result = 1;
        for (int i = 0; i < Math.abs(exponent); i++) result *= base;
        if (exponent < 0) result = 1 / result;
        return result;
    }
}
/*
递归：n为偶数，a^n=a^n/2*a^n/2;n为奇数，a^n=（a^（n-1）/2）*（a^（n-1/2））*a
时间复杂度O（logn） public class Solution {
    public double Power(double base, int exponent) {
        int n=Math.abs(exponent);
        if(n==0)
            return 1;
        if(n==1)
            return base;
        double  result=Power(base,n>>1);
        result*=result;
        if((n&1)==1)
            result*=base;
        if(exponent<0)
            result=1/result;
        return result;            
  }
}
*/