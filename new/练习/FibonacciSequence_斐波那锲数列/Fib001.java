/**
 * 
 */
package ��ϰ.FibonacciSequence_쳲���������;

/**
 * @author ����(����)
 *
 */
public class Fib001 {

	/**
	 * @param args
	 */
	 public static int fib(int n) {
	        if (n < 0) {
	            throw new IllegalArgumentException("n cannot be negative");
	        }
	        // todo: ʹ�ü򵥷��Σ���� n ��쳲�������
	        if (n == 1 || n == 2) {             //����������ֿ�����
	            return 1;
	        }
	        if (n > 2) {
	            return fib(n - 1) + fib(n - 2);     //�ݹ����
	        }
	        return -1;              //�����������n��һ�ɷ���-1
	    }
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		 System.out.println(fib(1) == 1);
	        System.out.println(fib(2) == 1);
	        System.out.println(fib(20) == 6765);
	}

}
