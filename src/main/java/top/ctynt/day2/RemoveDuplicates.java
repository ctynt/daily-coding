package top.ctynt.day2;

/**
 * @Author ctynt
 * @Date 2023/7/3
 * @Description 删除排序数组中的重复项
 */

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int fast = 1, slow = 1;
        while (fast < n) {
            if (nums[fast] != nums[fast - 1]) {
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;
    }

}
