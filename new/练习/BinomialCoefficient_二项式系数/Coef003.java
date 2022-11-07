/**
 *
 */
package 练习.BinomialCoefficient_二项式系数;

/**
 * @author 柳和(本地)
 *
 */
public class Coef003 {

	/**
	 * @param args
	 */
	// todo: 用动态规划求 k 项的系数，优化空间复杂度
	private static int binomialCoefficient(int n, int k) {
		int[] memo = new int[k + 1];

		return memo[k];
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(binomialCoefficient(2, 3) == 0);
		System.out.println(binomialCoefficient(2, 0) == 1);
		System.out.println(binomialCoefficient(2, 2) == 1);
		System.out.println(binomialCoefficient(5, 2) == 10);
		System.out.println(binomialCoefficient(10, 5) == 252);
	}

}
