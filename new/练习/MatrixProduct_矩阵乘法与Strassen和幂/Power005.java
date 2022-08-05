/**
 *
 */
package 练习.MatrixProduct_矩阵乘法与Strassen和幂;

/**
 * @author 柳和(本地)
 *
 */
public class Power005 {

	/**
	 * @param args
	 */
	public static int[][] identity(int rows, int cols) {
		int[][] id = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (i == j) {
					id[i][j] = 1;
				}
			}
		}
		return id;
	}

	public static int[][] matrixPower(int[][] matrix, int exp) {
		if (exp == 0) {
			return identity(matrix.length, matrix[0].length);
		}
		if (exp == 1) {
			return matrix;
		}
		// todo: 利用分治策略计算矩阵的幂乘
		if (exp % 2 == 0) {
			int[][] temp = matrixPower(matrix, exp / 2);
			return Power004.matrixMultiply(temp, temp);
		} else {
			int[][] temp = matrixPower(matrix, (exp - 1) / 2);
			int[][] tem = Power004.matrixMultiply(temp, temp);
			return Power004.matrixMultiply(tem, matrix);
		}
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[][] matrix = new int[][] { { 1, -1 }, { 1, 0 } };
		int[][] result = matrixPower(matrix, 4);
		System.out.println(result[0][0] == -1);
		System.out.println(result[1][0] == -1);
		System.err.println("-------------------");
		int t = 0;
		for (int[] element : result) {
			for (int j = 0; j < result.length; j++) {
				t++;
				System.out.print(element[j] + " ");
				if (t % result.length == 0) {
					System.out.println();
				}
			}
		}
	}
}
