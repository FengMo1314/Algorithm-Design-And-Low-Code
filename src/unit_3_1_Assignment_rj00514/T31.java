/**
 *
 */
package unit_3_1_Assignment_rj00514;

/**
 * @author ����(����)
 *
 */
public class T31 {

	/**
	 * @param args
	 */
	public int fib(long a) {
		if (a == 0 || a == 1) {
			return 1;
		}
		return fib(a - 1) + fib(a - 2);
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		T31 t = new T31();
		System.out.println(t.fib(50));
	}

}
