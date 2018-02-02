package 剑指offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

//回溯法
public class a26_字符串的排列 {

    public ArrayList<String> Permutation(String str) {
        ArrayList<String> re = new ArrayList<>();
        if (str == null || str.length() == 0)
            return re;
        HashSet<String> set = new HashSet<>();
        fun(set, str.toCharArray(), 0);
        re.addAll(set);
        Collections.sort(re);
        return re;
    }

    private void fun(HashSet<String> re, char[] str, int k) {
        if (k == str.length) {
            re.add(new String(str));
            return;
        }
        for (int i = k; i < str.length; i++) {
            swap(str, i, k);
            fun(re, str, k + 1);
            swap(str, i, k);
        }
    }

    private void swap(char[] str, int i, int j) {
        if (i != j) {
            char t = str[i];
            str[i] = str[j];
            str[j] = t;
        }
    }
}