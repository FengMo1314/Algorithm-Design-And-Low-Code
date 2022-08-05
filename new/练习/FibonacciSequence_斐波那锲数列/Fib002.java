/**
 *
 */
package 练习.FibonacciSequence_斐波那锲数列;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 柳和(本地)
 *
 */
public class Fib002 {

	/**
	 * @param args
	 */
	public static Map<Integer, Integer> cache = new HashMap<>();

	public static int fib(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("n cannot be negative");
		}

		// todo: 使用递归的动态规划，求第 n 个斐波那契数
		if (n == 1 || n == 2) { // 特殊情况，分开讨论
			return 1;
		}
		if (n > 2) {

			cache.put(n, fib(n - 1) + fib(n - 2));// 储存新键值对，哈希表本身特性省去计算原有键的值

		}
		return -1; // 如果输入错误的n，一律返回-1
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(fib(1) == 1);
		System.out.println(fib(2) == 1);
		System.out.println(fib(20) == 6765);
	}

}
