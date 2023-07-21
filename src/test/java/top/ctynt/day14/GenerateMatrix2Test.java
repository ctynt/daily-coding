package top.ctynt.day14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author ctynt
 * @Date 2023/7/21
 * @Description
 */

class GenerateMatrix2Test {

    @Test
    void generateMatrix() {
        GenerateMatrix2 gm2 = new GenerateMatrix2();
        int num = 2;
        System.out.println(gm2.generateMatrix(num));
    }
}