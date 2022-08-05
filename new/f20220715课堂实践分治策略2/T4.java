/**
 *
 */
package f20220715课堂实践分治策略2;

import java.util.Scanner;

/**
 * @author 柳和(本地)
 *
 */
public class T4 {

	/**
	 * @param args
	 */
	static int[][] matrix;
	private static Scanner sc;

	public static void init(int n) {
		matrix = new int[n][n];
	}

	static int[][] base() {
		init(2);
		matrix[0][0] = 1;
		matrix[0][1] = 1;
		matrix[1][0] = 1;
		matrix[1][1] = 0;
		return matrix;
	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.err.println("请输入所求的项数");
		int n = sc.nextInt();
		int[][] fib = base();
		int[][] temp = new int[matrix.length][matrix.length];
		temp = T3.MXX(fib, n);
		T3.print(temp);
		System.out.println("斐波那契数列的f(" + n + ")=" + temp[0][1]);
	}

}
