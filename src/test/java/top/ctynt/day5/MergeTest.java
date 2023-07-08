package top.ctynt.day5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author ctynt
 * @Date 2023/7/8
 * @Description
 */

class MergeTest {

    @Test
    void merge() {
        Merge m = new Merge();
        int[] nums1 = {1,2,3,0,0,0};
        int num1 = 3;
        int[] nums2 = {2,5,6};
        int num2 = 3;
        m.merge(nums1,num1,nums2,num2);
    }
}