class Solution {
    public int dominantIndex(int[] nums) {
      int max = Integer.MIN_VALUE;
      int maxIndex = -1;
      for (int i = 0; i < nums.length; i++) {
        if (nums[i] > max) {
          max = nums[i];
          maxIndex = i;
        }
      }
      for (int i = 0; i < nums.length; i++) {
        if (nums[i] * 2 > max && i != maxIndex) {
          return -1;
        }
      }
      return maxIndex;
    }
}