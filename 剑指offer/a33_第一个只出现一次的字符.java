package 剑指offer;

public class a33_第一个只出现一次的字符 {
    public int FirstNotRepeatingChar(String str) {
        char[] chars = str.toCharArray();
        int[] map = new int[256];
        for (char aChar : chars)
            map[aChar]++;
        for (int i = 0; i < chars.length; i++) {
            if (map[chars[i]] == 1)
                return i;
        }
        return -1;
    }
}