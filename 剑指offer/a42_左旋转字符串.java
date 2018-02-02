package 剑指offer;

public class a42_左旋转字符串 {
    public String LeftRotateString(String str, int n) {
        int length = str.length();
        if (length <= 0) {
            return "";
        }
        StringBuffer sb = new StringBuffer(str.substring(0, n));
        StringBuffer sb1 = new StringBuffer(str.substring(n, str.length()));
        sb1.append(sb);
        //System.out.println(sb1);
        return sb1.toString();
    }
}