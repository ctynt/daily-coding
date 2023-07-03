package top.ctynt.day2;

/**
 * @Author ctynt
 * @Date 2023/7/3
 * @Description 最长公共前缀
 */

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) {
            return "";
        }
        String s=strs[0];
        for (String string : strs) {
            while(!string.startsWith(s)){
                if(s.length()==0) {
                    return "";
                }

                s=s.substring(0,s.length()-1);
            }
        }
        return s;
    }
}
