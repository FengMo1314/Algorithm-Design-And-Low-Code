/**
 *
 */
package unit_2_2_Assignment_rj0509;

import java.util.Scanner;

import gather_集合.linked_链表.LinkedList;

/**
 * @author 柳和(本地)
 *
 */
public class T35 {

	/**
	 * @param args
	 */

	LinkedList<Integer> list = new LinkedList<>();
	public T35() {
		super();
	}

	private Scanner sc;
	public void must(int start, int distance) {
		// TODO 自动生成的构造函数存根
		int i = start;
		list.printList();
		while (list.size() > 1) {
			i = (i + distance - 1) % list.size();
			System.out.println("删除的元素：" + list.remove(i).toString() + "剩余：");
			list.printList();
		}
		System.out.println("被赦免的罪犯是：" + list.get(0));
	}
	public void getList() {
		sc = new Scanner(System.in);
		for (int i = 0; i <10; i++) {
			list.insert(sc.nextInt());
		}

	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		T35 t=new T35();
		t.getList();
		t.must(0,2);
	}

}
