/**
 *
 */
package ��ϰ;

/**
 * @author ����(����)
 *
 */
public class Lcs001 {

	/**
	 * @param args
	 */
	/**
	 * �ü򵥵ݹ����������еĳ���
	 *
	 * @param X �ַ���X
	 * @param Y �ַ���Y
	 * @param m �ַ���X�ĳ���
	 * @param n �ַ���Y�ĳ���
	 * @return ������еĳ���
	 */
	public static int lcs(char[] X, char[] Y, int m, int n) {
		if (m == 0 || n == 0) {
			return 0;
		}

		// todo: �ü򵥵ݹ����������еĳ���
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
		// todo: �ü򵥵ݹ����������еĳ���
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
		// TODO �Զ����ɵķ������
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
