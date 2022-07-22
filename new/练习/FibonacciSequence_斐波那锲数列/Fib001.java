/**
 * 
 */
package 练习.FibonacciSequence_斐波那锲数列;

/**
 * @author 柳和(本地)
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
	        // todo: 使用简单分治，求第 n 个斐波那契数
	        if (n == 1 || n == 2) {             //特殊情况，分开讨论
	            return 1;
	        }
	        if (n > 2) {
	            return fib(n - 1) + fib(n - 2);     //递归调用
	        }
	        return -1;              //如果输入错误的n，一律返回-1
	    }
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		 System.out.println(fib(1) == 1);
	        System.out.println(fib(2) == 1);
	        System.out.println(fib(20) == 6765);
	}

}
