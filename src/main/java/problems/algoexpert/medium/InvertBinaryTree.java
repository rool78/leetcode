package problems.algoexpert.medium;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {

    public static void invertBinaryTree(BinaryTree tree) {
        Queue<BinaryTree> queue = new LinkedList<>();
        queue.add(tree);
        while(!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                BinaryTree currentNode = queue.remove();
                BinaryTree tmp = currentNode.left;
                currentNode.left = currentNode.right;
                currentNode.right = tmp;
                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
        }
    }

    static class BinaryTree {
        public int value;
        public BinaryTree left;
        public BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

}
