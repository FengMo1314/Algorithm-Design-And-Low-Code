/**
 *
 */
package unit_2_2_Assignment_rj0509;

import java.util.Scanner;

import gather_����.linked_����.LinkedList;

/**
 * @author ����(����)
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
		// TODO �Զ����ɵĹ��캯�����
		int i = start;
		list.printList();
		while (list.size() > 1) {
			i = (i + distance - 1) % list.size();
			System.out.println("ɾ����Ԫ�أ�" + list.remove(i).toString() + "ʣ�ࣺ");
			list.printList();
		}
		System.out.println("��������ﷸ�ǣ�" + list.get(0));
	}
	public void getList() {
		sc = new Scanner(System.in);
		for (int i = 0; i <10; i++) {
			list.insert(sc.nextInt());
		}

	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		T35 t=new T35();
		t.getList();
		t.must(0,2);
	}

}
