/**
 *
 */
package ��ϰ.BreadthFirstSearc_�����������;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ����(����)
 *
 */
public class Bfs001 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Queue<String> queue = new LinkedList<>();
		queue.add("A");
		queue.add("B");
		queue.add("C");
		queue.add("D");
		queue.add("E");

		while (queue.size() > 0) {
			// todo: ��ȡ�����е�Ԫ�أ�����ӡ��ֵ
			System.out.println("����Ϊ��" + queue.poll());
		}
	}

}
