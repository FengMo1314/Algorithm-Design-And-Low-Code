/**
 * 
 */
package ��ϰ;

/**
 * @author ����(����)
 *
 */
public class Fib003 {

	/**
	 * @param args
	 */
	public static int fib(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("n cannot be negative");
		}

		// todo: ʹ�õ����Ķ�̬�滮����� n ��쳲�������
		if (n == 1 || n == 2) { // ����������ֿ�����
			return 1;
		}
		int i = 1, j = 1, sum = 0;
		for (int m = 3; m <= n; m++) {
			/*
			 * 쳲��������еĵ�һ��͵ڶ�����1��1���ӵ����ʼÿһ�������Ϊǰ����֮�͡�
			 *  ���Դӵ����ʼ������
			 */
			sum = i + j;// sumΪ��n����ֵ��i ��j �ֱ�Ϊn-2���n-1�
			i = j;
			j = sum;
		}
		return sum;

	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println(fib(1) == 1);
		System.out.println(fib(2) == 1);
		System.out.println(fib(20) == 6765);
	}

}
