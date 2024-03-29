package top.ctynt.day7;

/**
 * @Author ctynt
 * @Date 2023/7/11
 * @Description 整数反转
 */

public class Reverse {
    public int reverse(int x) {
        long n = 0;
        while(x != 0) {
            n = n*10 + x%10;
            x = x/10;
        }
        return (int)n==n? (int)n:0;
    }

}
