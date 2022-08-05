/**
 *
 */
package 练习.MatrixProduct_矩阵乘法与Strassen和幂;

/**
 * @author 柳和(本地)
 *
 */
public class Power009 {

	/**
	 * @param args
	 */
	public static int[][] strassen(int[][] m1, int[][] m2) {
		int n = m1.length;
		int[][] result = new int[n][n];

		if (n == 1) {
			result[0][0] = m1[0][0] * m2[0][0];
		} else {
			// todo: 分割矩阵 A11~A22, B11~B22
			int[][] A11 = Power006.matrixSplit(m1, 0, n / 2 - 1, 0, n / 2 - 1);
			int[][] A12 = Power006.matrixSplit(m1, 0, n / 2 - 1, n / 2, n - 1);
			int[][] A21 = Power006.matrixSplit(m1, n / 2, n - 1, 0, n / 2 - 1);
			int[][] A22 = Power006.matrixSplit(m1, n / 2, n - 1, n / 2, n - 1);
			int[][] B11 = Power006.matrixSplit(m2, 0, n / 2 - 1, 0, n / 2 - 1);
			int[][] B12 = Power006.matrixSplit(m2, 0, n / 2 - 1, n / 2, n - 1);
			int[][] B21 = Power006.matrixSplit(m2, n / 2, n - 1, 0, n / 2 - 1);
			int[][] B22 = Power006.matrixSplit(m2, n / 2, n - 1, n / 2, n - 1);
			// todo: 生成子问题
			int[][] M1 = strassen(A11, Power008.matrixSub(B12, B22));
			int[][] M2 = strassen(Power008.matrixAdd(A11, A12), B22);
			int[][] M3 = strassen(Power008.matrixAdd(A21, A22), B11);
			int[][] M4 = strassen(A22, Power008.matrixSub(B21, B11));
			int[][] M5 = strassen(Power008.matrixAdd(A11, A22), Power008.matrixAdd(B11, B22));
			int[][] M6 = strassen(Power008.matrixSub(A12, A22), Power008.matrixAdd(B21, B22));
			int[][] M7 = strassen(Power008.matrixSub(A11, A21), Power008.matrixAdd(B11, B12));
			// todo: 生成中间矩阵
			int[][] C11 = Power008.matrixAdd(Power008.matrixSub(Power008.matrixAdd(M5, M4), M2), M6);
			int[][] C12 = Power008.matrixAdd(M1, M2);
			int[][] C21 = Power008.matrixAdd(M3, M4);
			int[][] C22 = Power008.matrixSub(Power008.matrixSub(Power008.matrixAdd(M5, M1), M3), M7);
			// todo: 合成矩阵
			Power007.matrixJoin(C11, result, 0, 0);
			Power007.matrixJoin(C12, result, 0, n / 2);
			Power007.matrixJoin(C21, result, n / 2, 0);
			Power007.matrixJoin(C22, result, n / 2, n / 2);
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[][] A = { { 1, 2, 3, 4 }, { 4, 3, 0, 1 }, { 5, 6, 1, 1 }, { 0, 2, 5, 6 } };

		int[][] B = { { 1, 0, 5, 1 }, { 1, 2, 0, 2 }, { 0, 3, 2, 3 }, { 1, 2, 1, 2 } };
		int[][] C = strassen(A, B);
		System.out.println(C[0][0] == 7);
		System.out.println(C[1][2] == 21);
		System.out.println(C[2][2] == 28);
		System.out.println(C[3][3] == 31);
	}

}
