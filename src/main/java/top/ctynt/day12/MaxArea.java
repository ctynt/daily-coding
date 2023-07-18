package top.ctynt.day12;

/**
 * @Author ctynt
 * @Date 2023/7/18
 * @Description 盛最多水的容器
 */

public class MaxArea {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1, res = 0;
        while(i < j) {
            res = height[i] < height[j] ?
                    Math.max(res, (j - i) * height[i++]):
                    Math.max(res, (j - i) * height[j--]);
        }
        return res;
    }

}
