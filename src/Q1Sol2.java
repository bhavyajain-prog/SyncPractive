//Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
//You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
//Example: Input: nums = [1,2,0] Output: 3

public class Q1Sol2 {
    public static int smallestPositiveInteger(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            while (nums[i]<=n && nums[i]>0 && nums[nums[i]-1]!=nums[i]) {
                int t2 = nums[i]-1;
                int temp = nums[i];
                nums[i] = nums[t2];
                nums[t2] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            if(nums[i] != i+1) {
                return i+1;
            }
        }
        return n+1;
    }
}