package gather_����.linked_����;

import gather_����.node_�ڵ�.Node;

public class Linked_merge<T extends Comparable<T>> {
	public Node<T> head;// ͷָ��

	public Linked_merge() {
		super();
		head = new Node<>();
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

	public int insert(T element) {
		int i = 0;
		if (element == null) {
			return -1;
		}
		// prev ָ��p��ǰ�����
		Node<T> prev = head, p = prev.next;
		while (p != null && element.compareTo(p.data) >0) {
			prev = p;
			p = p.next;
			i++;
		}
		// ��prev֮��p֮ǰ������ֵΪelement�Ľ��
		prev.next = new Node<>(element, p);
		return i;
	}

	public void printList() {// ������ӡ
		Node<T> p = new Node<>();
		p = head.next;
		while (p != null) {
			System.out.print(p.data + ",");
			p = p.next;
		}
	}
	public int insertJ(T element) {//��������
		int i = 0;
		if (element == null) {
			return -1;
		}
		// prev ָ��p��ǰ�����
		Node<T> prev = head, p = prev.next;
		while (p != null && element.compareTo(p.data) <0) {
			prev = p;
			p = p.next;
			i++;
		}
		// ��prev֮��p֮ǰ������ֵΪelement�Ľ��
		prev.next = new Node<>(element, p);
		return i;
	}


	public Linked_merge<T> merge(Linked_merge<T> other) {//����ϲ�&&��������
		Linked_merge<T> merged = new Linked_merge<>();
		// ����ӵ�һ��Ԫ�ؿ�ʼ����ɨ�衢�Ƚ�
		int i = 0, j = 0;
		// �������н�С��������merged����
		while (i < this.size() && j < other.size()) {

			if (this.get(i).hashCode() < other.get(j).hashCode()) {
				merged.insert(this.get(i));
				i++;

			} else {
				merged.insert(other.get(j));
				j++;

			}

		}

		// ��ʣ�����this��������ʣ���Ԫ��ȫ������merged��
		while (i < this.size()) {
			merged.insert(this.get(i));
			i++;
		}

		// ��ʣ�����other��������ʣ���Ԫ��ȫ������merged��
		while (j < other.size()) {
			merged.insert(other.get(j));
			j++;
		}

		return merged;
	}
	public Linked_merge<T> mergeJ(Linked_merge<T> other) {//����ϲ�&&��������
		Linked_merge<T> merged = new Linked_merge<>();
		// ����ӵ�һ��Ԫ�ؿ�ʼ����ɨ�衢�Ƚ�
		int i = 0, j = 0;
		// �������н�С��������merged����
		while (i < this.size() && j < other.size()) {

			if (this.get(i).hashCode() <other.get(j).hashCode()) {
				merged.insertJ(this.get(i));
				i++;

			} else {
				merged.insertJ(other.get(j));
				j++;

			}

		}

		// ��ʣ�����this��������ʣ���Ԫ��ȫ������merged��
		while (i < this.size()) {
			merged.insert(this.get(i));
			i++;
		}

		// ��ʣ�����other��������ʣ���Ԫ��ȫ������merged��
		while (j < other.size()) {
			merged.insert(other.get(j));
			j++;
		}

		return merged;
	}


}
