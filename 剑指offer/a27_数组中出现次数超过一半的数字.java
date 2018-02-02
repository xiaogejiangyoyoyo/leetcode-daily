package 剑指offer;

import java.util.Arrays;

public class a27_数组中出现次数超过一半的数字 {

    public int MoreThanHalfNum_Solution(int[] array) {
        Arrays.sort(array);
        int count = 0;
        for (int anArray : array) {
            if (anArray == array[array.length / 2])
                count++;
        }
        if (count > array.length / 2)
            return array[array.length / 2];
        else
            return 0;
    }
}