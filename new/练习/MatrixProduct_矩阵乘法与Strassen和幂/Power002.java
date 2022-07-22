/**
 * 
 */
package 练习.MatrixProduct_矩阵乘法与Strassen和幂;

/**
 * @author 柳和(本地)
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
            // todo: 如果指数是偶数
        	int count=power(a,exp/2);
        return	count*count;
        } else {
            // todo: 如果指数是奇数
        	int count=power(a,(exp-1)/2);
        return	count*count*a;
        }
    }
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(power(2, 0) == 1);
        System.out.println(power(2, 4) == 16);
        System.out.println(power(2, 5) == 32);
	}
}
