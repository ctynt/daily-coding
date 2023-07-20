package top.ctynt.day13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author ctynt
 * @Date 2023/7/20
 * @Description
 */

class InsertTest {

    @Test
    void insert() {
        Insert i = new Insert();
        int[][] nums1 ={{1,3},{6,9}};
        int[] nums2 = {2,5};
        System.out.println(i.insert(nums1,nums2));
    }
}