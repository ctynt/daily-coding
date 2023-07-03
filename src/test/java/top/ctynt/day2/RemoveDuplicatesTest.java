package top.ctynt.day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author ctynt
 * @Date 2023/7/3
 * @Description
 */

class RemoveDuplicatesTest {

    @Test
    void removeDuplicates() {
        RemoveDuplicates rd = new RemoveDuplicates();
        int[] nums = {2,3,5,1,1};
        System.out.println(rd.removeDuplicates(nums));
    }
}