/**
 * 
 */
package f20220708课堂实践蛮力算法;

/**
 * @author 柳和(本地)
 *
 */
public class T11 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int s, e, n, d, m, o, r, y, left, right, sum;
		for (s = 1; s <= 9; s++) {
			for (e = 0; e <= 9; e++) {
				for (n = 0; n <= 9; n++) {
					for (d = 0; d <= 9; d++) {
						for (m = 1; m <= 9; m++) {
							for (o = 0; o <= 9; o++) {
								for (r = 0; r <= 9; r++) {
									for (y = 0; y <= 9; y++) {
										left = (s * 1000 + e * 100 + n * 10 + d);
										right = (m * 1000 + o * 100 + r * 10 + e);
										sum = m * 10000 + o * 1000 + n * 100 + e * 10 + y;
										if (left + right == sum) {
											System.out.println(left + "+" + right + "=" + sum);
											System.out.println("S:" + s + ";" + "E:" + e + ";" + "N:" + n + ";" + "D:"
													+ d + ";" + "M:" + m + ";" + "O:" + o + ";" + "R:" + r + ";" + "Y:"
													+ y + ";");
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
