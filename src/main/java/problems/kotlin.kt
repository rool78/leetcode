package problems

fun main() {

}

class kotlin {

//     Example:
//     var ti = TreeNode(5)
//     var v = ti.`val`
//     Definition for a binary tree node.
    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    class Solution {
        fun maxDepth(root: TreeNode?): Int {
            return dfs(root, 0)
        }

        private fun dfs(node: TreeNode?, current: Int): Int {
            if (node == null) {
                return current
            }
            return maxOf(
                dfs(node.left, current + node.`val`), dfs(node.right, current + node.`val`)
            )
        }
    }

}
