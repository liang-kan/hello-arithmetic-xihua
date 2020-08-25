package com.xihua.arrays;

/**
 * Description:不在能知，而在能行
 *
 * @author: 梁西华
 * @date: 2020/8/25/18:33
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 说明：
 *
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 * 示例 1:
 *
 * 输入: [2,2,1]
 * 输出: 1
 * 示例 2:
 *
 * 输入: [4,1,2,1,2]
 * 输出: 4
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/single-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/

public class SingerNumber {
    public static void main(String[] args) {
        int [] nums = new int[]{1,2,1,2,3};

        singleNumber(nums);
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums){
        int single = 0;
        for (int num : nums){
            single = num ;
        }

        return single;
    }
}