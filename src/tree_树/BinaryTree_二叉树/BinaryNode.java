package tree_树.BinaryTree_二叉树;

public class BinaryNode<T> {
	public T data;//
	public BinaryNode<T> lchild,rchild;//链域,分别指左右孩子
	public BinaryNode(T data, BinaryNode<T> lchild, BinaryNode<T> rchild) {
		super();
		this.data = data;
		this.lchild = lchild;
		this.rchild = rchild;
	}
	public BinaryNode() {
	this(null,null,null);
	}
	public BinaryNode(T data) {
		this(data,null,null);
	}


}
