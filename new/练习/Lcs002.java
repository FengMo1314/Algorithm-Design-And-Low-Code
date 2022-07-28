/**
 * 
 */
package ��ϰ;

/**
 * @author ����(����)
 *
 */
public class Lcs002 {

	/**
	 * @param args
	 */
	/**
	 * �ö�̬�滮����������еĳ���
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
		int[][] c = new int[m+1][n+1];
		// todo: �ö�̬�滮����������еĳ���
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <=n; j++) {
				if (X[i - 1] == Y[j - 1]) {// �±���㿪ʼ�������ǰ���ַ���ͬ���򹫹������еĳ���Ϊ���ַ�ǰ�����������
					c[i][j] = c[i - 1][j - 1] + 1;
				} else {
					if (c[i][j - 1] >= c[i - 1][j]) {// ���������ֵ
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
