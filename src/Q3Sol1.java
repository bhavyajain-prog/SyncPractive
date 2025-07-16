/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order. (Easy)
Example: Input: nums = [1,3,5,6], target = 5 Output: 2
 */
public class Q3Sol1 {
    public static int predictedIndexOf(int[] array, int target) {
        if (array[array.length - 1] < target) return array.length;
        int i;
        for (i = 0; i < array.length; i++) {
            if (array[i] < target && array[i + 1] > target) return i + 1;
            else if (array[i] >= target) break;
        }
        return i;
    }
}
