/**
 * 
 */
package ��ϰ.BinomialCoefficient_����ʽϵ��;

/**
 * @author ����(����)
 *
 */
public class Coef001 {

	/**
	 * @param args
	 */
	 // todo: �õݹ��� k ���ϵ��
    private static int binomialCoefficient(int n, int k) {
        if(n<0||k>n) {
        	return 0;
        }
        if(n==0||n==1||k==0) {
        	return 1;
        }
        return binomialCoefficient(n-1,k-1)+binomialCoefficient(n-1,  k);
    }
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		  System.out.println(binomialCoefficient(2, 3) == 0);
	        System.out.println(binomialCoefficient(2, 0) == 1);
	        System.out.println(binomialCoefficient(2, 2) == 1);
	        System.out.println(binomialCoefficient(5, 2) == 10);
	        System.out.println(binomialCoefficient(10, 5) == 252);
	}

}
