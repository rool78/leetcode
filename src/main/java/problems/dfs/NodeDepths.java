package problems.dfs;

import java.util.LinkedList;
import java.util.Queue;

public class NodeDepths {

    class Program {

        static class BinaryTree {
            int value;
            BinaryTree left;
            BinaryTree right;

            public BinaryTree(int value) {
                this.value = value;
                left = null;
                right = null;
            }
        }

        public static int nodeDepths(BinaryTree root) {
            if (root == null)
                return 0;
            Queue<BinaryTree> queue = new LinkedList<>();
            queue.offer(root);
            int treeLevel = 0;
            int sum = 0;
            while (!queue.isEmpty()) {
                int levelSize = queue.size();
                for (int i = 0; i < levelSize; i++) {
                    sum += treeLevel;
                    BinaryTree node = queue.remove();
                    if (node.left != null)
                        queue.add(node.left);
                    if (node.right != null)
                        queue.add(node.right);
                }
                treeLevel++;
            }
            return sum;
        }
    }

}
