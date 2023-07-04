package top.ctynt.day3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author ctynt
 * @Date 2023/7/4
 * @Description
 */

class SearchInsertTest {

    @Test
    void searchInsert() {
        SearchInsert si = new SearchInsert();
        int[] nums = {2,3,1,2};
        int num = 3;
        System.out.println(si.searchInsert(nums,num));
    }
}