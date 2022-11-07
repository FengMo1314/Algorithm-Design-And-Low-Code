/**
 *
 */
package 练习.FibonacciSequence_斐波那锲数列;

/**
 * @author 柳和(本地)
 *
 */
public class Fib003 {

	/**
	 * @param args
	 */
	public static int fib(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("n cannot be negative");
		}

		// todo: 使用迭代的动态规划，求第 n 个斐波那契数
		if (n == 1 || n == 2) { // 特殊情况，分开讨论
			return 1;
		}
		int i = 1, j = 1, sum = 0;
		for (int m = 3; m <= n; m++) {
			/*
			 * 斐波那契数列的第一项和第二项是1、1，从第三项开始每一项的数字为前两项之和。 所以从第三项开始迭代。
			 */
			sum = i + j;// sum为第n项数值，i 、j 分别为n-2项和n-1项。
			i = j;
			j = sum;
		}
		return sum;

	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(fib(1) == 1);
		System.out.println(fib(2) == 1);
		System.out.println(fib(20) == 6765);
	}

}
