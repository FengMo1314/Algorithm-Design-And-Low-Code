package gather_集合.linked_链表;

import gather_集合.node_节点.Node;

public class Linked_merge<T extends Comparable<T>> {
	public Node<T> head;// 头指针

	public Linked_merge() {
		super();
		head = new Node<>();
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
		Node<T> p = this.head.next;

		// 遍历单链表，寻找a(i)
		for (int i = 0; p != null && i < index; i++) {
			p = p.next;
		}

		if (index >= 0 && p != null) {
			p.data = element;
		}
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
		Node<T> prev = head, p = prev.next;
		while (p != null && element.compareTo(p.data) >0) {
			prev = p;
			p = p.next;
			i++;
		}
		// 在prev之后p之前，插入值为element的结点
		prev.next = new Node<>(element, p);
		return i;
	}

	public void printList() {// 遍历打印
		Node<T> p = new Node<>();
		p = head.next;
		while (p != null) {
			System.out.print(p.data + ",");
			p = p.next;
		}
	}
	public int insertJ(T element) {//降序排列
		int i = 0;
		if (element == null) {
			return -1;
		}
		// prev 指向p的前驱结点
		Node<T> prev = head, p = prev.next;
		while (p != null && element.compareTo(p.data) <0) {
			prev = p;
			p = p.next;
			i++;
		}
		// 在prev之后p之前，插入值为element的结点
		prev.next = new Node<>(element, p);
		return i;
	}


	public Linked_merge<T> merge(Linked_merge<T> other) {//链表合并&&升序排列
		Linked_merge<T> merged = new Linked_merge<>();
		// 两表从第一个元素开始依次扫描、比较
		int i = 0, j = 0;
		// 将两表中较小的数插入merged表中
		while (i < this.size() && j < other.size()) {

			if (this.get(i).hashCode() < other.get(j).hashCode()) {
				merged.insert(this.get(i));
				i++;

			} else {
				merged.insert(other.get(j));
				j++;

			}

		}

		// 若剩余的是this表，将表中剩余的元素全部插入merged表
		while (i < this.size()) {
			merged.insert(this.get(i));
			i++;
		}

		// 若剩余的是other表，将表中剩余的元素全部插入merged表
		while (j < other.size()) {
			merged.insert(other.get(j));
			j++;
		}

		return merged;
	}
	public Linked_merge<T> mergeJ(Linked_merge<T> other) {//链表合并&&降序排列
		Linked_merge<T> merged = new Linked_merge<>();
		// 两表从第一个元素开始依次扫描、比较
		int i = 0, j = 0;
		// 将两表中较小的数插入merged表中
		while (i < this.size() && j < other.size()) {

			if (this.get(i).hashCode() <other.get(j).hashCode()) {
				merged.insertJ(this.get(i));
				i++;

			} else {
				merged.insertJ(other.get(j));
				j++;

			}

		}

		// 若剩余的是this表，将表中剩余的元素全部插入merged表
		while (i < this.size()) {
			merged.insert(this.get(i));
			i++;
		}

		// 若剩余的是other表，将表中剩余的元素全部插入merged表
		while (j < other.size()) {
			merged.insert(other.get(j));
			j++;
		}

		return merged;
	}


}
