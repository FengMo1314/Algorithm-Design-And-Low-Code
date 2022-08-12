/**
 * 
 */
package ��ϰ;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author ����(����)
 *
 */
public class Tsp001 {

	/**
	 * @param args
	 */
	/**
     * ��̻�·
     */
    public static int best = Integer.MAX_VALUE;
    /**
     * ��̻�·����
     */
    public static Integer[] bestSolution;

    /**
     * �ж���һ�������Ƿ���Լ���·��
     * @param graph ͼ
     * @param v ���㱻���ʼ�¼
     * @param curVertex ��ǰ���ڶ���
     * @param i ��һ������
     * @return ��һ�������Ƿ���Լ���·��
     */
    // todo: �ж���һ�������Ƿ���Լ���·��
    public static boolean isValid(int[][] graph, int[] v, int curVertex, int i) {
        if(v[i]!=0) {
        	return false;
        }
        return true;
    }

    /**
     * ����Ƿ�����������ȵ��½�
     * @param graph ͼ
     * @param v ���㱻���ʼ�¼
     * @param curVertex ��ǰ���ڶ���
     * @param n �������
     * @param curDist ��ǰ·�߳���
     * @return �Ƿ�����������ȵ��½�
     */
    // todo: ����Ƿ�����������ȵ��½�
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
     * ���û��� + ��֧�޽���ԣ��ҵ���̻�·
     * @param graph ͼ
     * @param v ���㱻���ʼ�¼
     * @param curVertex ��ǰ���ڶ���
     * @param n �������
     * @param count ��ǰ�����ʹ��Ķ������
     * @param curDist ��ǰ·�߳���
     * @param curSolution ��ǰ·�߷���
     */
    // todo: ���û��� + ��֧�޽���ԣ��ҵ���̻�·
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
		// TODO �Զ����ɵķ������

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
