/**
 *
 */
package unit_4_1_Assignment_rj0522;

import java.util.LinkedList;

import tree_��.BinaryTree_������.BinaryNode;

/**
 * @author ����(����)
 *
 */
public class T34 {

	/**
	 * @param args
	 */
	/*
	 * ��α������������ǵݹ飩
	 */

	public void PrintBinaryTreeLayerUnrecur(BinaryNode<Integer> root) {
		LinkedList<BinaryNode<Integer>> queue = new LinkedList<>();
		BinaryNode<Integer> p;
		queue.push(root);
		while (!queue.isEmpty()) {
			p = queue.removeFirst();
			System.out.print(p.data);
			if (p.lchild != null)
				queue.addLast(p.lchild);
			if (p.rchild != null)
				queue.addLast(p.rchild);
		}
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new T34().PrintBinaryTreeLayerUnrecur(null);
	}

}
