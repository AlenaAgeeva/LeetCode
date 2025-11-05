package easy.treenode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

class BinaryTreePaths257Test {

    private BinaryTreePaths257.TreeNode createNode(int val) {
        return new BinaryTreePaths257().new TreeNode(val);
    }

    private BinaryTreePaths257.TreeNode createNode(int val, BinaryTreePaths257.TreeNode left,
                                                   BinaryTreePaths257.TreeNode right) {
        return new BinaryTreePaths257().new TreeNode(val, left, right);
    }

    @Test
    public void testEmptyTree() {
        BinaryTreePaths257 solution = new BinaryTreePaths257();
        List<String> result = solution.binaryTreePaths(null);
        assertTrue("Expected empty list for null tree", result.isEmpty());
    }

    @Test
    public void testSingleNode() {
        BinaryTreePaths257 solution = new BinaryTreePaths257();
        BinaryTreePaths257.TreeNode root = createNode(1);
        List<String> result = solution.binaryTreePaths(root);
        assertEquals(Arrays.asList("1"), result);
    }

    @Test
    public void testTreeWithMultiplePaths() {
        /*
                1
               / \
              2   3
             /   / \
            5   6   4
        */
        BinaryTreePaths257.TreeNode node5 = createNode(5);
        BinaryTreePaths257.TreeNode node6 = createNode(6);
        BinaryTreePaths257.TreeNode node4 = createNode(4);
        BinaryTreePaths257.TreeNode node2 = createNode(2, node5, null);
        BinaryTreePaths257.TreeNode node3 = createNode(3, node6, node4);
        BinaryTreePaths257.TreeNode root = createNode(1, node2, node3);

        BinaryTreePaths257 solution = new BinaryTreePaths257();
        List<String> result = solution.binaryTreePaths(root);
        List<String> expected = Arrays.asList("1->2->5", "1->3->6", "1->3->4");
        assertEquals(expected.size(), result.size());
        assertTrue(result.containsAll(expected));
    }

    @Test
    public void testTreeWithSinglePathLeft() {
        /*
            1
           /
          2
         /
        3
        */
        BinaryTreePaths257.TreeNode node3 = createNode(3);
        BinaryTreePaths257.TreeNode node2 = createNode(2, node3, null);
        BinaryTreePaths257.TreeNode root = createNode(1, node2, null);

        BinaryTreePaths257 solution = new BinaryTreePaths257();
        List<String> result = solution.binaryTreePaths(root);
        assertEquals(Arrays.asList("1->2->3"), result);
    }

    @Test
    public void testTreeWithSinglePathRight() {
        /*
        1
         \
          2
           \
            3
        */
        BinaryTreePaths257.TreeNode node3 = createNode(3);
        BinaryTreePaths257.TreeNode node2 = createNode(2, null, node3);
        BinaryTreePaths257.TreeNode root = createNode(1, null, node2);

        BinaryTreePaths257 solution = new BinaryTreePaths257();
        List<String> result = solution.binaryTreePaths(root);
        assertEquals(Arrays.asList("1->2->3"), result);
    }
}