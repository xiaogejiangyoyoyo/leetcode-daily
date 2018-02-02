package 剑指offer;

public class a52_表示数值的字符串 {

    public boolean isNumeric(char[] str) {
        String string = String.valueOf(str);
        return string.matches("[+-]?[0-9]*(\\.[0-9]*)?([eE][+-]?[0-9]+)?");
    }
}