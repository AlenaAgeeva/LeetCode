package algos.interview;

/**
 * Реализация бинарного дерева
 */
public class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int value) {
        this.value = value;
    }

    public TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    /**
     * Проверка симметричности бинарного дерева
     *
     * @param treeNode1
     * @param treeNode2
     * @return
     */
    public boolean isSimmetric(TreeNode treeNode1, TreeNode treeNode2) {
        if (treeNode1 == null || treeNode2 == null) {
            return false;
        }
        if (treeNode1 == null && treeNode2 == null) {
            return true;
        }
        return treeNode1.value == treeNode2.value
                && isSimmetric(treeNode1.left, treeNode2.left)
                && isSimmetric(treeNode1.right, treeNode2.right);
    }

    /**
     * Вычисление глубины дерева
     *
     * @param root
     * @return
     */
    public static int maxTreeDEpth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftMaxDepth = maxTreeDEpth(root.left);
        int rightMaxDepth = maxTreeDEpth(root.right);
        return leftMaxDepth > rightMaxDepth
                ? leftMaxDepth + 1
                : rightMaxDepth + 1;
    }
}
