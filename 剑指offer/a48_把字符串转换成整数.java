/**
 * 要点：
 * 1.异常输入和0输入的区分，设置一个全局变量
 * 2.正负号的处理
 * 3.溢出处理
 */
public class Solution {
        

    public int StrToInt(String str) {
            int res = 0;        
            int symbol = 1;
            boolean isInvalid = false;   // 区分非法输入和0
            char[] arr = str.toCharArray();
            int n = arr.length;        
            if (n <= 0 || str == null){
                isInvalid = true;
                return 0;
            }         
            if (arr[0] == '-')
                symbol = -1;        
            for (int i = (arr[0] == '-' || arr[0] == '+') ?1 :0;
        i<n ;
        ++i){
                if (!('0' <= arr[i] && arr[i] <= '9')) {
                    isInvalid = true;
                    return 0;
                }
                res = (res << 1) + (res << 3) + (arr[i] & 0xf); //res=res*10+arr[i]-'0'           
                // 溢出判断
                if ((symbol == 1 && res > Integer.MAX_VALUE) || (symbol == -1 && res < Integer.MIN_VALUE)) {
                    isInvalid = true;
                    return 0;
                }
            }        
            return res * symbol;
        }
}