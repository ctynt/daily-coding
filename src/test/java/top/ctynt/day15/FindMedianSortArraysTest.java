package top.ctynt.day15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author ctynt
 * @Date 2023/7/23
 * @Description
 */

class FindMedianSortArraysTest {

    @Test
    void findMedianSortedArrays() {
        FindMedianSortArrays fmsa = new FindMedianSortArrays();
        int[] nums1 = {2,4,5};
        int[] nums2 = {4,6,8};
        System.out.println(fmsa.findMedianSortedArrays(nums1,nums2));
    }
}