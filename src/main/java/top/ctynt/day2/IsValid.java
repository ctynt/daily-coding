package top.ctynt.day2;

/**
 * @Author ctynt
 * @Date 2023/7/3
 * @Description 有效括号
 */

public class IsValid {
    public boolean isValid(String s) {
        int length = s.length() / 2;
        for (int i = 0; i < length; i++) {
            s = s.replace("()", "").replace("{}", "").replace("[]", "");
        }

        return s.length() == 0;
    }
}
