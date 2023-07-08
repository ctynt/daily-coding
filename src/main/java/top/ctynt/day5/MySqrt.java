package top.ctynt.day5;

/**
 * @Author ctynt
 * @Date 2023/7/8
 * @Description x的平方根
 */

public class MySqrt {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int result = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            // 注意这里要强转long类型，因为可能会超过int范围
            if ((long) mid * mid <= x) {
                // 直接给result赋值，如果后续还能二分<= 不断更新直到最后一次result就是平方最接近x的
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

}
