/**
 *
 */
package 练习.BreadthFirstSearc_广度优先搜索;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author 柳和(本地)
 *
 */
public class Bfs001 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Queue<String> queue = new LinkedList<>();
		queue.add("A");
		queue.add("B");
		queue.add("C");
		queue.add("D");
		queue.add("E");

		while (queue.size() > 0) {
			// todo: 获取队列中的元素，并打印其值
			System.out.println("依次为：" + queue.poll());
		}
	}

}
