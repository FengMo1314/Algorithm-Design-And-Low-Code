/**
 *
 */
package unit_4_1_Assignment_rj0522;

import tree_��.BinaryTree_������.BinaryNode;

/**
 * @author ����(����)
 *
 */
public class T33 {

	/**
	 * @param args
	 */
	int TreeDeep(BinaryNode<String> t) {
		  if (t== null) {
	            return 0;
	        }
	        // ���������������
	        int left = TreeDeep(t.lchild);
	        // ���������������
	        int right = TreeDeep(t.rchild);
	        // ��root�����=·������������ + 1
	        return left >= right ? (left + 1) : (right + 1);
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new T33().TreeDeep(null);
	}

}
