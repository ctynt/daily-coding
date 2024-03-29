package top.ctynt.day4;

/**
 * @Author ctynt
 * @Date 2023/7/7
 * @Description 二进制求和
 */

public class AddBinary {
    public String addBinary(String a, String b) {
        if(a == null || a.length() == 0) {
            return b;
        }
        if(b == null || b.length() == 0) {
            return a;
        }

        StringBuilder stb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;

        int c = 0;  // 进位
        while(i >= 0 || j >= 0) {
            if(i >= 0) {
                c += a.charAt(i --) - '0';
            }
            if(j >= 0) {
                c += b.charAt(j --) - '0';
            }
            stb.append(c % 2);
            c >>= 1;
        }

        String res = stb.reverse().toString();
        return c > 0 ? '1' + res : res;
    }
}
