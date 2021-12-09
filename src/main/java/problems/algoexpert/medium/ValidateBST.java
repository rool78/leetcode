package problems.algoexpert.medium;

import java.util.LinkedList;
import java.util.Queue;

public class ValidateBST {

    public static boolean validateBst(BST tree) {
        return aux(tree, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }

    private static boolean aux(BST tree, int maxValue, int minValue) {
        if (tree.value >= minValue || tree.value < maxValue) {
            return false;
        }
        if (tree.left != null && !aux(tree.left, tree.left.value, minValue)) {
            return false;
        }
        if (tree.right != null && !aux(tree.right, maxValue, tree.right.value)) {
            return false;
        }
        return true;
    }


    public static boolean validateBstWRONG(BST tree) {
        Queue<BST> queue = new LinkedList<>();
        queue.add(tree);
        while (!queue.isEmpty()) {
            int levelLength = queue.size();
            for (int i = 0; i < levelLength; i++) {
                BST currentNode = queue.remove();
                if (currentNode.left != null) {
                    if (currentNode.value <= currentNode.left.value) {
                        return false;
                    } else {
                        queue.add(currentNode.left);
                    }
                }
                if (currentNode.right != null) {
                    if (currentNode.value > currentNode.right.value) {
                        return false;
                    } else {
                        queue.add(currentNode.right);
                    }
                }
            }
        }
        return true;
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
