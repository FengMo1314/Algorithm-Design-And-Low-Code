/**
 *
 */
package tree_��.BinaryTree_������;

import java.util.LinkedList;

/**
 * @author ����(����)
 *
 */
public class BinaryTree<T> implements BinaryTreeI<T>{
	private BinaryNode<Integer> root;
	 /*
     * ���򴴽�������
     * ���أ����ڵ�
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
		// TODO �Զ����ɵķ������
		return root.data==null;
	}

	@Override
	public int count() {
		// TODO �Զ����ɵķ������
		return 0;
	}

	@Override
	public int height() {
		// TODO �Զ����ɵķ������
		return 0;
	}

	@Override
	public int childCount(BinaryNode<T> t) {
		// TODO �Զ����ɵķ������
		return 0;
	}

	@Override
	public void preOrder() {
		// TODO �Զ����ɵķ������

	}

	@Override
	public void postOrder() {
		// TODO �Զ����ɵķ������

	}

	@Override
	public void levelOrder() {
		// TODO �Զ����ɵķ������

	}
	//���ҽڵ�
	@Override
	public BinaryNode<Integer> find(int key) {
		// TODO �Զ����ɵķ������
		BinaryNode<Integer> current = root;
		while(current != null){
			if(current.data > key){//��ǰֵ�Ȳ���ֵ������������
				current = current.lchild;
			}else if(current.data < key){//��ǰֵ�Ȳ���ֵС������������
				current = current.rchild;
			}else{
				return current;
			}
		}
		return null;//������������û�ҵ�������null
	}

	@Override
	public boolean insert(int data) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public BinaryNode<?> findMax() {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public BinaryNode<?> findMin() {
		// TODO �Զ����ɵķ������
		return null;
	}




}
