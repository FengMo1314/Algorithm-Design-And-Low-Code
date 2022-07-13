/**
 *
 */
package unit_2_2_Assignment_rj0509;

import java.util.Random;

import gather_集合.linked_链表.Linked_merge;

/**
 * @author 柳和(本地)
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
			sllA.insert(n);//升序添加
		}
	}

	public void getSllB() {

		for (int i = 0; i < 10; i++) {
			int n = rd.nextInt(100) + 2;
			sllB.insert(n);//升序添加
		}
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		T33 t = new T33();
		t.getSllA();
		t.getSllB();
		Linked_merge<Integer> newLM=sllA.mergeJ(sllB);//链表合并&&降序排列
		T33.sllA.printList();
		System.out.println("");
		T33.sllB.printList();
		System.out.println("");
		newLM.printList();
	}

}
