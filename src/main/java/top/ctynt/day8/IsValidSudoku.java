package top.ctynt.day8;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author ctynt
 * @Date 2023/7/13
 * @Description 有效数独
 */

public class IsValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        //遍历行
        for (int i = 0; i < 9; i++) {
            //存储第i行的数
            Set<Character> row = new HashSet<>();
            //存储第j列的数字
            Set<Character> column = new HashSet<>();
            //3*3九宫格
            Set<Character> square = new HashSet<>();

            //遍历列
            for (int j = 0; j < 9; j++) {
                //1、判断每行的合理性
                char chRow = board[i][j];//第i行
                //不是空白格，即是数字，判断数字合理性
                if(chRow != '.'){
                    if(row.contains(chRow)){
                        //第i行出现相同数字
                        return false;
                    }else{
                        //未出现该数字将其添加至集合中
                        row.add(chRow);
                    }
                }

                //2、判断每列的合理性
                char chColumn = board[j][i];//第i列
                //判断第i列的合理性
                if(chColumn != '.'){
                    if(column.contains(chColumn)){
                        //第i列出现相同数字
                        return false;
                    }else{
                        //未出现该数字将其添加至集合中
                        column.add(chColumn);
                    }
                }

                //3、判断3*3九宫格的合理性
                char chSquare =  board[i/3*3 + j/3][i%3*3 + j%3];
                if(chSquare != '.'){
                    if(square.contains(chSquare)){
                        return false;
                    }else{
                        //未出现该数字将其添加至集合中
                        square.add(chSquare);
                    }
                }
            }
        }
        return true;
    }

}
