package gather_����.node_�ڵ�;



public class Node<T> {
	/* ������ڵ��� */
	/** �����򣬴洢����Ԫ�� */
	public T data;

	/** ��ַ�����ú������ */
	public Node<T> next;

	/**
	 * ��ָ������������������
	 *
	 * @param data ������
	 * @param next ��ַ��
	 */
	public Node(T data, Node<T> next) {
		this.data = data;
		this.next = next;
	}

	/**
	 * �չ���
	 */
	public Node() {
		this(null, null);
	}

	/**
	 * ���ؽ��������������ַ���
	 *
	 * @return �����������ַ���
	 */
	@Override
	public String toString() {
		return this.data.toString();
	}

}
