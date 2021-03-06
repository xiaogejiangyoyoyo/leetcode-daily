package 剑指offer;

public class a08_变态跳台阶 {
    private int JumpFloorII(int target) {
        if (target <= 0) return -1;
        else if (target == 1) return 1;
        else return 2 * JumpFloorII(target - 1);
    }
}
/*
  关于本题，前提是n个台阶会有一次n阶的跳法。分析如下:
  <p>
  f(1) = 1
  <p>
  f(2) = f(2-1) + f(2-2)         //f(2-2) 表示2阶一次跳2阶的次数。
  <p>
  f(3) = f(3-1) + f(3-2) + f(3-3) 
  <p>
  ...
  <p>
  f(n) = f(n-1) + f(n-2) + f(n-3) + ... + f(n-(n-1)) + f(n-n) 
  <p>
   
  <p>
  说明： 
  <p>
  1）这里的f(n) 代表的是n个台阶有一次1,2,...n阶的 跳法数。
  <p>
  2）n = 1时，只有1种跳法，f(1) = 1
  <p>
  3) n = 2时，会有两个跳得方式，一次1阶或者2阶，这回归到了问题（1） ，f(2) = f(2-1) + f(2-2) 
  <p>
  4) n = 3时，会有三种跳得方式，1阶、2阶、3阶，
  <p>
      那么就是第一次跳出1阶后面剩下：f(3-1);第一次跳出2阶，剩下f(3-2)；第一次3阶，那么剩下f(3-3)
  <p>
      因此结论是f(3) = f(3-1)+f(3-2)+f(3-3)
  <p>
  5) n = n时，会有n中跳的方式，1阶、2阶...n阶，得出结论：
  <p>
      f(n) = f(n-1)+f(n-2)+...+f(n-(n-1)) + f(n-n) => f(0) + f(1) + f(2) + f(3) + ... + f(n-1)
  <p>
      
  <p>
  6) 由以上已经是一种结论，但是为了简单，我们可以继续简化：
  <p>
      f(n-1) = f(0) + f(1)+f(2)+f(3) + ... + f((n-1)-1) = f(0) + f(1) + f(2) + f(3) + ... + f(n-2)
  <p>
      f(n) = f(0) + f(1) + f(2) + f(3) + ... + f(n-2) + f(n-1) = f(n-1) + f(n-1)
  <p>
      可以得出：
  <p>
      f(n) = 2*f(n-1)
  <p>
      
  <p>
  7) 得出最终结论,在n阶台阶，一次有1、2、...n阶的跳的方式时，总得跳法为：
  <p>
                | 1       ,(n=0 ) 
  <p>
  f(n) =     | 1       ,(n=1 )
  <p>
                | 2*f(n-1),(n>=2)
 */