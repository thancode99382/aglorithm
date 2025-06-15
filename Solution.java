class Solution {
    public int binarySearch(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;
        

        while (l <= r) {
           int mid = (l + r) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            if (target > nums[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 6 };
        int target = 2;

        Solution solution = new Solution();
        int result = solution.binarySearch(nums, target);

        System.out.println(result);

    }
}