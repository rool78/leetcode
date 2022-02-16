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

class ListNode(var value: Int) {
    var next: ListNode? = null
}

fun swapPairs(head: ListNode?): ListNode? {
    val dummy: ListNode? = ListNode(0)
    dummy?.next = head
    var prev: ListNode? = dummy
    var current: ListNode? = head

    while (current != null && current.next != null) {
        var next: ListNode? = current.next
        if (current.next != null) {
            next = current.next?.next
        }
        val second = current.next

        //reverse
        second?.next = current
        current.next = next
        prev?.next = second

        //update
        prev = current
        current = next


    }
    if (dummy != null) {
        return dummy.next
    }

}
