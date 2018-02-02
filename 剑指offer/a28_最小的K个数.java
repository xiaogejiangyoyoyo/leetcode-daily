package 剑指offer;

import java.util.ArrayList;

//冒泡排序的思想，只不过最外层循环K次就可以了，也就是说不用全部排序，只挑出符合题意的K个就可以。
public class a28_最小的K个数 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> al = new ArrayList<>();
        if (k > input.length)
            return al;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < input.length - i - 1; j++) {
                if (input[j] < input[j + 1]) {
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
            al.add(input[input.length - i - 1]);
        }
        return al;
    }
}