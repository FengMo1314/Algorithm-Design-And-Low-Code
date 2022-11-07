/**
 *
 */
package 练习.MatrixProduct_矩阵乘法与Strassen和幂;

/**
 * @author 柳和(本地)
 *
 */
public class Power008 {

	/**
	 * @param args
	 */
	public static int[][] matrixAdd(int[][] m1, int[][] m2) {
		int rows = m1.length;
		int cols = m1[0].length;
		int[][] result = new int[rows][cols];
		// todo: 两个矩阵对应位置的元素的和
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {
				result[i][j] = m1[i][j] + m2[i][j];
			}
		}

		return result;
	}

	public static int[][] matrixSub(int[][] m1, int[][] m2) {
		int rows = m1.length;
		int cols = m1[0].length;
		int[][] result = new int[rows][cols];
		// todo: 两个矩阵对应位置的元素的差
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {
				result[i][j] = m1[i][j] - m2[i][j];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[][] matrix1 = new int[][] { { 2, 3, -1 }, { 6, 1, -2 } };
		int[][] matrix2 = new int[][] { { 4, -5, 1 }, { -3, 0, 2 } };
		int[][] sum = matrixAdd(matrix1, matrix2);
		System.out.println("sum results:");
		System.out.println(sum[0][0] == 6);
		System.out.println(sum[1][0] == 3);
		System.out.println(sum[1][1] == 1);

		int[][] sub = matrixSub(matrix1, matrix2);

		System.out.println("sub results:");
		System.out.println(sub[0][0] == -2);
		System.out.println(sub[1][0] == 9);
		System.out.println(sub[1][1] == 1);
	}

}
