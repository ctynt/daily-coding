package top.ctynt.utils;

import java.io.File;
import java.io.IOException;

/**
 * @Author ctynt
 * @Date 2023/2/3
 * @Description 文件工具类
 */
public class FileUtil {
    public static File createFile(String path) throws IOException {
        return new File(path);
    }

    public static int getFileLength(File file) throws IOException {
        return (int) file.length();
    }
}
