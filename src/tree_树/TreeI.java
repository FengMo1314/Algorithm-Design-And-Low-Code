package tree_��;

public interface TreeI<T> {
  public boolean idEmpty();//�ж����Ƿ�Ϊ��
  public int count();//�������Ľڵ����
  public int height();//�������ĸ߶�
  public int childCount(TreeNode<T> t);//����T�ڵ�ĺ��Ӹ���
  public void preOrder();//�������
  public void postOrder();//�������
  public void levelOrder();//��α���
  public TreeNode<T> getChild(TreeNode<T> t,int i);//����t�ڵ�����һ�����ӽڵ�
  public TreeNode<T> getLastSibling(TreeNode<T> t);//����T�ڵ����һ���ֵܽڵ�
  public TreeNode<T> getParent(TreeNode<T> node);//����node�ĸ��ڵ�
  public TreeNode<T> search(T x);//���Ҳ�����Ԫ��x�Ľڵ�

}
