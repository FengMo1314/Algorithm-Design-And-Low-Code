/**
 * 
 */
package 练习;

import java.util.Arrays;

/**
 * @author 柳和(本地)
 *
 */
public class Color001 {

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
			       //相邻节点 无撞色情况   
                   for (int i = 0; i < graph.length; i++) {//指针i指示与其他点的练习
					if(graph[idx][i]==1&&solution[i]==color) {//两个点有联系(棋盘对应位置数值为1)并且颜色相同
						return false;
					}
				}
                      return true;
		}

		/**
		 * 找到一个着色方案
		 * 
		 * @param graph    图
		 * @param n        顶点数
		 * @param m        颜色种类
		 * @param solution 着色方案
		 * @param idx      当前顶点下标
		 * @return 是否找到方案
		 */
		public static boolean coloring(int[][] graph, int n, int m, int[] solution, int idx) {
                 if(n==idx) {
                	 return true;
                 }
			// 遍历颜色种类
			for (int color = 1; color <= m; color++) {
				if(isValid(graph, n, solution, idx, color)) {
					solution[idx]=color;
					if(coloring(graph, n, m, solution, idx+1)) {
						return true;
					}
					solution[idx]=0;
				}

			}

			return false;
		}

		public static void main(String[] args) {
			// TODO 自动生成的方法存根
			int[][] graph = { 
					{ 0, 1, 0, 0, 0, 1, 1 }, 
					{ 1, 0, 1, 0, 0, 0, 1 },
					{ 0, 1, 0, 1, 0, 0, 1 },
					{ 0, 0, 1, 0, 1, 1, 0 },
					{ 0, 0, 0, 1, 0, 1, 0 },
					{ 1, 0, 0, 1, 1, 0, 1 },
					{ 1, 1, 1, 0, 0, 1, 0 }, 
					};
			int n = graph.length;
			int m = 3;
			int[] solution = new int[n];

			boolean solved = coloring(graph, n, m, solution, 0);
			if (!solved) {
				System.out.println("not exist");
			} else {
				System.out.println(Arrays.toString(solution));
			}
		}

	}

