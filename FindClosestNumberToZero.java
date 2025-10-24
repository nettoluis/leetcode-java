class Solution {
    public static int abs(int num) {
        return (int) Math.pow(Math.pow(num, 2), 0.5);
    }

    public int findClosestNumber(int[] nums) {
        int closest = nums[0];
        for (int num : nums) {
            if (abs(closest - 0) > abs(num - 0)) {
                closest = num;
            }
            else if (abs(closest - 0) == abs(num - 0)) {
                closest = num > closest ? num : closest;
            }
        }

        return closest;
    }
}
