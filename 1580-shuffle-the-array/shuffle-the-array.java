class Solution {
    public int[] shuffle(int[] nums, int n) {
        n = nums.length/2;
        int[] temp = new int[n];
        int[] og = new int[n]; 
        for (int i = 0; i < n; i++) {
            temp[i] = nums[n + i];
        }

        for (int i = 0; i < n; i++) {
            og[i] = nums[i];
        }

        for (int i = 1; i < 2*n - 1; i++) {
            if (i % 2 != 0) {
                nums[i] = temp[i / 2];
            }
            else {
                nums[i] = og[i / 2];
            }
        }

        return nums;
    }
}