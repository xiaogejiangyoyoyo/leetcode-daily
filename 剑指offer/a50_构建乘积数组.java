package 剑指offer;

public class a50_构建乘积数组 {

    public static int[] multiply(int[] A) {
        int len = A.length;
        int[] B = new int[len];
        if (A.length != 0) {
            B[0] = 1;
            // 计算前i - 1个元素的乘积
            for (int i = 1; i < A.length; i++)
                B[i] = A[i - 1] * B[i - 1];
            int temp = 1;
            // 计算后N - i个元素的乘积并连接
            for (int i = len - 2; i >= 0; i--) {
                temp *= A[i + 1];
                B[i] *= temp;
            }
        }
        return B;
    }
}