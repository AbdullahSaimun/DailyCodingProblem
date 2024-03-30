package org.problem.solving.all;

//Given two non-empty binary trees s and t, check whether tree t has exactly the same
// structure and node values with a subtree of s. A subtree of s is a tree consists of a
// node in s and all of this node's descendants. The tree s could also be considered as a subtree of itself.

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class SubtreeCheck {
	public boolean isSubtree(TreeNode s, TreeNode t) {
		if (s == null)
			return false;
		if (isSameTree(s, t))
			return true;
		return isSubtree(s.left, t) || isSubtree(s.right, t);
	}

	private boolean isSameTree(TreeNode s, TreeNode t) {
		if (s == null && t == null)
			return true;
		if (s == null || t == null)
			return false;
		return (s.val == t.val) && isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
	}

	public static void main(String[] args) {
		// Example usage
		SubtreeCheck checker = new SubtreeCheck();

		// Construct tree s
		TreeNode s = new TreeNode(3);
		s.left = new TreeNode(4);
		s.right = new TreeNode(5);
		s.left.left = new TreeNode(1);
		s.left.right = new TreeNode(2);

		// Construct tree t
		TreeNode t = new TreeNode(4);
		t.left = new TreeNode(1);
		t.right = new TreeNode(2);

		boolean result = checker.isSubtree(s, t);
		System.out.println("Is tree t a subtree of tree s? " + result);
	}
}
