/*约瑟夫问题，求递推公式，每轮的序列中最后出序列的数都是同一个*/
public class Solution {
    public int LastRemaining_Solution(int n, int m) {
        if (n < 1 || m < 1) return -1;
        if (n == 1) return 0;
        return (LastRemaining_Solution(n - 1, m) + m) % n;
    }
}