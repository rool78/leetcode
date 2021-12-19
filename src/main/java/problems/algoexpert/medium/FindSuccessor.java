import java.util.*;

class Program {
  // This is an input class. Do not edit.
  static class BinaryTree {
    public int value;
    public BinaryTree left = null;
    public BinaryTree right = null;
    public BinaryTree parent = null;

    public BinaryTree(int value) {
      this.value = value;
    }
  }

  public BinaryTree findSuccessor(BinaryTree tree, BinaryTree node) {
		List<BinaryTree> l = helper(tree, new ArrayList<BinaryTree>());
		BinaryTree ans = null;
		for (int i = 0; i < l.size(); i++) {
			if (l.get(i) == node) {
				if (i + 1 < l.size()) {
					ans = l.get(i+1);
				}
				break;
			}
		}
		return ans;
  }
	
	private List<BinaryTree> helper(BinaryTree tree, List<BinaryTree> l) {
		if (tree == null) {
			return l;
		}
		helper(tree.left, l);
		l.add(tree);
		helper(tree.right, l);
		return l;
	}
	
}
