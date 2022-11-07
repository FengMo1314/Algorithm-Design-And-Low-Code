package gather_集合.linked_链表;

import gather_集合.node_节点.Node;

public class LinkedList<T> {
	public Node<T> head;// 头指针

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

	public int insert(int index, T element) {// 指定位置插入数据
		if (element == null) {
			throw new NullPointerException("不能插入空对象！");
		}

		Node<T> p = this.head;
		int i = 0;
		// 寻找下标为index-1的结点，即插入位置的前一个结点
		while (p.next != null && i < index) {
			p = p.next;
			i++;
		}

		if (i == index) {
			// 建立新结点 s，数据域为element，地址域为p.next
			Node<T> s = new Node<>(element, p.next);
			// 在p之后插入s
			p.next = s;
			return index;
		} else {
			return -1;
		}
	}

	public int insert(T element) {// 集合尾部插入
		return insert(this.size(), element);
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
