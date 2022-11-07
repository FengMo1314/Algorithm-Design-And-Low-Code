/**
 *
 */
package f20220719课堂实践动态规划1;

/**
 * @author 柳和(本地)
 *
 */
public class T3 {

	/**
	 * @param args
	 */
	private static int ways(int n) {
		if (n == 1 || n == 2)
			return n;
		return ways(n - 1) + ways(n - 2);
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ways(3);
	}

}
