/**
 * 
 */
package 练习;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author 柳和(本地)
 *
 */
public class Tsp001 {

	/**
	 * @param args
	 */
	/**
     * 最短回路
     */
    public static int best = Integer.MAX_VALUE;
    /**
     * 最短回路方案
     */
    public static Integer[] bestSolution;

    /**
     * 判断下一个顶点是否可以加入路线
     * @param graph 图
     * @param v 顶点被访问记录
     * @param curVertex 当前所在顶点
     * @param i 下一个顶点
     * @return 下一个顶点是否可以加入路线
     */
    // todo: 判断下一个顶点是否可以加入路线
    public static boolean isValid(int[][] graph, int[] v, int curVertex, int i) {
        if(v[i]!=0) {
        	return false;
        }
        return true;
    }

    /**
     * 检查是否满足后续长度的下界
     * @param graph 图
     * @param v 顶点被访问记录
     * @param curVertex 当前所在顶点
     * @param n 顶点个数
     * @param curDist 当前路线长度
     * @return 是否满足后续长度的下界
     */
    // todo: 检查是否满足后续长度的下界
    public static boolean checkBranch(int[][] graph, int[] v, int curVertex, int n, int curDist) {
        if(n==curDist) {
        	return true;
        }
        for (int i = 0; i <n; i++) {
			if(isValid(graph, v, curVertex, i)) {
				curDist+=graph[curVertex][i];
				v[i]=1;
				if(checkBranch(graph, v, curVertex+1, n, curDist)) {
					return true;
				}
			}
		}
        return false;
    }

    /**
     * 利用回溯 + 分支限界策略，找到最短回路
     * @param graph 图
     * @param v 顶点被访问记录
     * @param curVertex 当前所在顶点
     * @param n 顶点个数
     * @param count 当前被访问过的顶点个数
     * @param curDist 当前路线长度
     * @param curSolution 当前路线方案
     */
    // todo: 利用回溯 + 分支限界策略，找到最短回路
    public static void tsp(int[][] graph, int[] v, int curVertex, int n, int count, int curDist, Stack<Integer> curSolution) {

        if (count == n && graph[curVertex][0] > 0) {
            int tmp = curDist + graph[curVertex][0];
            if (best > tmp) {
                best = tmp;
                bestSolution = curSolution.toArray(new Integer[0]);
            }
            return;
        }


    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

        int[][] graph = {
                {0, 5, 9, 4},
                {5, 0, 13, 2},
                {9, 13, 0, 7},
                {4, 2, 7, 0}
        };
        int n = graph.length;
        int[] v = new int[n];
        v[0] = 1;
        Stack<Integer> curSolution = new Stack<>();
        curSolution.push(0);

        // Find the minimum weight Hamiltonian Cycle
        tsp(graph, v, 0, n, 1, 0, curSolution);

        // ans is the minimum weight Hamiltonian Cycle
        System.out.println(best);
        System.out.println(Arrays.toString(bestSolution));

	}

}
