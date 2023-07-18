package top.ctynt.day12;

/**
 * @Author ctynt
 * @Date 2023/7/18
 * @Description 外观数列
 */

public class CountAndSay {
    public String countAndSay(int n) {
        if(n >=2){
            //递归，拿到上一轮的String
            String s = countAndSay(--n);
            //return 拿到本轮String
            return getresult(s);
        }else{
            return "1";
        }
    }
    //拿到下一个阶段的String 方法
    public String getresult(String s) {
        StringBuilder res = new StringBuilder();
        int index = 0;
        while (index < s.length()) {
            if (index + 1 < s.length() && s.charAt(index) != s.charAt(index + 1)) {
                res.append("1").append(s.charAt(index));
                index++;
            } else {
                int count = 1;
                while (index + 1 < s.length() && s.charAt(index) == s.charAt(index + 1)) {
                    index++;
                    count++;
                }
                res.append(count).append(s.charAt(index));
                index++;
            }
        }
        return res.toString();
    }

}
