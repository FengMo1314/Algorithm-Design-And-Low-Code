/**
 *
 */
package 练习;

/**
 * @author 柳和(本地)
 *
 */
public class Image002 {

	/**
	 * @param args
	 */
	/**
	 * 计算最优分段占用的位数
	 *
	 * @param p 灰度值序列
	 * @param n 灰度值序列的长度
	 * @return 最优分段占用的位数
	 */
	public static int compress(int[] p, int n) {
		int Lmax = 256;
		int header = 11;
		int[] s = new int[n + 1];
		int[] b = new int[n + 1];
		// todo: 计算最优分段占用的位数
		s[0] = 0;
		for (int i = 1; i <= n; i++) {
			b[i] = Image001.binaryLength(p[i - 1]);
			int bmax = b[i];
			s[i] = s[i - 1] + bmax;
			for (int j = 2; j <= Math.min(i, Lmax); j++) {
				if (bmax < b[i - j + 1]) {
					bmax = b[i - j + 1];
				}
				if (s[i] > s[i - j] + j * bmax) {// 找到更号分段
					s[i] = s[i - j] + j * bmax;
				}
			}
			s[i] = s[i] + header;
		}
		return s[n];
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] p = { 6, 5, 7, 5, 245, 180, 28, 28, 19, 22, 25, 20 };
		int n = p.length;
		System.out.println(compress(p, n) == 91);
	}

}
