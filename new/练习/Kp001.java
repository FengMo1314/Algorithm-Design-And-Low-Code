/**
 *
 */
package 练习;

import java.util.Arrays;

/**
 * @author 柳和(本地)
 *
 */
public class Kp001 {

	/**
	 * @param args
	 */
	public static int best;
	public static int[] bestSolution;

	/**
	 * 搜索打包方案
	 *
	 * @param capacity 当前可装物品总重量限制
	 * @param value    当前物品总价值
	 * @param idx      当前装的物品
	 * @param x        当前的装载方案
	 * @param w        物品重量
	 * @param v        物品价值
	 * @param n        物品数量
	 */
	public static void knapsack(int capacity, int value, int idx, int[] x, int[] w, int[] v, int n) {

		if (idx < 0 && x[idx] != 0) {
			idx--;
		}
		if (x[idx] == 1) {
			x[idx] = 0;
			capacity = capacity + w[idx];
			value = value - v[idx];
			idx++;
		}
		for (int i = 0; i < idx; i++) {
			if (capacity >= w[idx]) {// 重量限额超过所有物品重量
				capacity = capacity - w[idx];// 更新重量限额
				value = value + v[i];// 当前物品价值增加单个物品价值
				x[idx] = 1;// 标记装载方案
			}
		}
		idx--;
		if (best < value) {// 更新最佳方案的价值
			best = value;
			bestSolution = x.clone();// 更新最优装载方案
		}
		if (idx == 0) {
			return;
		} else {
			knapsack(capacity, value, idx, x, w, v, n);
		}
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int b = 10;
		int[] v = { 1, 3, 5, 9 };
		int[] w = { 2, 3, 4, 7 };
		int n = v.length;
		int[] x = new int[n];

		best = 0;

		knapsack(b, 0, 0, x, w, v, n);

		System.out.println(Arrays.toString(bestSolution));

		System.out.println(best == 12);
		System.out.println(bestSolution[0] == 0);
		System.out.println(bestSolution[1] == 1);
		System.out.println(bestSolution[2] == 0);
		System.out.println(bestSolution[3] == 1);
	}

}
