package top.ctynt.day4;

/**
 * @Author ctynt
 * @Date 2023/7/7
 * @Description 加一
 */

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int t=1;//表示进位
        for (int i = digits.length-1; i >= 0; i--) {
            if(t==0){
                return digits;
            }
            int sum=digits[i]+t;
            digits[i]=sum%10;
            t=sum/10;
        }
        if(t!=0){
            int[]arr=new int[digits.length+1];
            arr[0]=1;
            return arr;
        }
        return digits;
    }
}
