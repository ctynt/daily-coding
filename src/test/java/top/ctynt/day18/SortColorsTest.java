package top.ctynt.day18;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author ctynt
 * @Date 2023/7/26
 * @Description
 */

class SortColorsTest {

    @Test
    void sortColors() {
        SortColors sc = new SortColors();
        int[] num = {1,2,4,1,5};
        sc.sortColors(num);
    }
}