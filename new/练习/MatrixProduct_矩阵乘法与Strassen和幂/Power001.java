/**
 *
 */
package ��ϰ.MatrixProduct_����˷���Strassen����;

/**
 * @author ����(����)
 *
 */
public class Power001 {

	/**
	 * @param args
	 */
	public static int power(int a, int power) {
		int output = 1;
		for (int i = 1; i <= power; i++) {
			// todo: ���� a ����
			output = output * a;
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println(power(2, 0) == 1);
		System.out.println(power(2, 1) == 2);
		System.out.println(power(2, 5) == 32);
	}

}
