/**
 * 
 */
package ��ϰ;

/**
 * @author ����(����)
 *
 */
public class Color001a {

	/**
	 * @param args
	 */
	/**
	 * ����Ƿ������ɫ
	 * 
	 * @param graph    ͼ
	 * @param n        ������
	 * @param solution ��ɫ����
	 * @param idx      ��ǰ�����±�
	 * @param color    ҪͿ����ɫ
	 * @return �Ƿ������ɫ
	 */
	public static boolean isValid(int[][] graph, int n, int[] solution, int idx, int color) {
		for (int i = 0; i < graph.length; i++) {
			if (graph[idx][i] == 1 && solution[i] == color) {
				return false;
			}
		}
		return true;
	}

	/**
	 * �ҵ�������ɫ����
	 * 
	 * @param graph    ͼ
	 * @param n        ������
	 * @param m        ��ɫ����
	 * @param solution ��ɫ����
	 * @param idx      ��ǰ�����±�
	 */
	public static void coloring(int[][] graph, int n, int m, int[] solution, int idx) {
		if (n == idx) {
			
			return;
		}
		// ������ɫ����
		for (int color = 1; color <= m; color++) {
			if (isValid(graph, n, solution, idx, color)) {
				solution[idx] = color;
				coloring(graph, n, m, solution, idx + 1);
				solution[idx] = 0;
			}

		}

	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[][] graph = { { 0, 1, 0, 0, 0, 1, 1 }, { 1, 0, 1, 0, 0, 0, 7 }, { 0, 1, 0, 1, 0, 0, 1 },
				{ 0, 0, 1, 0, 1, 1, 0 }, { 0, 0, 0, 1, 0, 1, 0 }, { 1, 0, 0, 1, 1, 0, 1 }, { 1, 1, 1, 0, 0, 1, 0 }, };
		int n = graph.length;
		int m = 3;
		int[] solution = new int[n];

		coloring(graph, n, m, solution, 0);
	}

}
