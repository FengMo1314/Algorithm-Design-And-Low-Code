package tree_��.BinaryTree_������;

public class BinaryNode<T> {
	public T data;//
	public BinaryNode<T> lchild,rchild;//����,�ֱ�ָ���Һ���
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
