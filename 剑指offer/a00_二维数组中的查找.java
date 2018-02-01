public class Solution {
    public boolean Find(int target, int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        if (array == null || rows < 1 || cols < 1)
            return false;
        int row = 0;
        int col = cols - 1;
        while (row < rows && col >= 0) {
            if (array[row][col] == target) {
                return true;
            } else if (array[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return false;
    }
}