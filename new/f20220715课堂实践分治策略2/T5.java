/**
 *
 */
package f20220715课堂实践分治策略2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author 柳和(本地)
 *
 */
class Graph {
	private Map<String, LinkedList<String>> adjList = new HashMap<>();

	Graph() {
		adjList.put("A", new LinkedList<>());
		adjList.put("B", new LinkedList<>());
		adjList.put("C", new LinkedList<>());
		adjList.put("D", new LinkedList<>());
		adjList.put("E", new LinkedList<>());
		adjList.put("F", new LinkedList<>());
		addEdge("A", "C");
		addEdge("A", "B");
		addEdge("A", "F");
		addEdge("B", "D");
		addEdge("B", "F");
		addEdge("C", "E");
		addEdge("C", "B");
		addEdge("D", "F");
		addEdge("E", "D");
	}

	void addEdge(String v, String w) {
		LinkedList<String> list = adjList.get(v);
		list.add(w);
	}

	void BFS(String vertex) {
		List<String> visited = new ArrayList<>();
		LinkedList<String> queue = new LinkedList<>();

		visited.add(vertex);
		queue.add(vertex);

		while (queue.size() != 0) {
			// todo: 广度优先遍历，按遍历顺序打印出顶点序列
			String s = queue.poll();
			for (String child : adjList.get(s)) {
				if (!visited.contains(child)) {
					visited.add(child);
					queue.add(child);
				}
			}
			for (String res : visited) {
				System.err.print(res + "——");
			}
		}
	}
}

public class T5 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Graph g = new Graph();
		g.BFS("A");
	}

}
