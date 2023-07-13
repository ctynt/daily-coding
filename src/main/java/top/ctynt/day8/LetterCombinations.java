package top.ctynt.day8;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ctynt
 * @Date 2023/7/13
 * @Description 电话号码的字母组合
 */

public class LetterCombinations {
    //一个映射表，初始化所有数字，为了直接对应2-9，新增两个无效字符串
    String[] letter_map = {" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    //最终输出结果的list
    List<String> result = new ArrayList<>();


    public List<String> letterCombinations(String digits) {

        //注意边界条件
        if(digits==null || digits.length()==0) {
            return new ArrayList<>();  //返回空集合
        }
        backTracking(digits, new StringBuilder(), 0);
        return result;
    }


    //递归函数  index--当前递归遍历到哪个元素-用来遍历题目中的数字字符串
    void backTracking(String digits, StringBuilder letter, int index) {

        if(index == digits.length()) {  //遍历到最后了
            result.add(letter.toString());   //"ad","ae" 这种感觉 对象转成字符串
            return;
        }

        //获取index位置的字符，假设输入的字符是"234"
        //第一次递归时index为0所以c=2，第二次index为1所以c=3，第三次c=4
        //map_string的下标是从0开始一直到9， c-'0'就可以取到相对的数组下标位置
        //比如c=2时候，2-'0'，获取下标为2,letter_map[2]就是"abc" 取index指向的数字，找到对应的字符集

        String map_string = letter_map[digits.charAt(index) -  '0'];   //放的是abc

        for(int i=0;i<map_string.length();i++) {  //开始遍历“abc”

            letter.append(map_string.charAt(i)); //例如输入23 衔接 a-d 或者 a-e
            backTracking(digits, letter, index+1);
            letter.deleteCharAt(letter.length()-1); //回溯
        }
    }

}
