/**
 *
 */
package 练习;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author 柳和(本地)
 *
 */
public class Loading001 {

	/**
	 * @param args
	 */
	/**
	 * 最优装在方案
	 */
	public static int[] bestSolution;
	/**
	 * 最优装在方案中第一艘船的最小的剩余可装载重量
	 */
	public static int best;

	public static void loading(int[] x, int[] w, int n, int c1, int c2) {// 增强代码健壮性
		int total = 0;
		for (int i = 0; i < n; i++) {
			total += w[i];
		}

		if (total > c1 + c2) {
			System.out.println("No solutions");
			return;
		}

		best = c1;
		loading(c1, 0, x, w, n);

		int c2Total = 0;
		for (int i = 0; i < n; i++) {
			if (bestSolution[i] == 0) {
				c2Total += w[i];
			}
		}

		if (c2Total > c2) {
			System.out.println("No solutions");
		} else {
			System.out.println(c1 - best);
			System.out.println(Arrays.toString(bestSolution));
		}
	}

	/**
	 * 搜索第一艘船最优可装的集装箱方案
	 *
	 * @param c1Capacity 第一艘船的当前可载重量
	 * @param idx        当前装载的集装箱
	 * @param w          各集装箱重量
	 * @param x          当前的装载方案
	 * @param n          集装箱数量
	 */
	// todo: 搜索第一艘船最优可装的集装箱方案
	public static void loading(int c1Capacity, int idx, int[] x, int[] w, int n) {

		// todo: 装载方案

		// todo: 记录最优方案

		// todo: 回溯

		// todo: 搜索剩余方案
		for (int i = 1; i >= 0; i++) {
			if (i == 1) {

				if (is) {
					c1Capacity -= w[idx];
					x[idx] = 1;
				}
			} else {

			}
		}

	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] w = { 90, 80, 40, 30, 20, 12, 10 };
		w = Arrays.stream(w).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();
		int n = w.length;
		int[] x = new int[n];
		int c1 = 152;
		int c2 = 130;

		loading(x, w, n, c1, c2);

		System.out.println(bestSolution[0] == 1);
		System.out.println(bestSolution[1] == 0);
		System.out.println(bestSolution[2] == 1);
		System.out.println(bestSolution[3] == 0);
		System.out.println(bestSolution[4] == 0);
		System.out.println(bestSolution[5] == 1);
		System.out.println(bestSolution[6] == 1);
	}

}
