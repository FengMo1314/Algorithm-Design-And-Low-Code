/**
 * 
 */
package ��ϰ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author ����(����)
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

		addEdge("A", "C");
		addEdge("A", "D");
		addEdge("B", "A");
		addEdge("C", "E");
		addEdge("D", "B");
		addEdge("D", "E");
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
			// todo: ������ȱ�����������˳���ӡ����������
			String s = queue.poll();
//			for (int i = 0; i < adjList.get(s).size(); i++) {
//				if (!visited.contains(adjList.get(s).poll())) {
//					visited.addAll(adjList.get(s));
//					queue.addAll(adjList.get(s));
//					System.err.println(adjList.get(s));
//				}
//			}
			for(String child:adjList.get(s)) {
				if(!visited.contains(child)) {
					visited.add(child);
					queue.add(child);
					System.out.println(child);
				}
			}
		}
	}
}

public class Bfs002 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Graph g = new Graph();
		g.BFS("A");
	}

}
