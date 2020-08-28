package com.xihua.tree;

import java.util.LinkedList;
import java.util.List;

/**
 * Description:不在能知，而在能行
 *
 * @author: 梁西华
 * @date: 2020/8/28/17:11
 * 从根节点开始，每次迭代弹出当前栈顶元素，并将其孩子节点压入栈中，先压右孩子再压左孩子，
 * 在这个算法中，输出到最终结果的顺序按照Top->Bottom和Left->Right，符合前序遍历的顺序。
 **/

public class Solution {

    public List<Integer> preorderTraversal(TreeNode root){
        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();

        if (root == null) {
            return output;
        }

        stack.add(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pollLast();
            output.add(node.val);
            if (node.right != null) {
                stack.add(node.right);
            }
            if (node.left != null){
                stack.add(node.left);
            }
        }
        return output;
    }
}
