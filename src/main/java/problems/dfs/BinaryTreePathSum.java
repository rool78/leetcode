package problems.dfs;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePathSum {


    public static boolean hasPath(TreeNode root, int sum) {
        if (root == null)
            return false;
        List<Integer> result = dfs(root, 0, new ArrayList<>());
        return result.contains(sum);
    }

    private static List<Integer> dfs(TreeNode node, int currentSum, List<Integer> result) {
        currentSum += node.val;
        if (node.left == null && node.right == null) {
            result.add(currentSum);
        }
        if (node.left != null)
            dfs(node.left, currentSum, result);
        if (node.right != null)
            dfs(node.right, currentSum, result);
        return result;
    }

    //Super Smart Solution haha
    //TODO revisit
    public static boolean hasPathSmart(TreeNode root, int sum) {
        if (root == null)
            return false;

        // if the current node is a leaf and its value is equal to the sum, we've found a path
        if (root.val == sum && root.left == null && root.right == null)
            return true;

        // recursively call to traverse the left and right sub-tree
        // return true if any of the two recursive call return true
        return hasPathSmart(root.left, sum - root.val) || hasPathSmart(root.right, sum - root.val);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        System.out.println("Tree has path: " + hasPathSmart(root, 23)); //true
        System.out.println("Tree has path: " + hasPathSmart(root, 16)); //false
    }

}
