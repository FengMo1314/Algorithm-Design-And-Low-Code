/**
 *
 */
package unit_2_2_Assignment_rj0509;

import java.util.Scanner;

import gather_����.linked_����.SortLinkedList;

/**
 * @author ����(����)
 *
 */
public class T32 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner sc = new Scanner(System.in);
		SortLinkedList<Integer> sll = new SortLinkedList<>();
		for (int i = 0; i < 10; i++) {
			System.out.println("������10��ֵ�����ǵ�"+(i+1)+"��:");
			sll.insert(sc.nextInt());
		}
		System.out.println("��������");
		sll.printList();
		sc.close();
	}

}
