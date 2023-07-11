package top.ctynt.day6;

/**
 * @Author ctynt
 * @Date 2023/7/10
 * @Description Excel表列序号
 */

public class TitleToNumber {
    public int titleToNumber(String s) {
        char[] charArray = s.toCharArray();
        int res = 0;
        for(int i = 0; i < charArray.length; i++) {
            res = res*26 + (charArray[i] - 'A' + 1);
        }

        return res;
    }
}
