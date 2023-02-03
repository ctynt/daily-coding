package top.ctynt.utils;

/**
 * @Author ctynt
 * @Date 2023/2/3
 * @Description 格式化工具类
 */
public class FormatUtil {
    /**
     * 格式化输出一堆数组，每行 count 个元素
     *
     * @param array 数组
     * @param count 每行个数
     */
    public static void printArray (int[] array, int count) {
        int i = 0;
        while (i < array.length) {
            if (i % count == 0) {
                System.out.println();
            }
            System.out.printf("%5d", array[i]);
            i++;
        }
    }
}
