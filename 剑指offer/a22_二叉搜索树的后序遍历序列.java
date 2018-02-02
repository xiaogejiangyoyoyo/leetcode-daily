package 剑指offer;

/**
 * 递归实现检测
 *      *
 *      * 对于后序遍历来说，序列数组的最后一个元素一定是根节点,
 *      * 则根据这个元素，将前面的数组分为左、右两个部分，左侧部分都小，右侧部分都大，
 *      * 如果右侧部分有比该根节点小的元素，那么就不是后序遍历,如此递归进行
 */
public class a22_二叉搜索树的后序遍历序列 {
    public boolean VerifySquenceOfBST(int[] sequence) {
        return sequence != null && sequence.length != 0 && this.isBST(sequence, 0, sequence.length - 1);
    }

    private boolean isBST(int[] arr, int start, int end) {
        if (start >= end)
            return true;
        // 当前数组(从start到end部分)的根节点
        int curElement = arr[end];
        int splitIndex;
        // 找到比curElement大和比curElement小的分界点,分成左侧、右侧两组数据
        for (splitIndex = start; splitIndex < end && arr[splitIndex] < curElement; splitIndex++) {
        }
        // 只需要看右侧即可，因为前面的for循环，已经确保左侧部分全部都小于curElement
        for (int i = splitIndex; i < end; i++) {
            if (arr[i] < curElement)
                return false;
        }
        return isBST(arr, start, splitIndex - 1) && isBST(arr, splitIndex, end - 1);
    }
}