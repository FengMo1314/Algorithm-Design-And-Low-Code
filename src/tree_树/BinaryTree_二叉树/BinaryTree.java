/**
 *
 */
package tree_树.BinaryTree_二叉树;

import java.util.LinkedList;

/**
 * @author 柳和(本地)
 *
 */
public class BinaryTree<T> implements BinaryTreeI<T>{
	private BinaryNode<Integer> root;
	 /*
     * 先序创建二叉树
     * 返回：根节点
     */
    public BinaryNode<T>  creatBinaryPre(LinkedList<T> treeData)
    {
    	BinaryNode<T> root=null;
        T data=treeData.removeFirst();
        if (data!=null)
        {
            root=new BinaryNode<>(data, null, null);
            root.lchild=creatBinaryPre(treeData);
            root.rchild=creatBinaryPre(treeData);
        }
        return root;
    }

	@Override
	public boolean idEmpty() {
		// TODO 自动生成的方法存根
		return root.data==null;
	}

	@Override
	public int count() {
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public int height() {
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public int childCount(BinaryNode<T> t) {
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public void preOrder() {
		// TODO 自动生成的方法存根

	}

	@Override
	public void postOrder() {
		// TODO 自动生成的方法存根

	}

	@Override
	public void levelOrder() {
		// TODO 自动生成的方法存根

	}
	//查找节点
	@Override
	public BinaryNode<Integer> find(int key) {
		// TODO 自动生成的方法存根
		BinaryNode<Integer> current = root;
		while(current != null){
			if(current.data > key){//当前值比查找值大，搜索左子树
				current = current.lchild;
			}else if(current.data < key){//当前值比查找值小，搜索右子树
				current = current.rchild;
			}else{
				return current;
			}
		}
		return null;//遍历完整个树没找到，返回null
	}

	@Override
	public boolean insert(int data) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public BinaryNode<?> findMax() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public BinaryNode<?> findMin() {
		// TODO 自动生成的方法存根
		return null;
	}




}
