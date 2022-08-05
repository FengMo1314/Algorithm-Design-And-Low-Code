/**
 *
 */
package 练习.MCOP_矩阵链乘积;

/**
 * @author 柳和(本地)
 *
 */
public class Chain001 {

	/**
	 * @param args
	 */
	/**
	 * 求矩阵链最少的相乘次数
	 *
	 * @param p 矩阵链
	 * @param i 左边界
	 * @param j 右边界
	 * @return 最少的相乘次数
	 */
	// todo: 用递归求解矩阵链最少的相乘次数
	public static int matrixChain(int[] p, int i, int j) {
		if (i == j) {// 当i==j时是同一矩阵不需要相乘
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
		// TODO 自动生成的方法存根
		int[] matrices = new int[] { 40, 20 };
		System.out.println(matrixChain(matrices, 1, matrices.length - 1) == 0);

		matrices = new int[] { 35, 15, 5, 10, 20 };
		System.out.println(matrixChain(matrices, 1, matrices.length - 1) == 7125);

		matrices = new int[] { 40, 20, 30, 10, 30 };
		System.out.println(matrixChain(matrices, 1, matrices.length - 1) == 26000);
	}

}
