/**
 * 
 */
package ��ϰ.MatrixProduct_����˷���Strassen����;

/**
 * @author ����(����)
 *
 */
public class Power002 {

	/**
	 * @param args
	 */
	public static int power(int a, int exp) {
        if (exp == 0) {
            return 1;
        }
        if (exp == 1) {
            return a;
        }
        if (exp % 2 == 0) {
            // todo: ���ָ����ż��
        	int count=power(a,exp/2);
        return	count*count;
        } else {
            // todo: ���ָ��������
        	int count=power(a,(exp-1)/2);
        return	count*count*a;
        }
    }
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println(power(2, 0) == 1);
        System.out.println(power(2, 4) == 16);
        System.out.println(power(2, 5) == 32);
	}
}
