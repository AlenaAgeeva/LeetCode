package easy.treenode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given the root of a binary tree, return all root-to-leaf paths in any order.
 * A leaf is a node with no children.
 * Example 1:
 * Input: root = [1,2,3,null,5]
 * Output: ["1->2->5","1->3"]
 * Example 2:
 * Input: root = [1]
 * Output: ["1"]
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
public class BinaryTreePaths257 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        checkTreeNode(root, "", result);
        return result;
    }

    private void checkTreeNode(TreeNode treeNode, String prefix, List<String> list) {
        if (treeNode == null) {
            return;
        }
        prefix = prefix.isEmpty()
                ? Integer.toString(treeNode.val)
                : prefix + "->" + treeNode.val;
        if (treeNode.left == null && treeNode.right == null) {
            list.add(prefix);
            return;
        }
        checkTreeNode(treeNode.left, prefix, list);
        checkTreeNode(treeNode.right, prefix, list);
    }
}

