package top.ctynt.day13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author ctynt
 * @Date 2023/7/20
 * @Description
 */

class MergeTest {

    @Test
    void merge() {
        Merge m = new Merge();
        int[][] nums = {{1,3},{2,6},{8,10},{16,18}};
        System.out.println(m.merge(nums));
    }
}