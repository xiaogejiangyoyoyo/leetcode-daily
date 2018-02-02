package 剑指offer;

public class a00_二维数组中的查找 {
    public boolean Find(int target, int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        if (rows < 1 || cols < 1) return false;
        int row = 0;
        int col = cols - 1;
        while (row < rows && col >= 0) {
            if (array[row][col] == target) return true;
            else if (array[row][col] < target) row++;
            else col--;
        }
        return false;
    }
}