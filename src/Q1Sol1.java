/*
Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
Example: Input: nums = [1,2,0] Output: 3
 */
public class Q1Sol1 {
    public static int smallestPositiveInteger(int[] nums) {
        int maxi = 1;
        boolean canExit = true;
        do {
            canExit = true;
            for (int num : nums) {
                if (maxi == num) {
                    canExit = false;
                    maxi++;
                }
            }
        } while (!canExit);
        return maxi;
    }
}


/*
nums=2,1,5,3
maxi=1 -> 4

num = 3
maxi = 4
canExit = 1

not O(n)
 */