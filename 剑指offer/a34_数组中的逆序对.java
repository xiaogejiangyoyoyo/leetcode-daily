package 剑指offer;

/*
 *归并排序的思想，最后求得的逆序数进行取模 % 1000000007
 */
public class a34_数组中的逆序对 {

    public int InversePairs(int[] array) {
        if (array == null || array.length <= 0)
            return 0;
        return mergeSort(array, 0, array.length - 1);
    }

    private int mergeSort(int[] array, int left, int right) {
        if (left == right)
            return 0;
        int mid = (left + right) / 2;
        int leftNum = mergeSort(array, left, mid);
        int rightNum = mergeSort(array, mid + 1, right);
        return (Sort(array, left, mid, right) + leftNum + rightNum) % 1000000007;
    }

    private int Sort(int[] array, int left, int middle, int right) {
        int current1 = middle;
        int current2 = right;
        int current3 = right - left;
        int temp[] = new int[right - left + 1];
        int pairsnum = 0;
        while (current1 >= left && current2 >= middle + 1) {
            if (array[current1] > array[current2]) {
                temp[current3--] = array[current1--];
                //这个地方是current2-middle！！！！
                pairsnum += (current2 - middle);
                //数值过大求余
                if (pairsnum > 1000000007)
                    pairsnum %= 1000000007;
            } else {
                temp[current3--] = array[current2--];
            }
        }
        while (current1 >= left)
            temp[current3--] = array[current1--];
        while (current2 >= middle + 1)
            temp[current3--] = array[current2--];

        //将临时数组赋值给原数组
        int i = 0;
        while (left <= right)
            array[left++] = temp[i++];
        return pairsnum;
    }
}