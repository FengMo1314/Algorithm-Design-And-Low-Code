/**
 *
 */
package unit_2_2_Assignment_rj0509;

import java.util.Random;

import gather_����.linked_����.Linked_merge;

/**
 * @author ����(����)
 *
 */
public class T33 {

	/**
	 * @param args
	 */
	static Linked_merge<Integer> sllA = new Linked_merge<>();
	static Linked_merge<Integer>sllB = new Linked_merge<>();
	Random rd = new Random();

	public void getSllA() {
		for (int i = 0; i < 10; i++) {
			int n = rd.nextInt(100) + 2;
			sllA.insert(n);//�������
		}
	}

	public void getSllB() {

		for (int i = 0; i < 10; i++) {
			int n = rd.nextInt(100) + 2;
			sllB.insert(n);//�������
		}
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		T33 t = new T33();
		t.getSllA();
		t.getSllB();
		Linked_merge<Integer> newLM=sllA.mergeJ(sllB);//����ϲ�&&��������
		T33.sllA.printList();
		System.out.println("");
		T33.sllB.printList();
		System.out.println("");
		newLM.printList();
	}

}
