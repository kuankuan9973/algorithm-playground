package io.kuankuan.leetcode;

import io.kuankuan.leetcode.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 94. Binary Tree Inorder Traversal
 * <p>
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 *
 * @author Kuankuan Yang
 * @date 2021-11-16 21:44
 */
public class Problem94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        traverse(root, res);
        return res;
    }

    public void traverse(TreeNode node, List<Integer> res) {
        if (node != null) {
            traverse(node.left, res);
            res.add(node.val);
            traverse(node.right, res);
        }
    }
}
