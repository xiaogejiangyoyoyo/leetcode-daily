package 剑指offer;

import java.util.ArrayList;

public class a40_和为S的连续正数序列 {

    //二元一次方程
    //(start+end)*(end-start+1)/2=sum;
    //根据start解出end。。。。。
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (sum < 3) return result;
        for (int i = 1; i <= sum / 2; i++) {
            int value = 1 + 4 * i * i - 4 * i + 8 * sum;
            int valueSqrt = (int) Math.sqrt(value);
            if (value >= 25 && valueSqrt * valueSqrt == value) {
                ArrayList<Integer> path = new ArrayList<>();
                for (int j = i; j <= (valueSqrt - 1) >> 1; j++)
                    path.add(j);
                result.add(path);
            }
        }
        return result;
    }
}