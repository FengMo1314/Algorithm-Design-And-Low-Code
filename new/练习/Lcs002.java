/**
 * 
 */
package 练习;

/**
 * @author 柳和(本地)
 *
 */
public class Lcs002 {

	/**
	 * @param args
	 */
	/**
	 * 用动态规划计算最长子序列的长度
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
		int[][] c = new int[m+1][n+1];
		// todo: 用动态规划计算最长子序列的长度
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <=n; j++) {
				if (X[i - 1] == Y[j - 1]) {// 下标从零开始，如果当前的字符相同，则公共子序列的长度为该字符前的最长公共序列
					c[i][j] = c[i - 1][j - 1] + 1;
				} else {
					if (c[i][j - 1] >= c[i - 1][j]) {// 两者找最大值
						c[i][j] = c[i][j - 1];
					} else {
						c[i][j] = c[i - 1][j];
					}
				}
			}
		}
		return c[m][n];
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
