/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order. (Easy)
Example: Input: nums = [1,3,5,6], target = 5 Output: 2
 */
public class Q3Sol2 {
    public static int predictedIndexOf(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == target) return mid;
            else if (array[mid] > target) right = mid - 1;
            else if (array[mid] < target) left = mid + 1;
        }
        return left;
    }
}