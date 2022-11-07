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
public class T31 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> lklist = new LinkedList<>();
		for (int i = 0; i < 10; i++) {
			System.out.println("请键入10个数据这是第" + (i + 1) + "个：");
			lklist.insert(sc.nextInt());
		}
		System.out.println("键入需要删除的数据");
		int n = sc.nextInt();
		sc.close();
		int sum = 0;
		for (int i = 0; i < lklist.size(); i++) {
			int index = lklist.indexOf(n);
			if (index != -1) {
				lklist.remove(index);
				sum++;
			}
		}
		System.out.println("被删除节点个数" + sum + "剩余数据:");
		lklist.printList();
	}
}
