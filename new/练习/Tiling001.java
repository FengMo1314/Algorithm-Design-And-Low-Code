/**
 *
 */
package 练习;

/**
 * @author 柳和(本地)
 *
 */
public class Tiling001 {

	/**
	 * @param args
	 */
	// todo: 使用动态规划计算地砖的铺法
	private static int ways(int n) {
		if (n == 1 || n == 2)
			return n;
		return ways(n - 1) + ways(n - 2);
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(ways(4) == 5);
		System.out.println(ways(3) == 3);
	}

}
