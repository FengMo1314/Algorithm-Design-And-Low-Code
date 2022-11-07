package gather_集合.node_节点;

public class DoubleNode<T> extends Node<T>{
	/*双链表节点类*/
	  /** 数据域，存储数据元素 */
    public T data;

    /** 地址域，引用后续结点 */
    public DoubleNode<T> next;

    /** 地址域，引用前驱结点 */
    public DoubleNode<T> prev;

    /**
     * 由指定域来构造结点
     * @param data 数据域
     * @param next 地址域，引用后续结点
     * @param prev 地址域，引用前驱结点
     */
    public DoubleNode(T data, DoubleNode<T> next, DoubleNode<T> prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    /**
     * 空构造
     */
    public DoubleNode() {
        this(null, null, null);
    }

    /**
     * 返回结点数据域的描述字符串
     * @return 数据域描述字符串
     */
    @Override
    public String toString() {
        return this.data.toString();
    }
}

