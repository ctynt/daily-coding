package top.ctynt.day3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author ctynt
 * @Date 2023/7/4
 * @Description
 */

class RemoveElementTest {

    @Test
    void removeElement() {
        RemoveElement re = new RemoveElement();
        int[] nums = {2,3,1,2};
        int num = 3;
        System.out.println(re.removeElement(nums,num));

    }
}