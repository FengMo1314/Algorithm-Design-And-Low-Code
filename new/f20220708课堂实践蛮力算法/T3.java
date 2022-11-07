/**
 *
 */
package f20220708课堂实践蛮力算法;

/**
 * @author 柳和(本地)
 *
 */
public class T3 {

	/**
	 * @param args
	 */
	public long mi(int a, int n) {
		long rest = 1;
		for (int i = 0; i < n; i++) {
			rest = rest * a;
		}
		return rest;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(new T3().mi(2, 3));
//		new T3().mi(2,3);
//
	}

}
