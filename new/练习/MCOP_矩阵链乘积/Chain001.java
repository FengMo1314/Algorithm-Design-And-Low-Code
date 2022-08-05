/**
 *
 */
package ��ϰ.MCOP_�������˻�;

/**
 * @author ����(����)
 *
 */
public class Chain001 {

	/**
	 * @param args
	 */
	/**
	 * ����������ٵ���˴���
	 *
	 * @param p ������
	 * @param i ��߽�
	 * @param j �ұ߽�
	 * @return ���ٵ���˴���
	 */
	// todo: �õݹ������������ٵ���˴���
	public static int matrixChain(int[] p, int i, int j) {
		if (i == j) {// ��i==jʱ��ͬһ������Ҫ���
			return 0;
		}
		int min = 999999999;
		for (int k = i; k < j; k++) {
			int left = matrixChain(p, i, k);
			int right = matrixChain(p, k + 1, j) + p[i - 1] * p[k] * p[j];
			int q = left + right;
			if (q < min) {
				min = q;
			}
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[] matrices = new int[] { 40, 20 };
		System.out.println(matrixChain(matrices, 1, matrices.length - 1) == 0);

		matrices = new int[] { 35, 15, 5, 10, 20 };
		System.out.println(matrixChain(matrices, 1, matrices.length - 1) == 7125);

		matrices = new int[] { 40, 20, 30, 10, 30 };
		System.out.println(matrixChain(matrices, 1, matrices.length - 1) == 26000);
	}

}
