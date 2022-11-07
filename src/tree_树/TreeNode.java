/**
 *
 */
package tree_树;

/**
 * @author 柳和(本地)
 *
 */
public class TreeNode<T> {
public T data;//数据域
public TreeNode<T> child;//孩子节点
public TreeNode<T> sibling;//兄弟节点
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
