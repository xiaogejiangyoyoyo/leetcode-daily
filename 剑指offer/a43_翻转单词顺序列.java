package 剑指offer;

public class a43_翻转单词顺序列 {

    public String ReverseSentence(String str) {
        if (str.trim().equals("")) {
            return str;
        }
        String[] a = str.split(" ");
        StringBuffer o = new StringBuffer();
        for (int i = a.length; i > 0; i--) {
            o.append(a[i - 1]);
            if (i > 1)
                o.append(" ");
        }
        return o.toString();
    }
}