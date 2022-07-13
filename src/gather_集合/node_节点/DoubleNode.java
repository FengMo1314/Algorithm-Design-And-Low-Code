package gather_����.node_�ڵ�;

public class DoubleNode<T> extends Node<T>{
	/*˫����ڵ���*/
	  /** �����򣬴洢����Ԫ�� */
    public T data;

    /** ��ַ�����ú������ */
    public DoubleNode<T> next;

    /** ��ַ������ǰ����� */
    public DoubleNode<T> prev;

    /**
     * ��ָ������������
     * @param data ������
     * @param next ��ַ�����ú������
     * @param prev ��ַ������ǰ�����
     */
    public DoubleNode(T data, DoubleNode<T> next, DoubleNode<T> prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    /**
     * �չ���
     */
    public DoubleNode() {
        this(null, null, null);
    }

    /**
     * ���ؽ��������������ַ���
     * @return �����������ַ���
     */
    @Override
    public String toString() {
        return this.data.toString();
    }
}

