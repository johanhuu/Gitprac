
public class BinaryTree {
	
	TreeNode root;
	
	public BinaryTree(){}
	
	public TreeNode getRoot() {
		return this.root;
	}
	
	public void add(int v) {
		
		if(this.root == null) {
			this.root = new TreeNode(v);
		}else {
		
			TreeNode addNode = new TreeNode(v);
			TreeNode parent = findParent(addNode, this.root);
			
			if(addNode.getValue() < parent.getValue()) {
				parent.setLeft(addNode);
			}else if(addNode.getValue() > parent.getValue()) {
				parent.setRight(addNode);
			}
		}
	}
	
	public void printNodes(TreeNode n) {
		if(n == null) {return;}
		System.out.println(n.getValue());
		printNodes(n.getLeft());
		printNodes(n.getRight());
	}
	
	private TreeNode findParent(TreeNode n, TreeNode parent) {
		
		if(n.getValue() < parent.getValue()) {
			if(!parent.hasLeft()) {
				return parent;
			}else {
				findParent(n, parent.getLeft());
			}
		}else if(n.getValue() > parent.getValue()) {
			if(!parent.hasRight()) {
				return parent;
			}else {
				findParent(n, parent.getRight());
			}
		}
		
		System.out.println(n.getValue());
		//return this.root;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree();
		bt.add(5);
		bt.add(7);
		bt.add(3);
		bt.add(8);
		
		
		//bt.printNodes(bt.getRoot());
	}

}
