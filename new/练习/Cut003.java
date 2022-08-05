/**
 *
 */
package 练习;

/**
 * @author 柳和(本地)
 *
 */
public class Cut003 {

	/**
	 * @param args
	 */
	// todo: 使用背包问题的解法
	public static int knapsack(int b, int[] w, int[] v, int n) {
		if (n <= 0 || b <= 0) {
			return 0;
		}
		int res = knapsack(b, w, v, n - 1);
		if (w[n] <= b) {
			res = Math.max(res, knapsack(b - w[n], w, v, n - 1) + v[n]);
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int b = 8;
		int[] v = { 1, 3, 7, 11, 15, 16, 17, 21 };
		int[] w = { 1, 2, 3, 4, 5, 6, 7, 10 };
		int n = v.length;
		System.out.println(knapsack(b, w, v, n - 1) == 22);
	}

}
