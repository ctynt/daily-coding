package top.ctynt.day5;

/**
 * @Author ctynt
 * @Date 2023/7/8
 * @Description 爬楼梯
 */

public class ClimbStairs {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int step1 = 1;
        int step2 = 2;
        int cur = step1 + step2;
        for (int i = 2; i < n; ++i) {
            cur = step1 + step2;
            step1 = step2;
            step2 = cur;
        }
        return cur;
    }
}
