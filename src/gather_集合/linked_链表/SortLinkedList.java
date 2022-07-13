/**
 *
 */
package gather_集合.linked_链表;

import gather_集合.node_节点.Node;

/**
 * @author 柳和(本地) 有序单链表
 */
public class SortLinkedList<T extends Comparable<T>> {
	public Node<T> head;// 头指针

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
		// 遍历单链表，寻找a(i)
		for (int i = 0; p != null && i < index; i++) {
			p = p.next;
		}

		// 若p指向a(i)，返回其data值
		return (index >= 0 && p != null) ? p.data : null;
	}

	public void set(int index, T element) {
		throw new UnsupportedOperationException();
	}

	public int size() {// 集合长度
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
		// prev 指向p的前驱结点
		Node<T> prev =head, p = prev.next;
		while (p != null && element.compareTo(p.data) > 0) {
			prev = p;
			p= p.next;
			i++;
		}
		// 在prev之后p之前，插入值为element的结点
		prev.next = new Node<>(element,p);
		return i;
	}

	public T remove(int index) {// 删除指定下标的数据
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

	public boolean isEmpty() {// 判断表是否为空
		return this.head.next == null;
	}

	public void printList() {// 遍历打印
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
