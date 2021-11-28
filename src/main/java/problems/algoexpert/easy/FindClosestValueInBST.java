package problems.algoexpert.easy;

import java.util.LinkedList;
import java.util.Queue;

public class FindClosestValueInBST {

    public static void main(String[] args) {
        BST bst = new BST(10);
        bst.left = new BST(5);
        bst.right = new BST(15);
        bst.left.left = new BST(2);
        bst.left.right = new BST(5);
        bst.left.left.left = new BST(1);
        bst.right.right = new BST(13);
        bst.right.left = new BST(22);
        bst.right.left.right = new BST(14);
        System.out.println(findClosestValueInBst(bst, 12));
    }

    public static int findClosestValueInBst(BST tree, int target) {
        if (tree == null)
            return -1;
        int closestValue = tree.value;
        BST currentNode = tree;
        while (currentNode != null) {
            int currentDistance = Math.abs(target - currentNode.value);
            if (currentDistance < Math.abs(target - closestValue))
                closestValue = currentNode.value;
            if (target < currentNode.value) {
                currentNode = currentNode.left;
            } else {
                currentNode = currentNode.right;
            }
        }
        return closestValue;
    }

    public static int findClosestValueInBstBFS(BST tree, int target) {
        if (tree == null)
            return -1;
        int closestValue = tree.value;
        Queue<BST> queue = new LinkedList<>();
        queue.offer(tree);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                BST node = queue.remove();
                int difference = target - node.value;
                if (Math.abs(difference) < Math.abs(target - closestValue))
                    closestValue = node.value;
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }
        }
        return closestValue;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }

}
