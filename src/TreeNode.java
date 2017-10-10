
public class TreeNode {
	private int value;
	private TreeNode left;
	private TreeNode right;
	
	public TreeNode(int v) {
		this.value = v;
	}
	
	public void setLeft(TreeNode n) {
		this.left = n;
	}
	public void setRight(TreeNode n) {
		this.right = n;
	}
	public TreeNode getLeft() {
		return this.left;
	}
	public TreeNode getRight() {
		return this.right;
	}
	public int getValue() {
		return this.value;
	}
	public boolean hasLeft() {
		return this.left != null;
	}
	public boolean hasRight() {
		return this.right != null;
	}
}
