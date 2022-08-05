/**
 *
 */
package 练习;

/**
 * @author 柳和(本地)
 *
 */
public class Sack002 {

	/**
	 * @param args
	 */
	/**
	 * 计算背包内可容纳物品的最大价值
	 *
	 * @param b 背包最大重量限制
	 * @param w 物品重量
	 * @param v 物品价值
	 * @param n 物品的种类
	 * @return 背包内物品的最大价值
	 */
	// todo: 用动态规划计算背包内可容纳物品的最大价值
	public static int knapsack(int b, int[] w, int[] v, int n) {
		int[][] a = new int[n + 1][b + 1];// 声明动态规划表.其中v[i][j]对应于：当前有i个物品可选，并且当前背包的容量为j时，我们能得到的最大价值
		// 填动态规划表。当前有i个物品可选，并且当前背包的容量为j。
		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < b + 1; j++) {
				if (i == 0 || j == 0) {
					a[i][j] = 0;// 初始化边界
				} else {
					if (j < w[i - 1]) {
						a[i][j] = a[i - 1][j];
					} else {
						a[i][j] = Math.max(a[i - 1][j], a[i - 1][j - w[i - 1]] + v[i - 1]);
					}
				}
			}
		}
		return a[n][b];
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int b = 10;
		int[] v = { 1, 3, 5, 9 };
		int[] w = { 2, 3, 4, 7 };
		int n = v.length;
		System.out.println(knapsack(b, w, v, n) == 12);
	}

}
