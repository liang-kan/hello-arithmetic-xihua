package com.xihua.arrays;

/**
 * Description:不在能知，而在能行
 *
 * @author: 梁西华
 * @date: 2020/8/28/17:45
 * 删除数组中的重复项
 **/

public class DeleteDuplicates {

    /*
    *
    * 方法一：双指针法
    *   数组完成排序后，我们可以防止两个指针i和j，其中i是慢指针，而j是快指针。只要nums[i]=nums[j],我们就增加j以跳过重复项。
    *   当我们遇到nums[j]≠nums[i]时，跳过重复项的运行已经结束，因此我们必须把它(nums[j])的值复制到nums[i+1].然后递增i，接着我们将再次重复相同的过程，
    *   直到j到达数组的末尾为止。
    * */

    public static void main(String[] args) {

        int [] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        removeDuplicater(nums);
        System.out.println(removeDuplicater(nums));

        for (int i = 0; i <nums.length ; i++) {
            System.out.print(nums[i]+",");
        }

    }
    public static int removeDuplicater(int[] nums){

        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

}
