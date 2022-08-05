/**
 *
 */
package 练习.MatrixProduct_矩阵乘法与Strassen和幂;

/**
 * @author 柳和(本地)
 *
 */
public class Power004 {

	/**
	 * @param args
	 */
	public static int[][] matrixMultiply(int[][] matrix1, int[][] matrix2) {
		int rows = matrix1.length;
		int cols = matrix2[0].length;
		int[][] result = new int[rows][cols];
		for (int row = 0; row < rows; row++) {// 第一矩阵的行
			for (int col = 0; col < cols; col++) {// 第二矩阵的列
				// todo: 矩阵乘积运算
				for (int i = 0; i < matrix2.length; i++)
					result[row][col] += matrix1[row][i] * matrix2[i][col];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[][] matrix1 = new int[][] { { 2, 3, -1 }, { 6, 1, -2 } };
		int[][] matrix2 = new int[][] { { 4, -5 }, { -3, 0 }, { 1, 2 } };

		int[][] result = matrixMultiply(matrix1, matrix2);

		System.out.println(result[0][0] == -2);
		System.out.println(result[1][0] == 19);
	}

}
