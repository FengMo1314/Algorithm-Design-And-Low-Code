package gather_����.linked_����;

import gather_����.node_�ڵ�.Node;

public class LinkedList<T> {
	public Node<T> head;// ͷָ��

	public LinkedList() {
		super();
		head = new Node<>();
	}

	public LinkedList(Node<T> head) {
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
		Node<T> p = this.head.next;

		// ����������Ѱ��a(i)
		for (int i = 0; p != null && i < index; i++) {
			p = p.next;
		}

		if (index >= 0 && p != null) {
			p.data = element;
		}
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

	public int insert(int index, T element) {// ָ��λ�ò�������
		if (element == null) {
			throw new NullPointerException("���ܲ���ն���");
		}

		Node<T> p = this.head;
		int i = 0;
		// Ѱ���±�Ϊindex-1�Ľ�㣬������λ�õ�ǰһ�����
		while (p.next != null && i < index) {
			p = p.next;
			i++;
		}

		if (i == index) {
			// �����½�� s��������Ϊelement����ַ��Ϊp.next
			Node<T> s = new Node<>(element, p.next);
			// ��p֮�����s
			p.next = s;
			return index;
		} else {
			return -1;
		}
	}

	public int insert(T element) {// ����β������
		return insert(this.size(), element);
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
			System.out.println(p.data + ",");
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
