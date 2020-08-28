package com.xihua.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Description:不在能知，而在能行
 *
 * @author: 梁西华
 * @date: 2020/8/28/18:18
 * 两数之和：
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，
 * 并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 **/

public class Solution {

    public static void main(String[] args) throws IllegalAccessException {

        int[] ints = {7, 1, 5, 3, 6, 4};
        int[] ints1 = twoSum(ints, 11);

        for (int i = 0; i <ints1.length ; i++) {
            System.out.println(ints1[i]+",");
        }


        System.out.println(Arrays.toString(ints1));
        //System.out.println(ints);

        System.out.println("--------------------------");
        int[] ints2 = twoSum1(ints, 11);

        for (int i = 0; i < ints2.length; i++) {
            System.out.println(ints2[i]+",");
        }
        System.out.println(Arrays.toString(ints2));
    }



    /**
    * 暴力解法，强行遍历查找
    * */
    public static int[] twoSum(int[] nums,int target) throws IllegalAccessException {

        for (int i = 0; i <nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if ( nums[j] == target - nums[i]) {
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalAccessException("没有符合条件的数");
    }

    /**
     *
     *为了对运行时间复杂度进行优化，我们需要一种更有效的方法来检查数组中是否存在目标元素。如果存在，我们需要找出它的索引。
     * 保持数组中的每个元素与其索引相互对应的最好方法是什么？哈希表。
     *
     * 通过以空间换取速度的方式，我们可以将查找时间从 O(n)O(n) 降低到 O(1)O(1)。
     * 哈希表正是为此目的而构建的，它支持以 近似 恒定的时间进行快速查找。我用“近似”来描述，是因为一旦出现冲突，查找用时可能会退化到 O(n)O(n)。
     * 但只要你仔细地挑选哈希函数，在哈希表中进行查找的用时应当被摊销为 O(1)O(1)。
     *
     * 一个简单的实现使用了两次迭代。在第一次迭代中，我们将每个元素的值和它的索引添加到表中。
     * 然后，在第二次迭代中，我们将检查每个元素所对应的目标元素（target - nums[i]target−nums[i]）是否存在于表中。
     * 注意，该目标元素不能是 nums[i]nums[i] 本身！
     *
     * 作者：LeetCode
     * 链接：https://leetcode-cn.com/problems/two-sum/solution/liang-shu-zhi-he-by-leetcode-2/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     *
     * */

    public static int[] twoSum1(int[] nums, int target) throws IllegalAccessException {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i){
                return new int[]{i, map.get(complement)};
            }
        }


        throw new IllegalAccessException("没有符合条件的数");


    }
}
