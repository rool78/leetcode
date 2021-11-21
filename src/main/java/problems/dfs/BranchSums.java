package problems.dfs;

import java.util.ArrayList;
import java.util.List;

public class BranchSums {

    class Program {
        // This is the class of the input root. Do not edit it.
        public static class BinaryTree {
            int value;
            BinaryTree left;
            BinaryTree right;

            BinaryTree(int value) {
                this.value = value;
                this.left = null;
                this.right = null;
            }
        }

        public static List<Integer> branchSums(BinaryTree root) {
            return dfs(root, new ArrayList<>(), 0);
        }

        private static List<Integer> dfs(BinaryTree root, List<Integer> result, int sum) {
            sum += root.value;
            if (root.left == null && root.right == null)
                result.add(sum);
            if (root.left != null)
                dfs(root.left, result, sum);
            if (root.right != null)
                dfs(root.right, result, sum);
            return result;
        }

    }


}
