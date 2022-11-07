/**
 *
 */
package 练习;

/**
 * @author 柳和(本地)
 *
 */
public class Color001a {

	/**
	 * @param args
	 */
	/**
	 * 检查是否可以着色
	 *
	 * @param graph    图
	 * @param n        顶点数
	 * @param solution 着色方案
	 * @param idx      当前顶点下标
	 * @param color    要涂的颜色
	 * @return 是否可以着色
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
	 * 找到所有着色方案
	 *
	 * @param graph    图
	 * @param n        顶点数
	 * @param m        颜色种类
	 * @param solution 着色方案
	 * @param idx      当前顶点下标
	 */
	public static void coloring(int[][] graph, int n, int m, int[] solution, int idx) {
		if (n == idx) {

			return;
		}
		// 遍历颜色种类
		for (int color = 1; color <= m; color++) {
			if (isValid(graph, n, solution, idx, color)) {
				solution[idx] = color;
				coloring(graph, n, m, solution, idx + 1);
				solution[idx] = 0;
			}

		}

	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[][] graph = { { 0, 1, 0, 0, 0, 1, 1 }, { 1, 0, 1, 0, 0, 0, 7 }, { 0, 1, 0, 1, 0, 0, 1 },
				{ 0, 0, 1, 0, 1, 1, 0 }, { 0, 0, 0, 1, 0, 1, 0 }, { 1, 0, 0, 1, 1, 0, 1 }, { 1, 1, 1, 0, 0, 1, 0 }, };
		int n = graph.length;
		int m = 3;
		int[] solution = new int[n];

		coloring(graph, n, m, solution, 0);
	}

}
