class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 10) {
                continue;
            }
            else if (nums[i] < 100) {
                count++;
            }
            else if (nums[i] < 1000) {
                continue;
            }
            else if (nums[i] < 10000) {
                count++;
            }
            else if (nums[i] == 100000) {
                count++;
            }
            else {
                continue;
            }
        }

        return count;
    }
}