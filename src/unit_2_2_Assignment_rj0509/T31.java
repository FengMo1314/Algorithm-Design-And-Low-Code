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
public class T31 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> lklist = new LinkedList<>();
		for (int i = 0; i < 10; i++) {
			System.out.println("�����10���������ǵ�" + (i + 1) + "����");
			lklist.insert(sc.nextInt());
		}
		System.out.println("������Ҫɾ��������");
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
		System.out.println("��ɾ���ڵ����" + sum + "ʣ������:");
		lklist.printList();
	}
}
