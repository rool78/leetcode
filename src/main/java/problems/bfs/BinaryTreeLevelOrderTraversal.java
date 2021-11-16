package problems.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
Given a binary tree, populate an array to represent its level-by-level traversal.
You should populate the values of all nodes of each level from left to right in
separate sub-arrays.
 */
public class BinaryTreeLevelOrderTraversal {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        List<List<Integer>> result = traverseIterative(root);
        System.out.println("Level order traversal: " + result);
    }

    public static List<List<Integer>> traverseIterative(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> valuesInLevel = new ArrayList<>();
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                valuesInLevel.add(node.val);
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }
            result.add(valuesInLevel);
        }
        return result;
    }

    public static List<List<Integer>> traverseRecuersive(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> rootQueue = new LinkedList<>();
        rootQueue.offer(root);
        result = processTreeLevel(rootQueue, result);
        return result;
    }

    //Implementacion recursiva
    private static List<List<Integer>> processTreeLevel(Queue<TreeNode> actualLevelQueue, List<List<Integer>> bfs) {
        List<Integer> levelValues = new ArrayList<>();
        Queue<TreeNode> nextLevelQueue = new LinkedList<>();
        while (!actualLevelQueue.isEmpty()) {
            TreeNode node = actualLevelQueue.poll();
            levelValues.add(node.val);
            if (node.left != null)
                nextLevelQueue.offer(node.left);
            if (node.right != null)
                nextLevelQueue.offer(node.right);
        }
        bfs.add(levelValues);
        if (nextLevelQueue.isEmpty())
            return bfs;
        else
            return processTreeLevel(nextLevelQueue, bfs);
    }



    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


}
