/**
 *
 */
package ��ϰ;

/**
 * @author ����(����)
 *
 */
public class Lcs003 {

	/**
	 * @param args
	 */
	/**
	 * ���������
	 */
	public static String subString = "";

	/**
	 * ���ݱ�Ǻ���׷�ٽ�õ����������
	 *
	 * @param track ��Ǿ���
	 * @param X     �ַ���X
	 * @param i     ��Ǿ���������
	 * @param j     ��Ǿ���������
	 */
	public static void getLCS(int[][] track, char[] X, int i, int j) {
		if (i == 0 || j == 0) {
			return;
		}

		// todo: ׷�ٽ�õ����������

	}

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

		// todo: �ö�̬�滮����������еĳ��ȣ���������
           return 0;
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
