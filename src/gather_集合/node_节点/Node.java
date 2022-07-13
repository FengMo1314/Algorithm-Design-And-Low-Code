package gather_集合.node_节点;



public class Node<T> {
	/* 单链表节点类 */
	/** 数据域，存储数据元素 */
	public T data;

	/** 地址域，引用后续结点 */
	public Node<T> next;

	/**
	 * 由指定的两个域来构造结点
	 *
	 * @param data 数据域
	 * @param next 地址域
	 */
	public Node(T data, Node<T> next) {
		this.data = data;
		this.next = next;
	}

	/**
	 * 空构造
	 */
	public Node() {
		this(null, null);
	}

	/**
	 * 返回结点数据域的描述字符串
	 *
	 * @return 数据域描述字符串
	 */
	@Override
	public String toString() {
		return this.data.toString();
	}

}
