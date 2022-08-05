/**
 *
 */
package ��ϰ.FibonacciSequence_쳲���������;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ����(����)
 *
 */
public class Fib002 {

	/**
	 * @param args
	 */
	public static Map<Integer, Integer> cache = new HashMap<>();

	public static int fib(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("n cannot be negative");
		}

		// todo: ʹ�õݹ�Ķ�̬�滮����� n ��쳲�������
		if (n == 1 || n == 2) { // ����������ֿ�����
			return 1;
		}
		if (n > 2) {

			cache.put(n, fib(n - 1) + fib(n - 2));// �����¼�ֵ�ԣ���ϣ��������ʡȥ����ԭ�м���ֵ

		}
		return -1; // �����������n��һ�ɷ���-1
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println(fib(1) == 1);
		System.out.println(fib(2) == 1);
		System.out.println(fib(20) == 6765);
	}

}
