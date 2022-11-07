/**
 *
 */
package 练习.MCOP_矩阵链乘积;

/**
 * @author 柳和(本地)
 *
 */
public class Chain002 {

	/**
	 * @param args
	 */
	/**
	 * 求矩阵链最少的相乘次数
	 *
	 * @param p 矩阵链
	 * @param n 链长
	 * @return 最少相乘次数
	 */
	// todo: 用二维动态规划求解矩阵链最少的相乘次数
	public static int matrixChain(int[] p, int n) {
		int[][] m = new int[n][n];
		n = p.length - 1;
		for (int r = 2; r <= n; r++) {// 矩阵链长度
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
		// TODO 自动生成的方法存根
		int[] matrices = new int[] { 40, 20 };
		System.out.println(matrixChain(matrices, matrices.length) == 0);

		matrices = new int[] { 35, 15, 5, 10, 20 };
		System.out.println(matrixChain(matrices, matrices.length) == 7125);

		matrices = new int[] { 40, 20, 30, 10, 30 };
		System.out.println(matrixChain(matrices, matrices.length) == 26000);
	}

}
