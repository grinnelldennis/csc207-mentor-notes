package data_structures;


public class BinarySearchTree<T extends Comparable<T>> {

	private class Node<T extends Comparable<T>>{
		T data;
		Node<T> left;
		Node<T> right;
		public Node(T v) { this.data = v; }
	}

	Node<T> root;

	public BinarySearchTree() { root = null; }

	public int size() {
		return size(root);
	}

	private int size(Node cur) {
		if (cur == null)  // tree(cur) is a leaf
			return 0;
		return size(cur.left) + size(cur.right) + 1;
	}

	public void insert(T v) {
		root = insert(v, root);
	}

	private Node<T> insert(T v, Node<T> cur) {
		if (cur == null)
			return new Node<T>(v);
		else if (v.compareTo(cur.data) <= 0)
			cur.left = insert(v, cur.left);
		else 
			cur.right = insert(v, cur.right);
		return cur;
	}

	private boolean removed;
	private T lrMostElement;

	public boolean remove(T v) {
		removed = false;
		lrMostElement = null;
		root = remove(v, root);
		return removed;
	}

	private Node<T> remove(T v, Node<T> cur) {
		if (cur != null) {
			if (cur.data.equals(v)) {
				removed = true;
				// cases of removal
				if (cur.left == null && cur.right == null)  // this is a leaf node
					return null;
				else if (cur.left == null) 
					return cur.right;
				else if (cur.right == null)
					return cur.left;
				else {
					Node<T> curr = removeHelper(cur.left);
					cur.data = lrMostElement;
					cur.left = curr;
					return cur;
				}
			} else if (v.compareTo(cur.data) < 0)
				cur.left = remove(v, cur.left);
			else 
				cur.right = remove(v, cur.right);
		}
		return cur;
	}

	private Node<T> removeHelper(Node<T> cur) {
		if (cur.right == null) {	// get the right most node
			lrMostElement = cur.data;
			if (cur.left != null) 
				return cur.left;
			return null;
		}
		cur.right = removeHelper(cur.right);
		return cur;
	}

	public String inOrderTraversal() {
		StringBuilder sb = new StringBuilder();
		inOrderTraversal(sb, root);
		return sb.toString();
	}

	private void inOrderTraversal(StringBuilder sb, Node<T> cur) {
		if (cur == null) return;
		inOrderTraversal(sb, cur.left);
		sb.append(cur.data + " ");
		inOrderTraversal(sb, cur.right);
	}


}
