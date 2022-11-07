package tree_树;

public interface Tree<T> {
  public boolean idEmpty();//判断树是否为空
  public int count();//返回树的节点个数
  public int height();//返回树的高度
  public int childCount(TreeNode<T> t);//返回T节点的孩子个数
  public void preOrder();//先序遍历
  public void postOrder();//后序遍历
  public void levelOrder();//层次遍历
  public TreeNode<T> getChild(TreeNode<T> t,int i);//返回t节点的最后一个孩子节点
  public TreeNode<T> getLastSibling(TreeNode<T> t);//返回T节点最后一个兄弟节点
  public TreeNode<T> getParent(TreeNode<T> node);//返回node的父节点
  public TreeNode<T> search(T x);//查找并返回元素x的节点

}
