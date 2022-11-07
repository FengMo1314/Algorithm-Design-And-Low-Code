/**
 *
 */
package 练习.MatrixProduct_矩阵乘法与Strassen和幂;

/**
 * @author 柳和(本地)
 *
 */
public class Power001 {

	/**
	 * @param args
	 */
	public static int power(int a, int power) {
		int output = 1;
		for (int i = 1; i <= power; i++) {
			// todo: 计算 a 的幂
			output = output * a;
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(power(2, 0) == 1);
		System.out.println(power(2, 1) == 2);
		System.out.println(power(2, 5) == 32);
	}

}
