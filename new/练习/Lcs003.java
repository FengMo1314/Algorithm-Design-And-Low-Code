/**
 *
 */
package 练习;

/**
 * @author 柳和(本地)
 *
 */
public class Lcs003 {

	/**
	 * @param args
	 */
	/**
	 * 最大子序列
	 */
	public static String subString = "";

	/**
	 * 根据标记函数追踪解得到最大子序列
	 *
	 * @param track 标记矩阵
	 * @param X     字符串X
	 * @param i     标记矩阵行坐标
	 * @param j     标记矩阵列坐标
	 */
	public static void getLCS(int[][] track, char[] X, int i, int j) {
		if (i == 0 || j == 0) {
			return;
		}

		// todo: 追踪解得到最大子序列

	}

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

		// todo: 用动态规划计算最长子序列的长度，并保存标记
           return 0;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		subString = "";
		System.out.println(lcs("".toCharArray(), "GXTXAYB".toCharArray(), "".length(), "GXTXAYB".length()) == 0);
		System.out.println(subString.length() == 0);

		subString = "";
		System.out.println(lcs("AGGTAB".toCharArray(), "".toCharArray(), "AGGTAB".length(), "".length()) == 0);
		System.out.println(subString.length() == 0);

		subString = "";
		System.out.println(
				lcs("AGGTAB".toCharArray(), "GXTXAYB".toCharArray(), "AGGTAB".length(), "GXTXAYB".length()) == 4);
		System.out.println(subString.equals("GTAB"));

		subString = "";
		System.out.println(
				lcs("ABCBDAB".toCharArray(), "BDCABA".toCharArray(), "ABCBDAB".length(), "BDCABA".length()) == 4);
		System.out.println(subString.equals("BCBA"));

		subString = "";
		System.out.println(lcs("Googles@Google".toCharArray(), "SearchGoogle".toCharArray(), "Googles@Google".length(),
				"SearchGoogle".length()) == 7);
		System.out.println(subString.equals("eGoogle"));
	}

}
