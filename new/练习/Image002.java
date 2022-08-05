/**
 *
 */
package ��ϰ;

/**
 * @author ����(����)
 *
 */
public class Image002 {

	/**
	 * @param args
	 */
	/**
	 * �������ŷֶ�ռ�õ�λ��
	 *
	 * @param p �Ҷ�ֵ����
	 * @param n �Ҷ�ֵ���еĳ���
	 * @return ���ŷֶ�ռ�õ�λ��
	 */
	public static int compress(int[] p, int n) {
		int Lmax = 256;
		int header = 11;
		int[] s = new int[n + 1];
		int[] b = new int[n + 1];
		// todo: �������ŷֶ�ռ�õ�λ��
		s[0] = 0;
		for (int i = 1; i <= n; i++) {
			b[i] = Image001.binaryLength(p[i - 1]);
			int bmax = b[i];
			s[i] = s[i - 1] + bmax;
			for (int j = 2; j <= Math.min(i, Lmax); j++) {
				if (bmax < b[i - j + 1]) {
					bmax = b[i - j + 1];
				}
				if (s[i] > s[i - j] + j * bmax) {// �ҵ����ŷֶ�
					s[i] = s[i - j] + j * bmax;
				}
			}
			s[i] = s[i] + header;
		}
		return s[n];
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[] p = { 6, 5, 7, 5, 245, 180, 28, 28, 19, 22, 25, 20 };
		int n = p.length;
		System.out.println(compress(p, n) == 91);
	}

}
