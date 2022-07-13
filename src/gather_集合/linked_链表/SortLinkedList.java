/**
 *
 */
package gather_����.linked_����;

import gather_����.node_�ڵ�.Node;

/**
 * @author ����(����) ��������
 */
public class SortLinkedList<T extends Comparable<T>> {
	public Node<T> head;// ͷָ��

	public SortLinkedList() {
		super();
		head = new Node<>();
	}

	public SortLinkedList(Node<T> head) {
		super();
		this.head = head;
	}

	public T get(int index) {
		Node<T> p = this.head.next;
		// ����������Ѱ��a(i)
		for (int i = 0; p != null && i < index; i++) {
			p = p.next;
		}

		// ��pָ��a(i)��������dataֵ
		return (index >= 0 && p != null) ? p.data : null;
	}

	public void set(int index, T element) {
		throw new UnsupportedOperationException();
	}

	public int size() {// ���ϳ���
		Node<T> p = this.head.next;
		int n = 0;
		while (p != null) {
			n++;
			p = p.next;
		}
		return n;
	}

	public int insert(T element) {
		int i = 0;
		if (element == null) {
			return -1;
		}
		// prev ָ��p��ǰ�����
		Node<T> prev =head, p = prev.next;
		while (p != null && element.compareTo(p.data) > 0) {
			prev = p;
			p= p.next;
			i++;
		}
		// ��prev֮��p֮ǰ������ֵΪelement�Ľ��
		prev.next = new Node<>(element,p);
		return i;
	}

	public T remove(int index) {// ɾ��ָ���±������
		Node<T> p = this.head;
		int i = 0;
		while (p != null && i < index) {
			p = p.next;
			i++;
		}

		if (p.next != null && i == index) {
			Node<T> s = p.next;
			T old = s.data;
			p.next = s.next;
			s.data = null;
			s.next = null;
//	            T old = p.next.data;
//	            p.next = p.next.next;
			return old;
		} else {
			return null;
		}
	}

	public boolean isEmpty() {// �жϱ��Ƿ�Ϊ��
		return this.head.next == null;
	}

	public void printList() {// ������ӡ
		Node<T> p = new Node<>();
		p = head.next;
		while (p != null) {
			System.out.print(p.data + ",");
			p = p.next;
		}
	}

	public int indexOf(T element) {
		Node<T> p = this.head;
		int i = 0;
		while (p.next != null) {
			p = p.next;
			if (p.data.equals(element)) {
				return i;
			}
			i++;
		}
		return -1;
	}

}
