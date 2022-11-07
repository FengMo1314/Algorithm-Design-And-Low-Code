/**
 *
 */
package 练习;

/**
 * @author 柳和(本地)
 *
 */
public class Lcs001 {

	/**
	 * @param args
	 */
	/**
	 * 用简单递归计算最长子序列的长度
	 *
	 * @param X 字符串X
	 * @param Y 字符串Y
	 * @param m 字符串X的长度
	 * @param n 字符串Y的长度
	 * @return 最长子序列的长度
	 */
	public static int lcs(char[] X, char[] Y, int m, int n) {
		if (m == 0 || n == 0) {
			return 0;
		}

		// todo: 用简单递归计算最长子序列的长度
		int a = 0, b = 0;
		if (X[m - 1] == Y[n - 1])
			return lcs(X, Y, m - 1, n - 1) + 1;
		if (X[m - 1] != Y[n - 1]) {
			a = lcs(X, Y, m - 1, n);
			b = lcs(X, Y, m, n - 1);
			return Math.max(a, b);
		}
		return 0;
	}

	public static int lcs2(char[] X, char[] Y, int m, int n) {
		if (m == 0 || n == 0) {
			return 0;
		}
		// todo: 用简单递归计算最长子序列的长度
		int a = 0, b = 0, c = 0;
		if (X[m - 1] == Y[n - 1]) {
			a = lcs(X, Y, m - 1, n - 1) + 1;
		} else {
			b = lcs(X, Y, m - 1, n);
			c = lcs(X, Y, m, n - 1);
		}
		return Math.max(a, Math.max(b, c));
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(lcs("".toCharArray(), "GXTXAYB".toCharArray(), "".length(), "GXTXAYB".length()) == 0);
		System.out.println(lcs("AGGTAB".toCharArray(), "".toCharArray(), "AGGTAB".length(), "".length()) == 0);
		System.out.println(
				lcs("AGGTAB".toCharArray(), "GXTXAYB".toCharArray(), "AGGTAB".length(), "GXTXAYB".length()) == 4);
		System.out.println(
				lcs("ABCBDAB".toCharArray(), "BDCABA".toCharArray(), "ABCBDAB".length(), "BDCABA".length()) == 4);
		System.out.println(lcs("Googles@Google".toCharArray(), "SearchGoogle".toCharArray(), "Googles@Google".length(),
				"SearchGoogle".length()) == 7);
	}

}
