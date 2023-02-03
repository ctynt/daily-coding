package top.ctynt.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/**
 * @Author ctynt
 * @Date 2023/2/3
 * @Description IO工具类
 */
public class IoUtil {
    /**
     *
     *
     * @param file 文件
     * @param nums 整数数组
     */
    public static void fileWrite(File file, int[] nums) throws IOException {
        Writer writer = new FileWriter(file,true);
        writer.write(Arrays.toString(nums));
        writer.close();
    }
}
