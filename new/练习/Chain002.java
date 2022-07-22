/**
 * 
 */
package ��ϰ;

/**
 * @author ����(����)
 *
 */
public class Chain002 {

	/**
	 * @param args
	 */
	/**
	 * ����������ٵ���˴���
	 * 
	 * @param p ������
	 * @param n ����
	 * @return ������˴���
	 */
	// todo: �ö�ά��̬�滮�����������ٵ���˴���
	public static int matrixChain(int[] p, int n) {
		int[][] m = new int[n][n];
		n = p.length - 1;
		for (int r = 2; r <= n; r++) {// ����������
			for (int i = 1; i <= n - r + 1; i++) {
				int j = i + r - 1;
				m[i][j] = m[i + 1][j] + p[i - 1] * p[i] * p[j];
				for (int k = i + 1; k <= j - 1; k++) {
					int t = m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j];
					if (t < m[i][j]) {
						m[i][j] = t;
					}
				}
			}
		}
		return m[1][n];
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[] matrices = new int[] { 40, 20 };
		System.out.println(matrixChain(matrices, matrices.length) == 0);

		matrices = new int[] { 35, 15, 5, 10, 20 };
		System.out.println(matrixChain(matrices, matrices.length) == 7125);

		matrices = new int[] { 40, 20, 30, 10, 30 };
		System.out.println(matrixChain(matrices, matrices.length) == 26000);
	}

}
