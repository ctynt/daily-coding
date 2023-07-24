package top.ctynt.day17;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author ctynt
 * @Date 2023/7/24
 * @Description
 */

class UniquePathTest {

    @Test
    void uniquePaths() {
        UniquePath up = new UniquePath();
        System.out.println(up.uniquePaths(4,5));
    }
}