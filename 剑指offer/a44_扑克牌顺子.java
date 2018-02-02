package 剑指offer;

/**
 * 必须满足两个条件：
 * 1.除0外没有重复的数；
 * 2.max-min<5.
 */
public class a44_扑克牌顺子 {
    public boolean isContinuous(int[] numbers) {
        if (numbers.length != 5) return false;
        int min = 14;
        int max = -1;
        int flag = 0;
        for (int number : numbers) {
            if (number < 0 || number > 13)
                return false;
            if (number == 0)
                continue;
            if (((flag >> number) & 1) == 1)
                return false;
            flag |= (1 << number);
            if (number > max)
                max = number;
            if (number < min)
                min = number;
            if (max - min >= 5)
                return false;
        }
        return true;
    }
}