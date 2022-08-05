/**
 * 
 */
package ��ϰ;

import java.util.Arrays;

/**
 * @author ����(����)
 *
 */
public class Color001 {

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
			       //���ڽڵ� ��ײɫ���   
                   for (int i = 0; i < graph.length; i++) {//ָ��iָʾ�����������ϰ
					if(graph[idx][i]==1&&solution[i]==color) {//����������ϵ(���̶�Ӧλ����ֵΪ1)������ɫ��ͬ
						return false;
					}
				}
                      return true;
		}

		/**
		 * �ҵ�һ����ɫ����
		 * 
		 * @param graph    ͼ
		 * @param n        ������
		 * @param m        ��ɫ����
		 * @param solution ��ɫ����
		 * @param idx      ��ǰ�����±�
		 * @return �Ƿ��ҵ�����
		 */
		public static boolean coloring(int[][] graph, int n, int m, int[] solution, int idx) {
                 if(n==idx) {
                	 return true;
                 }
			// ������ɫ����
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
			// TODO �Զ����ɵķ������
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

