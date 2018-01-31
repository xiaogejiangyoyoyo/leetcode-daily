/*这道题如果用递归的话提交会显示：
运行超时:您的程序未能在规定时间内运行结束，请检查是否循环有错或算法复杂度过大。 
于是考虑用迭代解决：*/

public class Solution {
        public int JumpFloor(int target) {
        	if(target == 1 || target == 2) {
        		return target; 
        	}
        	// 第一阶和第二阶考虑过了，初始当前台阶为第三阶，向后迭代
        	// 思路：当前台阶的跳法总数=当前台阶后退一阶的台阶的跳法总数+当前台阶后退二阶的台阶的跳法总数
        	int jumpSum = 0;// 当前台阶的跳法总数 
        	int jumpSumBackStep1 = 2;// 当前台阶后退一阶的台阶的跳法总数(初始值当前台阶是第3阶)
        	int jumpSumBackStep2 = 1;// 当前台阶后退二阶的台阶的跳法总数(初始值当前台阶是第3阶)
        	for(int i = 3; i <= target; i++) {
        		jumpSum= jumpSumBackStep1 + jumpSumBackStep2;
        		jumpSumBackStep2 = jumpSumBackStep1;//后退一阶在下一次迭代变为后退两阶
        		jumpSumBackStep1 = jumpSum;//当前台阶在下一次迭代变为后退一阶
        	} 
        return jumpSum; 
      }
}