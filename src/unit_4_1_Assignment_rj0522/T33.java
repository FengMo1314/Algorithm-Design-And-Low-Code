/**
 *
 */
package unit_4_1_Assignment_rj0522;

import tree_树.BinaryTree_二叉树.BinaryNode;

/**
 * @author 柳和(本地)
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
	        // 计算左子树的深度
	        int left = TreeDeep(t.lchild);
	        // 计算右子树的深度
	        int right = TreeDeep(t.rchild);
	        // 树root的深度=路径最长的子树深度 + 1
	        return left >= right ? (left + 1) : (right + 1);
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new T33().TreeDeep(null);
	}

}
