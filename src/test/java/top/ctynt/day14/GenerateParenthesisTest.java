package top.ctynt.day14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author ctynt
 * @Date 2023/7/21
 * @Description
 */

class GenerateParenthesisTest {

    @Test
    void generateParenthesis() {
        GenerateParenthesis gp = new GenerateParenthesis();
        System.out.println(gp.generateParenthesis(3));
    }
}