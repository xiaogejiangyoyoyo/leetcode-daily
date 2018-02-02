package 剑指offer;

import java.util.LinkedHashMap;
import java.util.Map;

// 最优解：时间复杂度O(n),空间复杂度O(n)
public class a53_字符流中第一个不重复的字符 {

    // LinkedHashMap 是有序的 hashMap
    private Map<Character, Integer> map = new LinkedHashMap<>();

    public void Insert(char ch) {
        if (map.containsKey(ch))
            map.put(ch, 0);
        else
            map.put(ch, 1);

    }

    public char FirstAppearingOnce() {
        for (Map.Entry<Character, Integer> en : map.entrySet()) {
            if (en.getValue() == 1)
                return en.getKey();
        }
        return '#';
    }
}