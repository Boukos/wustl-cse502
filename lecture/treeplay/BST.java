package treeplay;

import java.util.Random;

public class BST<E> {

	private TreeNode<E> root;

	public BST() {
		this.root = null;
	}

	public boolean add(E e) {
		this.root = helpAdd(root, null, e);
		return true;
	}
	
	public boolean contains(E e) {
		return cthelper(root, e);
	}
	
	private boolean cthelper(TreeNode<E> node, E val) {
		if (node == null) {
			return false;
		}
		if (leq(node, val) && geq(node, val)) {
			return true;
		}
		if (leq(node, val)) {
			return cthelper(node.left, val);
		}
		// must try both because a duplicate could go anywhere
		// If we know this is set, we don't have to try both
		// Or if we know add always does leq to the left we don't
		//  have to try both
		return cthelper(node.right, val);
	}

	private boolean leq(TreeNode<E> node, E val) {
		Comparable<E> comp = (Comparable<E>) val;
		return comp.compareTo(node.value) <= 0;
	}
	
	private boolean geq(TreeNode<E> node, E val) {
		Comparable<E> comp = (Comparable<E>) val;
		return comp.compareTo(node.value) >= 0;
	}

	private TreeNode<E> helpAdd(TreeNode<E> node, TreeNode<E> parent, E val) {
		if (node == null) {
			TreeNode<E> ans = new TreeNode<E>();
			ans.value = val;
			ans.parent = parent;
			return ans;
		}

		if (leq(node, val)) {
			node.left = helpAdd(node.left, node, val);
			return node;
		}
		else {
			node.right = helpAdd(node.right, node, val);
			return node;
		}

	}

	private String toshelp(TreeNode<E> node) {
		if (node == null) {
			return "";
		}
		else return toshelp(node.left) + " " + node.value + " " + toshelp(node.right);
	}
	
	private String indent(int num) {
		String ans = "";
		for (int i=0; i < num; ++i) {
			ans = ans + "    ";
		}
		return ans;
	}
	
	private String dthelp(TreeNode<E> node, int level) {
		if (node == null) return "";
		else return dthelp(node.right, level+1) +
				indent(level) + node.value + "\n" +
		dthelp(node.left, level+1);
	}
	
	public String dumpTree() {
		return dthelp(root, 0);
	}
	public String toString() {
		return "{ " + toshelp(root) + " }";
	}

	public static void main(String[] args) {
		BST<Integer> tree = new BST<Integer>();
		System.out.println(tree);
		Random r = new Random();
		final int NUM = 10;
		int[] vals = new int[NUM];
		for (int i=0; i < NUM; ++i) {
			int n = r.nextInt(100);
			vals[i] = n;
			tree.add(n);
			System.out.println("Aftr add " + n + "\n" + tree.dumpTree());
		}
		System.out.println(tree);
		System.out.println("contains " + vals[3] + "? " + tree.contains(vals[3]));
		System.out.println("contains -5? " + tree.contains(-5));
	}

}
