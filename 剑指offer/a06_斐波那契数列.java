/*
整体思路：考虑负数，大数，算法的复杂度，空间的浪费
*/
 

public class Solution {
    

    public int Fibonacci(int n) {
        //方法1：用递归，系统会让一个超大的n来让Stack Overflow，所以
        //递归就不考虑了
         
        //使用迭代法，用fn1和fn2保存计算过程中的结果，并复用起来
        int fn1 = 1;
        int fn2 = 1;
         
        //考虑出错情况
        if (n <= 0) {
            return 0;
        }
        //第一和第二个数直接返回
        if (n == 1 || n == 2) {
            return 1;
        }
        //当n>=3时，走这里，用迭代法算出结果
        //这里也说明了，要用三个数操作的情况,
        //其实也可以简化为两个数，从而节省内存空间
        while (n-- > 2) {
            fn2 += fn1;
            fn1 = fn2 - fn1;
        }
        return fn2;
    }
}