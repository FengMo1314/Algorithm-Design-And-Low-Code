package tree_树.BinaryTree_二叉树;

public interface BinaryTreeI<T> {
	public boolean idEmpty();// 判断树是否为空

	public int count();// 返回树的节点个数

	public int height();// 返回树的高度

	public int childCount(BinaryNode<T> t);// 返回T节点的孩子个数

	public void preOrder();// 先序遍历

	public void postOrder();// 后序遍历

	public void levelOrder();// 层次遍历
	//查找节点
		public BinaryNode<?> find(int key);
		//插入新节点
		public boolean insert(int data);
		//查找最大值
		public BinaryNode<?> findMax();
		//查找最小值
		public BinaryNode<?> findMin();
}
