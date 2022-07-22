/**
 * 
 */
package 练习.BinomialCoefficient_二项式系数;

/**
 * @author 柳和(本地)
 *
 */
public class Coef001 {

	/**
	 * @param args
	 */
	 // todo: 用递归求 k 项的系数
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
		// TODO 自动生成的方法存根
		  System.out.println(binomialCoefficient(2, 3) == 0);
	        System.out.println(binomialCoefficient(2, 0) == 1);
	        System.out.println(binomialCoefficient(2, 2) == 1);
	        System.out.println(binomialCoefficient(5, 2) == 10);
	        System.out.println(binomialCoefficient(10, 5) == 252);
	}

}
