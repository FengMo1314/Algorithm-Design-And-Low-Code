/**
 *
 */
package tree_��;

/**
 * @author ����(����)
 *
 */
public class TreeNode<T> {
public T data;//������
public TreeNode<T> child;//���ӽڵ�
public TreeNode<T> sibling;//�ֵܽڵ�
public TreeNode(T data, TreeNode<T> child, TreeNode<T> sibling) {
	super();
	this.data = data;
	this.child = child;
	this.sibling = sibling;
}
public TreeNode(T data) {
	super();
	this.data = data;
}
public TreeNode() {
	this(null,null,null);
}

}
