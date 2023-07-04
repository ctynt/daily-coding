package top.ctynt.day3;

/**
 * @Author ctynt
 * @Date 2023/7/4
 * @Description 搜索插入位置
 */

public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length;i++){
            if(nums[i] >= target){
                return i;
            }
        }
        return nums.length;
    }
}
