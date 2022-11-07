/**
 *
 */
package unit_2_2_Assignment_rj0509;

import java.util.Scanner;

import gather_集合.linked_链表.SortLinkedList;

/**
 * @author 柳和(本地)
 *
 */
public class T32 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		SortLinkedList<Integer> sll = new SortLinkedList<>();
		for (int i = 0; i < 10; i++) {
			System.out.println("请输入10个值，这是第"+(i+1)+"个:");
			sll.insert(sc.nextInt());
		}
		System.out.println("最终数据");
		sll.printList();
		sc.close();
	}

}
