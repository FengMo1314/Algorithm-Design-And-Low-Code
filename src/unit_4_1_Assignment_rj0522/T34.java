/**
 *
 */
package unit_4_1_Assignment_rj0522;

import java.util.LinkedList;

import tree_树.BinaryTree_二叉树.BinaryNode;

/**
 * @author 柳和(本地)
 *
 */
public class T34 {

	/**
	 * @param args
	 */
	/*
	 * 层次遍历二叉树（非递归）
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
		// TODO 自动生成的方法存根
		new T34().PrintBinaryTreeLayerUnrecur(null);
	}

}
