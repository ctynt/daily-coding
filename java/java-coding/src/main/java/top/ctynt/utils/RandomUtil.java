package top.ctynt.utils;

import java.util.Random;

/**
 * @Author ctynt
 * @Date 2023/2/2
 * @Description 随机工具类
 */
public class RandomUtil {
    /**
     *
     *
     * @param bound 范围
     * @return 随机数
     */
    public static int genRandomNumber(int bound) {
        Random random = new Random();
        return random.nextInt(bound);
    }

}
