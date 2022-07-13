package tree_��.BinaryTree_������;

public interface BinaryTreeI<T> {
	public boolean idEmpty();// �ж����Ƿ�Ϊ��

	public int count();// �������Ľڵ����

	public int height();// �������ĸ߶�

	public int childCount(BinaryNode<T> t);// ����T�ڵ�ĺ��Ӹ���

	public void preOrder();// �������

	public void postOrder();// �������

	public void levelOrder();// ��α���
	//���ҽڵ�
		public BinaryNode<?> find(int key);
		//�����½ڵ�
		public boolean insert(int data);
		//�������ֵ
		public BinaryNode<?> findMax();
		//������Сֵ
		public BinaryNode<?> findMin();
}
